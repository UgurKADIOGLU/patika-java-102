package org.example;

import java.util.Locale;
import java.util.Random;

public class BattleLoc extends Location {
    private Monster monster;
    private String award;
    private int maxMonster;

    public BattleLoc(Player player, String name, Monster monster, String award, int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    public boolean onLocation() {
        int monsterNumber = this.randomMonsterNum();

        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatli ol ! Burada " + monsterNumber + " tane " + this.getMonster().getName() + " yaşyor.");
        System.out.print("<S>avaş veya <K>aç : ");
        String selectBattleCase = scanner.nextLine();
        selectBattleCase = selectBattleCase.toUpperCase();
        if (selectBattleCase.equals("S")) {
            if(commbat(monsterNumber)){
                System.out.println(this.getName()+" tüm düşmanları yendiniz !");
                return true;
            }
        }
        if (this.getPlayer().getHealty()<0){
            System.out.println("Öldünüz !");
            return false;
        }
        return true;
    }

    public boolean commbat(int monsterNumber) {
        for (int i = 1; i <= monsterNumber; i++) {
            this.getMonster().setHealth(this.getMonster().getDefHealth());
            playerStats();
            monsterStats();
            while (this.getPlayer().getHealty()>0 && this.getMonster().getHealth()>0){
                System.out.println("<V>ur veya <K>aç");
                String selectCombat=scanner.nextLine().toUpperCase();
                if (selectCombat.equals("V")){
                    System.out.println("Siz vurdunuz !");
                    monster.setHealth(this.getMonster().getHealth()-this.getPlayer().getDamage());
                    afterHit();
                    if (this.getMonster().getHealth()>0){
                        System.out.println();
                        System.out.println("Canavar size vurdu !");
                        int monsterDamage=this.getMonster().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                        if(monsterDamage<0){
                            monsterDamage=0;
                        }
                        this.getPlayer().setHealty(this.getPlayer().getHealty()-monsterDamage);
                        afterHit();
                    }
                }
            }
        }
        return false;
    }
    public void afterHit(){
        System.out.println("Canınız : "+this.getPlayer().getHealty());
        System.out.println(this.getMonster().getName()+" Canı : "+this.getMonster().getHealth());
        System.out.println();
    }

    public void playerStats() {
        System.out.println("Oyuncu değerleri");
        System.out.println("-------------------------------");
        System.out.println("Sağlık : "+this.getPlayer().getHealty());
        System.out.println("Silah : "+this.getPlayer().getInventory().getWepon().getName());
        System.out.println("Zırh : "+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Blok : "+this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Hasar : "+this.getPlayer().getDamage());
        System.out.println("Para : "+this.getPlayer().getMoney());
    }
    public void monsterStats(){
        System.out.println(this.getMonster().getName()+" Değerleri");
        System.out.println("--------------------------------------------");
        System.out.println("Sağlık : "+this.getMonster().getHealth());
        System.out.println("Hasar : "+this.getMonster().getDamage());
        System.out.println("Ödülü : "+this.getMonster().getAward());
    }

    public int randomMonsterNum() {
        Random r = new Random();
        return r.nextInt(this.getMaxMonster()) + 1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
}
