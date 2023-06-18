//Cristina Correa Segade
//Ejercicio 7 y 8

package com.mycompany.ccst10;


public class Triangulov10 extends Figura2Dv10 {
    public String estilo;

    Triangulov10(Triangulov10 trian) {
        super(trian.getAncho(), trian.getAlto(), trian.getNombre());
        estilo = trian.estilo;
    }

    Triangulov10(double b, double h, String e, String n) {
        super(b, h, n);
        estilo = e;
    }

    Triangulov10() {
        super();
        estilo = null;
    }

    Triangulov10(double l, String n) {
        super(l, n);
        estilo = "igualBaseAltura";
    }

    @Override
    public double area() {
        return (getAncho() * getAlto()) / 2;
    }

    public void verEstilo() {
        System.out.println(estilo);
    }
}