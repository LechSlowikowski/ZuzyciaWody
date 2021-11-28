package com.company;

/********************************************************
 * nazwa klasy: ZuzyciaWody
 * atrybuty klasy:  zuzycia - tablica przechowująca zużycia
 *                  iloscMiesiecy - liczba miesięcy, w których rejestrujemy zużycia
 * opis: Klasa wykonująca operacje na zużyciach wody
 * autor: 67890123456
 * ****************************************************/
public class ZuzyciaWody {
    private float[] zuzycia;
    private int iloscMiesiecy;

    /********************************************************
     * nazwa funkcji: ZuzyciaWody - konstruktor
     * parametry wejściowe: zuzycia - tablica przechowująca zużycia
     *                      iloscMiesiecy - liczba miesięcy, w których rejestrujemy zużycia
     * wartość zwracana: brak
     * autor: 67890123456
     * ****************************************************/
    public ZuzyciaWody(float[] zuzycia, int iloscMiesiecy) {
        this.iloscMiesiecy = iloscMiesiecy;
        this.zuzycia = zuzycia;
    }

    /********************************************************
     * nazwa funkcji: znajdzMiesiacMinZuzycia
     * parametry wejściowe: brak
     * wartość zwracana: miesiąc, w którym było najmniejsze zużycie wody
     * autor: 67890123456
     * ****************************************************/
    public int znajdzMiesiacMinZuzycia() {
        int miesiacMin = 0;
        for (int i = 0; i < iloscMiesiecy; i++) {
            if (zuzycia[i] < zuzycia[miesiacMin]) {
                miesiacMin = i;
            }
        }
        return miesiacMin;
    }

    /********************************************************
     * nazwa funkcji: znajdzMiesiacMaxZuzycia
     * parametry wejściowe: brak
     * wartość zwracana: miesiąc, w którym było największe zużycie wody
     * autor: 67890123456
     * ****************************************************/
    public int znajdzMiesiacMaxZuzycia() {
        int miesiacMax = 0;
        for (int i = 0; i < iloscMiesiecy; i++) {
            if (zuzycia[i] > zuzycia[miesiacMax]) {
                miesiacMax = i;
            }
        }
        return miesiacMax;
    }

    /********************************************************
     * nazwa funkcji: obliczSrednieZuzycie
     * parametry wejściowe: brak
     * wartość zwracana: średnie roczne zużycie wody
     * autor: 67890123456
     * ****************************************************/
    public float obliczSrednieZuzycie() {
        float suma = 0;
        for (int i = 0; i < iloscMiesiecy; i++) {
            suma += zuzycia[i];
        }
        /*float srednia = suma / iloscMiesiecy;
        return srednia */
        return suma / iloscMiesiecy;
    }

    /********************************************************
     * nazwa funkcji: obliczCzene
     * parametry wejściowe: cena1Kw - cena wody w pierwszym kwartale
     *                      cena1Kw - cena wody w pozostałych kwartałach roku
     * wartość zwracana: Oblicza koszt zużycia wody za cały rok
     * autor: 67890123456
     * ****************************************************/
    public float obliczCene(float cena1Kw, float cenaRKw) {
        float koszt1Kw = 0;
        for (int i = 0; i < 3; i++) {
            koszt1Kw += zuzycia[i] * cena1Kw;
        }
        float kosztRKw = 0;
        for (int i = 3; i < iloscMiesiecy; i++) {
            kosztRKw += zuzycia[i] * cenaRKw;
        }
        return koszt1Kw + kosztRKw;
    }

}
