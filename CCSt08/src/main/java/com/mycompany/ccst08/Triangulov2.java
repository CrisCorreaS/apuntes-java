//Cristina Correa Segade
//Ejercicio 2

package com.mycompany.ccst08;


public class Triangulov2 extends Figura2Dv2{
    private String estilo;

    Triangulov2(double b, double h, String e) {
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
