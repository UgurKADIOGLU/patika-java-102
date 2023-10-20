package org.example;

public interface IBanka {
    final String hostIpAddress="127.0.0.1";
    boolean connect(String ipAddress);
    boolean paymend(double price,String cardNumber,String expiredDate,String cvc);
}
