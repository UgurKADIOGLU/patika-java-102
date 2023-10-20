package org.example;

public class Inventory {
    private Wepon wepon;
    private Armor armor;

    public Inventory() {
        this.wepon = new Wepon("Yumruk",-1,0,0);
        this.armor=new Armor(-1,"Yok",0,0);
    }

    public Wepon getWepon() {
        return wepon;
    }

    public void setWepon(Wepon wepon) {
        this.wepon = wepon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
