//Cristina Correa
//Ejercicio 2 y 3 

package com.mycompany.ccst9;


public class Rectangulov8 extends Figura2Dv8 {
    
    public Rectangulov8(double b, double h, String n) {
        super(b, h, n);
    }

    public double area() {
        return getAncho() * getAlto();
    }

    public boolean esCuadrado() {
        return getAncho() == getAlto();
    }
    
}
