package org.example;

public class BusinessAddress implements IAdres {
    String adres;
    User user;

    public BusinessAddress(String adres) {
        this.adres = adres;
    }

    public BusinessAddress() {
    }

    //User user = new User();

    @Override
    public void showAdress() {

    }
}
