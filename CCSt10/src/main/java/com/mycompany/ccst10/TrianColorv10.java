//Cristina Correa Segade
//Ejercicio 7 y 8

package com.mycompany.ccst10;


public class TrianColorv10 extends Triangulov10 {
    private String color;

    TrianColorv10(double b, double h, String e, String c, String n) {
        super(b, h, e, n);
        color = c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public void verColor() {
        System.out.println(color);
    }
}