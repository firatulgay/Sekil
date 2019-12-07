package com.mycompany.app;

/**
 * Created by FiratUlgay on 5.12.2019.
 */
public class Ucgen extends Sekil  {

    private UcgenTipi ucgenTipi;
    private int yukseklik;
    private int tabanAlani;
    private int kenar1;
    private int kenar2;
    private int kenar3;



    @Override
    public int getKenarSayisi() {
        return 3;
    }

    @Override
    public int CevreHesapla() {
        int cevre = getKenar1()+getKenar2()+ getKenar3();
            return cevre;
        }



    @Override
    public int alanHesapla() {
        int Alan1 = getAlan();
        Alan1 = (tabanAlani*yukseklik);
        int Alan2 = Alan1 / 2;
        return Alan2;
    }


    public UcgenTipi getUcgenTipi() {
        return ucgenTipi;
    }

    public void setUcgenTipi(UcgenTipi ucgenTipi) {
        this.ucgenTipi = ucgenTipi;
    }

    public int getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(int yukseklik) {
        this.yukseklik = yukseklik;
    }
    public int getTabanAlani() {
        return tabanAlani;
    }

    public void setTabanAlani(int tabanAlani) {
        this.tabanAlani = tabanAlani;
    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }

    public int getKenar3() {
        return kenar3;
    }

    public void setKenar3(int kenar3) {
        this.kenar3 = kenar3;
    }
}
