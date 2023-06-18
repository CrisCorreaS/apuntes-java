//Cristina Correa Segade
//Ejercicio 9 y 10

package com.mycompany.ccst10;


public class BallenaAzul implements Nadador {
    private int edad;

    public BallenaAzul(int e) {
        edad = e;
    }

    @Override
    public float nadar(float metros) {
        float seg;
        if (edad > 5) {
            seg = metros * 3600 / (10 * 1000);
        } else {
            seg = metros * 3600 / (13 * 1000);
        }
        return seg;
    }
}