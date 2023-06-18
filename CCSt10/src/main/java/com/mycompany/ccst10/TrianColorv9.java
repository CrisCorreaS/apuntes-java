//Cristina Correa Segade
//Ejercicio 

package com.mycompany.ccst10;


public class TrianColorv9 extends Triangulov9 {
    private String color;

    TrianColorv9(double b, double h, String e, String c,String n) {
        super(b, h, e,n);
        color = e;
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
