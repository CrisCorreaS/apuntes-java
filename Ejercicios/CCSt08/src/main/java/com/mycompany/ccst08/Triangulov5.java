//Cristina Correa Segade
//Ejercicio 5

package com.mycompany.ccst08;


public class Triangulov5 extends Figura2Dv5{
    
    public String estilo;

    Triangulov5(double b, double h, String e) {
        super(b, h);
        estilo = e;
    }

    Triangulov5() {
        super();
        estilo = null;
    }

    Triangulov5(double l) {
        super(l);
        estilo = "igualBaseAltura";
    }

    public double area() {
        return (getAncho() * getAlto()) / 2;
    }

    public void verEstilo() {
        System.out.println(estilo);
    }
}
