package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String isim;
    private String soyisim;
    private String email;
    private String sifre;
    private String meslek;
    private int yas;
    private List<IAdres> adres =new ArrayList<>();
    private Date sonGirisTarihi;

    public User(String isim, String soyisim, String email, String sifre, String meslek, int yas, List<IAdres> adres, Date sonGirisTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.sifre = sifre;
        this.meslek = meslek;
        this.yas = yas;
        this.adres = adres;
        this.sonGirisTarihi = sonGirisTarihi;
    }

    public User() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public List<IAdres> getAdres() {
        return adres;
    }

    public void setAdres(List<IAdres> adres) {
        this.adres = adres;
    }

    public Date getSonGirisTarihi() {
        return sonGirisTarihi;
    }

    public void setSonGirisTarihi(Date sonGirisTarihi) {
        this.sonGirisTarihi = sonGirisTarihi;
    }
}
