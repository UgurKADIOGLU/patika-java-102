package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final String terminalId="123456";
        final String password="123456";

        System.out.print("Son kullanım tarhi giriniz : ");
        String expiredDate=scanner.nextLine();

        System.out.print("Güvenlik kodunu giriniz : ");
        String cvc=scanner.nextLine();

        System.out.print("Kart no giriniz : ");
        String kartNo=scanner.nextLine();

        System.out.print("Tutar giriniz : ");
        double price= scanner.nextDouble();

        System.out.println("1. A Bankası");
        System.out.println("2. B Bankası");
        System.out.println("3. C Bankası");
        System.out.println("Banka seçin : ");
        int selectBank= scanner.nextInt();

        switch (selectBank){
            case 1:
                Abankasi aPos=new Abankasi("A Bankası","123456","123456");
                aPos.connect("127");
                aPos.paymend(15,"0000 0000 0000 0000","23","061");
                break;
            default:
                System.out.println("GGeçerli banka giriniz : ");
        }


    }
}
