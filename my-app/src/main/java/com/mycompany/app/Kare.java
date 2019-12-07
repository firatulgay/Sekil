package com.mycompany.app;

/**
 * Created by FiratUlgay on 5.12.2019.
 */
public class Kare extends Sekil implements KosegenUzunluguHesaplanabilir  {

    @Override
    public int getKenarSayisi() {
        return 4;
    }

    @Override
    public int CevreHesapla() {
        int Cevre = getKenarSayisi()*getBirKenarUzunlugu();
        return Cevre;
    }

    @Override
    public int alanHesapla() {
        return 0;}

    @Override
    public int kosegenUzunluguHesapla() {
       int kenarUzunlugu =  getBirKenarUzunlugu();
        int kosegen = kenarUzunlugu*kenarUzunlugu;
        return kosegen;
    }
}




