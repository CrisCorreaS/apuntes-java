//Cristina Correa
//Ejercicio 4

package com.mycompany.ccst9;


public class Rectangulo extends Figura2D {
    
    Rectangulo(double b, double h, String n) {
        super(b, h, n);
    }

    public double area() {
        double a = getAncho() * getAlto();
        return a;
    }

    public boolean esCuadrado() {
        return getAncho() == getAlto();
    }
    
}
