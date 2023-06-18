//Cristina Correa Segade
//Ejercicio 3

package com.mycompany.ccst08;


public class Triangulov3 extends Figura2Dv3{
    
    private String estilo;

    Triangulov3(double b, double h, String e) {
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
