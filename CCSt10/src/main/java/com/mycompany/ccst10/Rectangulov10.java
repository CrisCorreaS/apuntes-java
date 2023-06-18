//Cristina Correa Segade
//Ejercicio 7 y 8

package com.mycompany.ccst10;


public class Rectangulov10 extends Figura2Dv10 {
    Rectangulov10(double b, double h, String n) {
        super(b, h, n);
    }

    @Override
    public double area() {
        return (getAncho() * getAlto());
    }

    public boolean esCuadrado() {
        return getAncho() == getAlto();
    }
}