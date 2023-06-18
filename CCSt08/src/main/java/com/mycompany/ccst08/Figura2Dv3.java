//Cristina Correa Segade
//Ejercicio 3

package com.mycompany.ccst08;


public class Figura2Dv3 {
 
    private double ancho;
    private double alto;

    Figura2Dv3(double b, double h) {
        ancho = b;
        alto = h;
    }

    public void setAncho(double a) {
        ancho = a;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAlto(double a) {
        alto = a;
    }

    public double getAlto() {
        return alto;
    }

    public void verDim() {
        System.out.printf("El ancho es: %.2f y el alto es: %.2f%n", ancho, alto);
    }
}
