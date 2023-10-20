package org.example;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoş geldiniz.");
        boolean showMenu=true;
        while (showMenu){
        System.out.println("1 - Silahlar");
        System.out.println("2 - Zıhlar");
        System.out.println("3 - Çıkış yap");
        System.out.print("Seçiminiz : ");
        int selecet = scanner.nextInt();
        while (selecet < 1 || selecet > 3) {
            System.out.println("Geçersiz bir seçim yaptınız");
            selecet = scanner.nextInt();
        }
        switch (selecet) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                buyArmor();
                break;
            case 3:
                System.out.println("Bir daha bekleriz.");
                showMenu=false;

        }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("-----Silahlar-----");
        System.out.println();
        for (Wepon wepon : Wepon.wepons()
        ) {
            System.out.println(wepon.getId() + "-" + wepon.getName() + "-> Para : " + wepon.getPrice() + " Hasar : " + wepon.getDamage());
        }
        System.out.println("0 - Çıkış yap.");

    }

    public void buyWeapon() {
        System.out.print("Bir silah seçiniz : ");
        int selectWeapon = scanner.nextInt();
        while (selectWeapon < 0 || selectWeapon > 3) {
            System.out.println("Geçersiz bir seçim yaptınız");
            selectWeapon = scanner.nextInt();
        }
        if (selectWeapon != 0) {
            Wepon selectedWeapon = Wepon.getWeaponObjById(selectWeapon);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız.");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : " + getPlayer().getMoney());
                    System.out.println(this.getPlayer().getInventory().getWepon().getName());
                    this.getPlayer().getInventory().setWepon(selectedWeapon);
                    System.out.println(this.getPlayer().getInventory().getWepon().getName());
                }
            }
        }
    }
    public void printArmor() {
        System.out.println("-----Zırhlar-----");
        System.out.println();
        for (Armor armor : Armor.armors()
        ) {
            System.out.println(armor.getId() + " - " + armor.getName() + "-> Para : " + armor.getPrice() + " Blok : " + armor.getBlock());
        }
        System.out.println("0 - Çıkış");
    }

    public void buyArmor(){
        System.out.print("Bir zırh seçiniz : ");
        int selectAror = scanner.nextInt();
        while (selectAror < 0 || selectAror > 3) {
            System.out.println("Geçersiz bir seçim yaptınız");
            selectAror = scanner.nextInt();

        }
        if (selectAror!=0){
        Armor selectedArmor = Armor.getArmorObjById(selectAror);

        if (selectedArmor != null) {
            if (selectedArmor.getPrice() > getPlayer().getMoney()) {
                System.out.println("Yeterli paranız bulunmamaktadır.");
            } else {
                System.out.println(selectedArmor.getName() + " zırhını satın aldınız.");
                int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız : " + getPlayer().getMoney());
                System.out.println(this.getPlayer().getInventory().getArmor().getName());
                this.getPlayer().getInventory().setArmor(selectedArmor);
                System.out.println(this.getPlayer().getInventory().getArmor().getName());
            }
        }
    }
}}
