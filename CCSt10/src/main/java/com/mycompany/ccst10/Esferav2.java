//Cristina Correa Segade
//Ejercicio 3

package com.mycompany.ccst10;


public class Esferav2 extends Figura3Dv2 {

    protected double radio;

    Esferav2(double r, String n) {
        super(n);
        radio = r;
    }

    public void setRadio(double r) {
        radio = r;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double volumen() {
        return (4 * Math.PI * Math.pow(radio, 3) / 3);
    }

    @Override
    public double superficie() {
        return (4 * Math.PI * Math.pow(radio, 2));
    }
}
