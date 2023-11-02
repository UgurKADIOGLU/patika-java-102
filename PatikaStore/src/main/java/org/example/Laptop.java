package org.example;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laptop extends Urun{
    public Laptop(int id, double fiyat, double indirimOrani, String urunAdi, Marka marka, int ram, double ekranBouyutu, int depolama) {
        super(id, fiyat, indirimOrani, urunAdi, marka, ram, ekranBouyutu);
        this.depolama = depolama;

    }

    public Laptop() {
        super(1, 0, 0, "", new Marka(), 0, 0);
    }

    private int depolama;

    public List<Laptop> laptops=new ArrayList<>();
    public void urunler() {
        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf(" Laptop Listesi          %n");


        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4s | %4s | %4s | %4s | %4s | %4s |%n", "Marka", "Ürün Adı","ID","Fiyat","İndrim Oranı","RAM","Ekran","Depolama");
        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
        for (Laptop l : laptops
        ) {
            System.out.printf("| %-10s | %-8s | %4s | %4s | %4s | %4s | %4s | %4s |%n", l.getMarka().getName(),l.getUrunAdi(),l.getId(),l.getFiyat(),l.getIndirimOrani(),l.getRam(),l.getEkranBoyutu(),l.getDepolama());
        }
    }
    public void urunEkle() {

        Scanner scanner=new Scanner(System.in);
        Marka marka=new Marka();

        System.out.println("Lütfen marka giriniz.");
        String markaIsim=scanner.nextLine();
        marka=marka.getMarka(markaIsim);

        System.out.println("Lütfen ürün adı giriniz.");
        String urunAdi=scanner.nextLine();

        System.out.println("Lütfen id giriniz.");
        int id=scanner.nextInt();

        System.out.println("Lütfen fiyat giriniz.");
        double fiyat=scanner.nextDouble();

        System.out.println("Lütfen indirim oranı giriniz.");
        double indirimOrani=scanner.nextDouble();

        System.out.println("Lütfen ram giriniz.");
        int ram=scanner.nextInt();

        System.out.println("Lütfen ekran boyutu giriniz.");
        double ekranBouyutu=scanner.nextDouble();

        System.out.println("Lütfen depolama giriniz.");
        depolama=scanner.nextInt();


        Laptop laptop = new Laptop(id, fiyat, indirimOrani, urunAdi, marka, ram, ekranBouyutu,depolama);
        laptops.add(laptop);
    }
    public void urunSil(int id){
        for (Laptop c : laptops
        ) {
            if(c.getId()==id){
                laptops.remove(c);
                break;
            }
        }

    }

    public int getDepolama() {
        return depolama;
    }

    public void setDepolama(int depolama) {
        this.depolama = depolama;
    }





}
