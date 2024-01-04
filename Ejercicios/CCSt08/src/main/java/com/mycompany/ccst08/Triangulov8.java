//Cristina Correa Segade
//Ejercicio 8

package com.mycompany.ccst08;


public class Triangulov8 extends Figura2Dv8{
    public String estilo;

    public Triangulov8(double b, double h, String e, String n) {
        super(b, h, n);
        estilo = e;
    }

    public Triangulov8(double l, String n) {
        super(l, n);
        estilo = "igualBaseAltura";
    }

    public double area() {
        return (getAncho() * getAlto()) / 2;
    }

    public void verEstilo() {
        System.out.println(estilo);
    }
}
