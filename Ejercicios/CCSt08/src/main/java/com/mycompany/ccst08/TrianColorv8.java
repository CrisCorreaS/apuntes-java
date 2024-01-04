//Cristina Correa Segade
//Ejercicio 8

package com.mycompany.ccst08;


public class TrianColorv8 extends Triangulov8{
    
    private String color;

    public TrianColorv8(double b, double h, String e, String c, String n) {
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
