//Cristina Correa
//Ejercicio 4

package com.mycompany.ccst9;


public class Triangulo extends Figura2D{
    private String estilo;

    Triangulo(double b, double h, String e, String n) {
        super(b, h, n);
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
