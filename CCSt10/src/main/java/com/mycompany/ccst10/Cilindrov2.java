//Cristina Correa Segade
//Ejercicio 3

package com.mycompany.ccst10;


public class Cilindrov2 extends Figura3Dv2 {

    protected double radio;
    protected double alto;

    Cilindrov2(double r, double a, String n) {
        super(n);
        radio = r;
        alto = a;
    }

    public void setRadio(double r) {
        radio = r;
    }

    public double getRadio() {
        return radio;
    }

    public void setAlto(double al) {
        alto = al;
    }

    public double getAlto() {
        return alto;
    }

    @Override
    public double volumen() {
        return Math.PI * Math.pow(radio, 2) * alto;
    }

    @Override
    public double superficie() {
        return 2 * Math.PI * radio * (radio + alto);
    }
}