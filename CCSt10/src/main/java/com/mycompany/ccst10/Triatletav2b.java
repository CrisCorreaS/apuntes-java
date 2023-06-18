//Cristina Correa Segade
//Ejercicio 

package com.mycompany.ccst10;

import java.util.Random;


public class Triatletav2b implements Nadadorv2, Ciclistav2, Saltadorv2 {
    public static int numVeces = 0;

    @Override
    public float nadar(float metros) {
        Random r = new Random();
        float velocidad = r.nextFloat() * (70 - 40) + 40; 
        float seg = metros * 3600 / (velocidad * 1000);
        return seg;
    }

    @Override
    public float recorrer(float km, String tipoTerreno) {
        float rec = 0;
        if (tipoTerreno.equals("carretera")) {
            rec = km * 3600 / 25;
        } else {
            rec = km * 3600 / 15;
        }
        return rec;
    }

    @Override
    public float saltarAltura() {
        Random r = new Random();
        float a = r.nextFloat(30, 40);
        return a;
    }

    @Override
    public boolean saltaPertiga(float cm) {
        if (cm > 600) {
            return false;
        }
        if ((cm > 500 && cm < 600) && numVeces % 2 == 0) {
            return true;
        } else {
            return true;
        }
    }
}
