//Cristina Correa Segade
//Ejercicio 1

package com.mycompany.ccst08;


public class Figura2D {
    public double ancho;
    public double alto;

    Figura2D(double b, double h) {
        ancho = b;
        alto = h;
    }

    public void verDim() {
        System.out.println("Ancho: " + ancho + ", Alto: " + alto);
    }
}
