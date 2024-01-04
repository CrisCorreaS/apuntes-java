//Cristina Correa Segade
//Ejercicio 2

package com.mycompany.ccst10;


public class Esferav1 extends Figura3Dv1 {

    protected double radio;

    Esferav1(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double volumen() {
        return (4 * Math.PI * Math.pow(radio, 3) / 3);
    }
}