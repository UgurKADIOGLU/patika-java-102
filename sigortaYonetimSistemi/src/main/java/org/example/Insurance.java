package org.example;

import java.util.Date;

public abstract class Insurance {
    String sigortaninIsmi;
    double sigortaninUcreti;
    Date sigortaninBaslangicBitisTarihi;
    public abstract void calculate();

}
