//Cristina Correa Segade
//Ejercicio 

package com.mycompany.ccst10;

import java.io.PrintStream;


public abstract class Figura2Dv9 {
    private static String nombre;
    private static double ancho;
    private static double alto;

    Figura2Dv9(Figura2Dv9 fig) {
        ancho = fig.getAncho();
        alto = fig.getAlto();
    }

    Figura2Dv9(double b, double h, String n) {
        ancho = b;
        alto = h;
        nombre = n;
    }

    Figura2Dv9(double l, String n) {
        ancho = l;
        alto = l;
        nombre = n;
    }

    Figura2Dv9() {
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

    public abstract double area();

    public float precioMetroCuadrado(int precio) {

        return (float) (this.area() * precio);
    }

    public void verDim() {
        PrintStream printf = System.out.printf("El ancho es: %.2f y el alto es: %.2f ", ancho, alto);
    }

}

