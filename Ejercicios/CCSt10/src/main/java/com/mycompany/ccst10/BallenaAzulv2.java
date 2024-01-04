//Cristina Correa Segade
//Ejercicio 11

package com.mycompany.ccst10;


public class BallenaAzulv2 implements Nadadorv2 {

    public static int edad;

    public BallenaAzulv2(int e) {
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