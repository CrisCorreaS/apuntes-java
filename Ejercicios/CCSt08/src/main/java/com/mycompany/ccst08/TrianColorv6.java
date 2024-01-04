//Cristina Correa Segade
//Ejercicio 6

package com.mycompany.ccst08;


public class TrianColorv6 extends Triangulov6{
    
    private String color;

    TrianColorv6(double b, double h, String e, String c) {
        super(b, h, e);
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
