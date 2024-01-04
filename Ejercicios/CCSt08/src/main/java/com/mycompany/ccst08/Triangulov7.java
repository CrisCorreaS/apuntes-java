//Cristina Correa Segade
//Ejercicio 7

package com.mycompany.ccst08;


public class Triangulov7 extends Figura2Dv7{
    
    private String estilo;

    Triangulov7(Triangulov7 trian) {
        super(trian);
        estilo = trian.estilo;
    }

    Triangulov7(double b, double h, String e) {
        super(b, h);
        estilo = e;
    }

    Triangulov7() {
        super();
        estilo = null;
    }

    Triangulov7(double l) {
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
