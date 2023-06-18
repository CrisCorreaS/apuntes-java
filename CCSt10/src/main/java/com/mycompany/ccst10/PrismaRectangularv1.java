//Cristina Correa Segade
//Ejercicio 2

package com.mycompany.ccst10;


public class PrismaRectangularv1 extends Figura3Dv1 {

    protected double base;
    protected double ancho;
    protected double alto;

    PrismaRectangularv1(double base, double ancho, double alto, String nombre) {
        super(nombre);
        this.base = base;
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double volumen() {
        return base * ancho * alto;
    }
}