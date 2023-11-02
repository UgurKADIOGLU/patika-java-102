package org.example;

import java.util.*;

public class Main {
    public static void main(java.lang.String[] args) {
        Scanner scanner=new Scanner(System.in);

        Marka marka=new Marka();
        CepTelefonu cepTelefonu=new CepTelefonu();
        Laptop laptop=new Laptop();
        boolean cikis=false;
        while (!(cikis)){
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz : ");
            int menuSecim=scanner.nextInt();
        switch (menuSecim){
            case 1:
                System.out.println("1 - (Laptop) Ürün ekle");
                System.out.println("2 - (Laptop) Ürün listele");
                System.out.println("3 - (Laptop) Ürün Sil");
                int notBookMenuSecim=scanner.nextInt();
                if(notBookMenuSecim==1){
                    laptop.urunEkle();
                } else if (notBookMenuSecim==2) {
                    laptop.urunler();
                }else if (notBookMenuSecim==3) {
                    System.out.println("Ürünün id sini girinz.");
                    int id=scanner.nextInt();
                    laptop.urunSil(id);
                }
                break;
            case 2:
                System.out.println("1 - (Cep Telefonu) Ürün ekle");
                System.out.println("2 - (Cep Telefonu) Ürün listele");
                System.out.println("3 - (Cep Telefonu) Ürün Sil");
                int cepTelefonuMenuSecim=scanner.nextInt();
                if(cepTelefonuMenuSecim==1){
                    cepTelefonu.urunEkle();
                } else if (cepTelefonuMenuSecim==2) {
                    cepTelefonu.urunler();
                }else if (cepTelefonuMenuSecim==3) {
                    System.out.println("Ürünün id sini girinz.");
                    int id=scanner.nextInt();
                    cepTelefonu.urunSil(id);
                }
                break;
            case 3:
                marka.printMarkaList();
                break;
            case 0:
                cikis=true;
        }
        }

    }
}