package com.mycompany.app;

/**
 * Created by FiratUlgay on 5.12.2019.
 */
public abstract class Sekil {


    private int kenarSayisi;
    private int birKenarUzunlugu;
    private int Alan;

    public abstract int CevreHesapla();

    public abstract int alanHesapla();


String adi ;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getKenarSayisi() {
        return kenarSayisi;
    }



    public int getBirKenarUzunlugu() {
        return birKenarUzunlugu;
    }

    public void setBirKenarUzunlugu(int birKenarUzunlugu) {
        this.birKenarUzunlugu = birKenarUzunlugu;
    }

    public int getAlan() {
        return Alan;
    }

}