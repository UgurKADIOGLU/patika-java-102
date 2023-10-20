package org.example;

public class Wepon {
    private String name;
    private int id;
    private int damage;
    private int price;

    public Wepon(String name, int id, int damage, int price) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }



    public static Wepon[] wepons(){
        Wepon[] wepons=new Wepon[3];
        wepons[0]=new Wepon("Tabanca",1,2,15);
        wepons[1]=new Wepon("Kılıç",2,3,35);
        wepons[2]=new Wepon("Tüfek",3,7,45);
        return wepons;
    }

    public static Wepon getWeaponObjById(int id){
        for (Wepon w:Wepon.wepons()
             ) {
            if(w.getId()==id){
                return w;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
