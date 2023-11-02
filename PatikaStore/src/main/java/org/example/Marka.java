package org.example;

import java.util.Comparator;
import java.util.TreeSet;

public class Marka {
    private int id;
    private String name;
    TreeSet<Marka> markas = new TreeSet<>(new Comparator<Marka>() {
        @Override
        public int compare(Marka o1, Marka o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });
    public void addMarka(Marka marka){
        markas.add(marka);
    }

    public TreeSet<Marka> printMarkaList(){

        markas.add(new Marka(1, "Samsung"));
        markas.add(new Marka(2, "Lenovo"));
        markas.add(new Marka(3, "Apple"));
        markas.add(new Marka(4, "Huawei"));
        markas.add(new Marka(5, "Casper"));
        markas.add(new Marka(6, "Asus"));
        markas.add(new Marka(7, "HP"));
        markas.add(new Marka(8, "Xiaomi"));
        markas.add(new Marka(9, "Monster"));
        System.out.println("Markalarımız");
        System.out.println("-------------------------");
        for (Marka a:markas
        ) {
            System.out.println(a.getName());
        }
return markas;
    }

    public Marka(int id, java.lang.String name) {
        this.id = id;
        this.name = name;
    }

    public Marka() {
        markas.add(new Marka(1, "Samsung"));
        markas.add(new Marka(2, "Lenovo"));
        markas.add(new Marka(3, "Apple"));
        markas.add(new Marka(4, "Huawei"));
        markas.add(new Marka(5, "Casper"));
        markas.add(new Marka(6, "Asus"));
        markas.add(new Marka(7, "HP"));
        markas.add(new Marka(8, "Xiaomi"));
        markas.add(new Marka(9, "Monster"));
    }

    public Marka getMarka(String name){
        Marka b=new Marka();
        for (Marka a:markas
        ) {if(name.equals(a.getName())){
            b=a;
        }
        }

        return b;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}
