//Cristina Correa Segade
//Ejercicio 

package com.mycompany.ccst10;


public class Rectangulov9 extends Figura2Dv9 {
    Rectangulov9(double b, double h, String n) {
        super(b, h, n);
    }

    @Override
    public double area() {
        double a = (getAncho() * getAlto());
        return a;
    }

    public boolean esCuadrado() {
        if (getAncho() == getAlto()) {
            return true;
        }
        else {
            return false;
        }
    }
}
