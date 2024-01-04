//Cristina Correa
//Ejercicio 4

package com.mycompany.ccst9;


public class Figura2D {
    
    private String nombre;
    private double ancho;
    private double alto;

    Figura2D(double b, double h, String n) {
        ancho = b;
        alto = h;
        nombre = n;
    }

    Figura2D(double l, String n) {
        ancho = l;
        alto = l;
        nombre = n;
    }

    Figura2D() {
        ancho = 0;
        alto = 0;
        nombre = null;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
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
    
    public double area() {
        return 0;
    }
}
