//Cristina Correa Segade
//Ejercicio 8

package com.mycompany.ccst08;


public class Figura2Dv8 {
 
    private String nombre;
    private double ancho;
    private double alto;

    public Figura2Dv8(double b, double h, String n) {
        ancho = b;
        alto = h;
        nombre = n;
    }

    public Figura2Dv8(double l, String n) {
        ancho = l;
        alto = l;
        nombre = n;
    }

    public Figura2Dv8() {
        ancho = 0;
        alto = 0;
        nombre = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double a) {
        ancho = a;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double a) {
        alto = a;
    }

    public void verDim() {
        System.out.printf("El ancho es: %.2f y el alto es: %.2f\n", ancho, alto);
    }
}
