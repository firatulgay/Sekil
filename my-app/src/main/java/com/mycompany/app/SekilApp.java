package com.mycompany.app;

import java.util.Scanner;

/**
 * Created by FiratUlgay on 5.12.2019.
 */
public class SekilApp {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Sekil ucgen = new Ucgen() ;

        System.out.println("işlem seçiniz:");
        System.out.println("1. Ucgen Cevre Hesaplama");
        System.out.println("2. Kare Cevre Hesaplama");
        System.out.println("3. Kare Kosegen Hesaplama");
        System.out.println("4. Ucgen Alan Hesaplama");

        int secim = scan.nextInt();

        if (secim == 1){
            UcgenCevreHesapla(scan, (Ucgen) ucgen);
        }
        else if (secim == 2){
            KareCevreHesapla();
        }
        else if (secim == 3){
            KareKosegenUzunluguHesapla();

        }
        else if (secim == 4){
            UcgenAlanHesapla();

        }
        else {
            System.out.println("hatalı seçim,programı tekrar çalıştır...");
        }

        }

    private static void UcgenAlanHesapla() {

        Ucgen ucgen = new Ucgen();

        System.out.println("üçgen taban alanı giriniz");
        Scanner scan = new Scanner(System.in);
        int tabanAlani = scan.nextInt();
        ucgen.setTabanAlani(tabanAlani);

        System.out.println("üçgen yüksekliği giriniz");
        int yukseklik = scan.nextInt();
        ucgen.setYukseklik(yukseklik);
        int ucgenAlani = ucgen.alanHesapla();

        System.out.println("üçgenin alanı = "+ ucgenAlani );
    }

    private static void KareKosegenUzunluguHesapla() {

        Kare kare = new Kare();
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Kenar Uzunlugu Giriniz");
        int kenarUzunlugu = scan.nextInt();
        kare.setBirKenarUzunlugu(kenarUzunlugu);
        int kosegenUzunlugu = kare.kosegenUzunluguHesapla();
        System.out.println("Karenin kosegen uzunlugu "+ kosegenUzunlugu + " sayısının kare köküne eşittir.");




    }

    private static void KareCevreHesapla() {

        Sekil kare = new Kare();
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir Kenar Uzunluğunu Giriniz");
        int kenarUzunlugu = scan.nextInt();
        kare.setBirKenarUzunlugu(kenarUzunlugu);
        int kenarSayisi = kare.getKenarSayisi();
        int kareCevresi = kare.CevreHesapla();
        System.out.println("karenin çevresi ="+ kareCevresi);

    }

    private static void UcgenCevreHesapla(Scanner scan, Ucgen ucgen) {

        System.out.println("Birinci Kenar Uzunluğunu Giriniz");
        int kenarUzunlugu1 = scan.nextInt();
        ucgen.setKenar1(kenarUzunlugu1);

        System.out.println("İkinci Kenar Uzunluğunu Giriniz");
        int kenarUzunlugu2 = scan.nextInt();
        ucgen.setKenar2(kenarUzunlugu2);

        System.out.println("Üçüncü Kenar Uzunluğunu Giriniz");
        int kenarUzunlugu3 = scan.nextInt();
        ucgen.setKenar3(kenarUzunlugu3);

        int ucgenCevresi = ucgen.CevreHesapla();
        System.out.println("ucgenin cevresi = " + ucgenCevresi);
    }




}
