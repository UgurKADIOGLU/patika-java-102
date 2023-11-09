package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdresManager {
    User user = new User();
    List<IAdres> adress;


    public void adresEkle() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("İş adresi eklemek için *1* e basın");
        System.out.println("Ev adresi eklemek için *2* ye basın");

        int secim=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Adresi giriniz : ");
        String adresEkle=scanner.nextLine();

        switch (secim){
            case 1:
                IAdres businessAdress=new BusinessAddress(adresEkle);
                //List<IAdres> adress=new ArrayList<>();
                adress=user.getAdres();
                adress.add(businessAdress);
                user.setAdres(adress);
                user.getAdres();
            case 2:
                IAdres homeAdress=new HomeAddress(adresEkle);
                //List<IAdres> adress=new ArrayList<>();
                adress=user.getAdres();
                adress.add(homeAdress);
                user.setAdres(adress);
                user.getAdres();
        }
        //user.setAdres((List<IAdres>) adres);
    }


    public void adresSil() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Silmek istediğiniz adresin indexini giriniz.");
        int index=scanner.nextInt();
        adress=user.getAdres();
        adress.remove(index);
        user.getAdres();
    }
}
