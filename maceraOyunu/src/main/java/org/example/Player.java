package org.example;

import java.util.Scanner;

public class Player {
    private int damage;
    private int healty;
    private int money;
    private String name;
    private String charName;
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory=new Inventory();
    }

    Scanner scanner = new Scanner(System.in);


    public void selectChar() {

        GameChar[] chars = {new Samurai(), new Archer(),new Knight() };
        System.out.println("--------------------------");
        for (GameChar aChar : chars) {
            //System.out.println("----------------------------------------------------------------------");
            System.out.println("ID : "+aChar.getId()+" Karakter: " + aChar.getName() + "\t Hasar : " + aChar.getDamege() + "\t Sağlık : " + aChar.getHealth() + "\t Para\t : " + aChar.getMoney());
        }
        System.out.println("--------------------------");
        System.out.print("Lütfen bir karakter giriniz : ");


        int selectChar = scanner.nextInt();

        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
                break;
        }
        System.out.println("Karakter : "+this.getCharName());
    }


    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamege());
        this.setHealty(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }

    public void printPlayerInfo(){
        System.out.println("Silahınız : "+getInventory().getWepon().getName()
                +" Zırhınız : "+getInventory().getArmor().getName()
                +" Blok : "+getInventory().getArmor().getBlock()
                +" Hasarınız : "+getDamage()
                +" Sağlık : "+getHealty()
                +" Para : "+getMoney());

    }

    public int getDamage() {
        return damage+this.getInventory().getWepon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
