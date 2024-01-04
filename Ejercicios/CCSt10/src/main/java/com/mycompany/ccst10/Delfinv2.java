//Cristina Correa Segade
//Ejercicio 11

package com.mycompany.ccst10;

import java.util.Random;


public class Delfinv2 implements Nadadorv2 {

    @Override
    public float nadar(float metros) {
        Random r = new Random();
        float velocidad = r.nextFloat() * (70 - 40) + 40; // Rango entre 40 y 70
        float seg = metros * 3600 / (velocidad * 1000);

        return seg;
    }
}