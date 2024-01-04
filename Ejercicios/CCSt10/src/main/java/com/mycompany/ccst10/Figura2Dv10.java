//Cristina Correa Segade
//Ejercicio 7 y 8

package com.mycompany.ccst10;


public abstract class Figura2Dv10 implements Perimetrable {
    private static String nombre;
    private static double ancho;
    private static double alto;

    Figura2Dv10(Figura2Dv10 fig) {
        ancho = fig.getAncho();
        alto = fig.getAlto();
    }

    Figura2Dv10(double b, double h, String n) {
        ancho = b;
        alto = h;
        nombre = n;
    }

    Figura2Dv10(double l, String n) {
        ancho = l;
        alto = l;
        nombre = n;
    }

    Figura2Dv10() {
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

    @Override
    public double calcularPerimetro() {
        return (getAncho() * 2 + getAlto() * 2);
    }

    public float precioMetroCuadrado(int precio) {
        return (float) (this.area() * precio);
    }

    public void verDim() {
        System.out.printf("El ancho es: %.2f y el alto es: %.2f%n", ancho, alto);
    }
}