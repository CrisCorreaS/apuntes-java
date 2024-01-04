//Cristina Correa
//Ejercicio 1, 2 y 3

package com.mycompany.ccst9;


public class Figura2Dv8 {
    
    private String nombre;
    private double ancho;
    private double alto;

    public Figura2Dv8(double ancho, double alto, String nombre) {
        this.ancho = ancho;
        this.alto = alto;
        this.nombre = nombre;
    }

    public Figura2Dv8(double lado, String nombre) {
        this.ancho = lado;
        this.alto = lado;
        this.nombre = nombre;
    }

    public Figura2Dv8() {
        this.ancho = 0;
        this.alto = 0;
        this.nombre = null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAlto() {
        return alto;
    }

    public void verDim() {
        System.out.printf("El ancho es: %.2f y el alto es: %.2f%n", ancho, alto);
    }
}
