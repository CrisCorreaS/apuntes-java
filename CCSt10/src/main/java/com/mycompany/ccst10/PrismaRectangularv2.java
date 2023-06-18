//Cristina Correa Segade
//Ejercicio 3

package com.mycompany.ccst10;


public class PrismaRectangularv2 extends Figura3Dv2 {

    protected double base;
    protected double ancho;
    protected double alto;

    PrismaRectangularv2(double b, double an, double al, String n) {
        super(n);
        base = b;
        ancho = an;
        alto = al;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    public void setAncho(double an) {
        ancho = an;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAlto(double al) {
        alto = al;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public double volumen() {
        return base * ancho * alto;
    }

    @Override
    public double superficie() {
        return 2 * (base * ancho + base * alto + ancho * alto);
    }
}