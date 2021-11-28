package com.company;

import java.util.Scanner;

public class Main {
    final static int LICZBA_MIESIACY = 12;
    final static float cena1Kwartal = 6.0F;
    final static float cenaRKwartal = 7.0F;
    static float[] zuzycia = new float[LICZBA_MIESIACY];

    public static void main(String[] args) {
        Scanner buforKlawiatury = new Scanner(System.in);
        for (int i = 0; i < LICZBA_MIESIACY ; i++) {
            System.out.print("Wprowadź zużycie wody za miesiąc: " + (i+1) + ": " );
            zuzycia[i] = buforKlawiatury.nextFloat();
        }

        ZuzyciaWody zuzyciaWody = new ZuzyciaWody(zuzycia, LICZBA_MIESIACY);

        int miesiacMinZuzycia = zuzyciaWody.znajdzMiesiacMinZuzycia();
        float minZuzycie = zuzycia[miesiacMinZuzycia];

        int miesiacMaxZuzycia = zuzyciaWody.znajdzMiesiacMaxZuzycia();
        float maxZuzycie = zuzycia[miesiacMaxZuzycia];

        float srednieZuzycie = zuzyciaWody.obliczSrednieZuzycie();

        float rocznyKosztZuzycia = zuzyciaWody.obliczCene(cena1Kwartal, cenaRKwartal);

        System.out.println("W miesiącu " + miesiacMinZuzycia + " zużyto najmniej wody: " + minZuzycie);
        System.out.println("W miesiącu " + miesiacMaxZuzycia + " zużyto najwięcej wody: " + maxZuzycie);
        System.out.println("Średnie roczne zużycie wody wynosi: " + srednieZuzycie);
        System.out.println("Koszt rocznego zużycia wody to: " + rocznyKosztZuzycia);

    }
}
