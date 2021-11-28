package com.company;

import java.util.Scanner;

/********************************************************
 * nazwa klasy: Main
 * atrybuty klasy: LICZBA_MIESIACY - liczba miesięcy, w których rejestrujemy zużycia
 *                  CENA_1_KW - cena wody w 1 kwartale
 *                  CENA_R_KW  - cena wody w pozostałych kwartałach roku
 *                  zuzycia - tablica przechowująca zużycia
 * opis: główna klasa uruchomienowa
 * autor: 67890123456
 * ****************************************************/
public class Main {
    final static int LICZBA_MIESIACY = 12;
    final static float CENA_1_KW = 6.0F;
    final static float CENA_R_KW = 7.0F;
    static float[] zuzycia = new float[LICZBA_MIESIACY];

    /********************************************************
     * nazwa funkcji: main
     * parametry wejściowe: args - parametry przekazywane podczas uruchomienia
     * wartość zwracana: brak
     * autor: 67890123456
     * ****************************************************/
    public static void main(String[] args) {
        Scanner buforKlawiatury = new Scanner(System.in);
        for (int i = 0; i < LICZBA_MIESIACY; i++) {
            System.out.print("Wprowadź zużycie wody za miesiąc: " + (i + 1) + ": ");
            zuzycia[i] = buforKlawiatury.nextFloat();
        }

        ZuzyciaWody zuzyciaWody = new ZuzyciaWody(zuzycia, LICZBA_MIESIACY);

        int miesiacMinZuzycia = zuzyciaWody.znajdzMiesiacMinZuzycia();
        float minZuzycie = zuzycia[miesiacMinZuzycia];

        int miesiacMaxZuzycia = zuzyciaWody.znajdzMiesiacMaxZuzycia();
        float maxZuzycie = zuzycia[miesiacMaxZuzycia];

        float srednieZuzycie = zuzyciaWody.obliczSrednieZuzycie();

        float rocznyKosztZuzycia = zuzyciaWody.obliczCene(CENA_1_KW, CENA_R_KW);

        System.out.println("W miesiącu " + miesiacMinZuzycia + " zużyto najmniej wody: " + minZuzycie);
        System.out.println("W miesiącu " + miesiacMaxZuzycia + " zużyto najwięcej wody: " + maxZuzycie);
        System.out.println("Średnie roczne zużycie wody wynosi: " + srednieZuzycie);
        System.out.println("Koszt rocznego zużycia wody to: " + rocznyKosztZuzycia);

    }
}
