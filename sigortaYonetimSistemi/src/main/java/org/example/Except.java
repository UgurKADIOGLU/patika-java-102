package org.example;

public class Except extends Exception{
    public Except(String message) {
        super(message);
        System.out.println("Yaş hatası alaındı.");
    }
}
