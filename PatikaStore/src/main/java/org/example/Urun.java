package org.example;
import java.lang.String;

public class Urun {
    private int id;
    private double fiyat;
    private double indirimOrani;
    private String urunAdi;
    private Marka marka;
    private int ram;
    private double ekranBoyutu;

    public Urun(int id, double fiyat, double indirimOrani, String urunAdi, Marka marka, int ram, double ekranBoyutu) {
        this.id = id;
        this.fiyat = fiyat;
        this.indirimOrani = indirimOrani;
        this.urunAdi = urunAdi;
        this.marka = marka;
        this.ram = ram;
        this.ekranBoyutu = ekranBoyutu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public double getIndirimOrani() {
        return indirimOrani;
    }

    public void setIndirimOrani(double indirimOrani) {
        this.indirimOrani = indirimOrani;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


}
