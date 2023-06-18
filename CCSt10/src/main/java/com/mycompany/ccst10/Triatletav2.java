//Cristina Correa Segade
//Ejercicio 11

package com.mycompany.ccst10;

import java.util.Random;


public class Triatletav2 implements Nadadorv2, Ciclistav2, Saltadorv2 {

    @Override
    public float nadar(float metros) {
        Random r = new Random();
        float velocidad = r.nextFloat() * (70 - 40) + 40; // Rango entre 40 y 70
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
        float a = r.nextFloat() * (40 - 30) + 30; // Rango entre 30 y 40
        return a;
    }
}