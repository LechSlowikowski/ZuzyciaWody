package com.company;

public class ZuzyciaWody {
    private float[] zuzycia;
    private int iloscMiesiecy;

    public ZuzyciaWody(float[] zuzycia, int iloscMiesiecy) {
        this.iloscMiesiecy = iloscMiesiecy;
        this.zuzycia = zuzycia;
    }

    public int znajdzMiesiacMinZuzycia(){
        int miesiacMin = 0;
        for (int i = 0; i < iloscMiesiecy; i++) {
            if(zuzycia[i] < zuzycia[miesiacMin]) {
                miesiacMin = i;
            }
        }
        return miesiacMin;
    }

    public int znajdzMiesiacMaxZuzycia(){
        int miesiacMax = 0;
        for (int i = 0; i < iloscMiesiecy; i++) {
            if(zuzycia[i] > zuzycia[miesiacMax]) {
                miesiacMax = i;
            }
        }
        return miesiacMax;
    }

    public float obliczSrednieZuzycie(){
        float suma = 0;
        for (int i = 0; i <iloscMiesiecy ; i++) {
            suma += zuzycia[i];
        }
        /*float srednia = suma / iloscMiesiecy;
        return srednia */
        return suma / iloscMiesiecy;
    }

    public float obliczCene( float cena1Kw, float cenaRKw){
        float koszt1Kw = 0;
        for (int i = 0; i < 3 ; i++) {
            koszt1Kw +=  zuzycia[i] * cena1Kw;
        }
        float kosztRKw = 0;
        for (int i = 3; i <iloscMiesiecy ; i++) {
            kosztRKw += zuzycia[i] * cenaRKw;
        }
        return koszt1Kw + kosztRKw;
    }

}
