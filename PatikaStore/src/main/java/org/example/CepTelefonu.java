package org.example;
import java.lang.String;
import java.util.*;

public class CepTelefonu extends Urun {

    public CepTelefonu(int id, double fiyat, double indirimOrani, String urunAdi, Marka marka, int ram, double ekranBoyutu, int pilGucu, String renk) {
        super(id, fiyat, indirimOrani, urunAdi, marka, ram, ekranBoyutu);
        this.pilGucu = pilGucu;
        this.renk = renk;
    }

    public CepTelefonu() {
        super(0, 0, 0, "", new Marka(), 0, 0);
    }

    private int pilGucu;
    private String renk;
    public List<CepTelefonu> cepTelefonus=new ArrayList<CepTelefonu>() ;

    public void urunEkle() {
        Scanner scanner=new Scanner(System.in);
        Marka marka=new Marka();
        System.out.println("Lütfen marka giriniz.");
        String markaIsim=scanner.nextLine();
        marka=marka.getMarka(markaIsim);

        System.out.println("Lütfen ürün adı giriniz.");
        String urunAdi=scanner.nextLine();

        System.out.println("Lütfen renk giriniz.");
        renk=scanner.nextLine();

        System.out.println("Lütfen id giriniz.");
        int id=scanner.nextInt();

        System.out.println("Lütfen fiyat giriniz.");
        double fiyat=scanner.nextDouble();

        System.out.println("Lütfen indirim oranı giriniz.");
        double indirimOrani=scanner.nextDouble();

        System.out.println("Lütfen ram giriniz.");
        int ram=scanner.nextInt();

        System.out.println("Lütfen ekran boyutu giriniz.");
        double ekranBoyutu=scanner.nextDouble();

        System.out.println("Lütfen pil gücü giriniz.");
        pilGucu=scanner.nextInt();



        CepTelefonu cepTelefonu = new CepTelefonu(id, fiyat, indirimOrani, urunAdi, marka, ram, ekranBoyutu, pilGucu, this.renk);
        cepTelefonus.add(cepTelefonu);
    }

    public void urunler() {
        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf(" Cep Telefonu Listesi          %n");


        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4s | %4s | %4s | %4s | %4s | %4s |%n", "ID", "Ürün Adı", "Fiyat","Marka","Ekran","Pil","RAM","Renk");
        System.out.printf("----------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
        for (CepTelefonu c : cepTelefonus
        ) {
            System.out.printf("| %-10s | %-8s | %4s | %4s | %4s | %4s | %4s | %4s |%n", c.getId(), c.getUrunAdi()  ,c.getFiyat(),c.getMarka().getName(),c.getEkranBoyutu(),getPilGucu(),c.getRam(),c.getRenk());
        }
    }
    public void urunSil(int id){
        for (CepTelefonu c : cepTelefonus
        ) {
            if(c.getId()==id){
                cepTelefonus.remove(c);
                break;
            }
        }

    }


    public int getPilGucu() {
        return pilGucu;
    }

    public void setPilGucu(int pilGucu) {
        this.pilGucu = pilGucu;
    }

    public java.lang.String getRenk() {
        return renk;
    }

    public void setRenk(java.lang.String renk) {
        this.renk = renk;
    }
}
