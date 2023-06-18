//Cristina Correa Segade
//Ejercicio 9 y 10

package com.mycompany.ccst10;

import java.util.Random;


public class Delfin implements Nadador {

    @Override
    public float nadar(float metros) {
        Random r = new Random();
        float velocidad = r.nextFloat() * (70 - 40) + 40;
        float seg = metros * 3600 / (velocidad * 1000);

        return seg;
    }
}