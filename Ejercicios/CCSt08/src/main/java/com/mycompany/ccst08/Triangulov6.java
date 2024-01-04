//Cristina Correa Segade
//Ejercicio 6

package com.mycompany.ccst08;


public class Triangulov6 extends Figura2Dv6{
    private String estilo;

    Triangulov6(double b, double h, String e) {
        super(b, h);
        estilo = e;
    }

    Triangulov6() {
        super();
        estilo = null;
    }

    Triangulov6(double l) {
        super(l);
        estilo = "igualBaseAltura";
    }

    public double area() {
        double a = (getAncho() * getAlto()) / 2;
        return a;
    }

    public void verEstilo() {
        System.out.println(estilo);
    }
}
