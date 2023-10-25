package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws Exception {
        if(age<18){
            throw new AgeCheckException("Yaşınız tutmuyor.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Yaşınızı giriniz : ");
        int age= scanner.nextInt();

        try {
            checkAge(age);
        }catch (Exception e){
            System.out.println("Yaşı uymadı.");
            System.out.println(e.toString());
        }
    }
}