package org.example;

import java.util.Scanner;

public class Game {

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Macera oyununa hoş geldiniz ! ");
        System.out.print("Lütfen bir isim giriniz : ");


        //String playerName=scanner.nextLine();

        Player player = new Player("Uğur");
        System.out.println(player.getName() + " hoşgeldiniz.");
        System.out.print("Lütfen bir karakter seçiniz.");
        player.selectChar();

        Location location = null;
        while (true) {
            player.printPlayerInfo();
            System.out.println();
            System.out.println("Bölgeler");
            System.out.println();
            System.out.println("1 - Güvenli ev");
            System.out.println("2 - Mağaza");
            System.out.println("3 - Mağraya gir ! Ödül<Yemek> Dikkatli ol canavar çıkabilir.");
            System.out.println("4 - Ormana gir ! Ödül<Odun> Dikkatli ol canavar çıkabilir.");
            System.out.println("5 - Nehir gir ! Ödül<Su> Dikkatli ol canavar çıkabilir.");
            System.out.println("0 - Çıkış yap");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz : ");

            int seletLoc = scanner.nextInt();
            switch (seletLoc) {
                case 0:
                    location=null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                default:
                    location = new SafeHouse(player);

            }
            if (location==null){
                System.out.println("Yine bekleriz :)");
                break;
            }
            if (!location.onLocation() ) {
                System.out.println("Game Over");
                break;
            }
        }

    }

}
