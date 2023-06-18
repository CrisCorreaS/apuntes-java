//Cristina Correa Segade
//Ejercicio 8

package com.mycompany.ccst08;


public class Rectangulov8 extends Figura2Dv8{
    
    public Rectangulov8(double b, double h, String n) {
        super(b, h, n);
    }

    public boolean esCuadrado() {
        return getAncho() == getAlto();
    }

    public double area() {
        return getAncho() * getAlto();
    }
}
