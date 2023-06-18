//Cristina Correa Segade
//Ejercicio 4

package com.mycompany.ccst08;


public class Triangulov4 extends Figura2Dv4{
    private String estilo;

    public Triangulov4(double b, double h, String e) {
        super(b, h);
        estilo = e;
    }

    public double area() {
        double a = (getAncho() * getAlto()) / 2;
        return a;
    }

    public void verEstilo() {
        System.out.println(estilo);
    }
}
