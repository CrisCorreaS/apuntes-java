//Cristina Correa Segade
//Ejercicio 9 y 10

package com.mycompany.ccst10;

import java.util.Random;


public class Triatleta implements Nadador, Ciclista, Saltador {

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
        float a = r.nextFloat() * (40 - 30) + 30;
        return a;
    }
}