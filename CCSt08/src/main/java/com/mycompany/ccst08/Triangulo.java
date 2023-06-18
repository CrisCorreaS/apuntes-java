//Cristina Correa Segade
//Ejercicio 1

package com.mycompany.ccst08;


public class Triangulo extends Figura2D{
    public String estilo;

    Triangulo(double b, double h, String e) {
        super(b, h);
        estilo = e;
    }

    public double area() {
        double a = (ancho * alto) / 2;
        return a;
    }

    public void verEstilo() {
        System.out.println(estilo);
    }
}
