//Cristina Correa
//Ejercicio 4

package com.mycompany.ccst9;


public class TrianColor extends Triangulo{
    
   private String color;

    TrianColor(double b, double h, String e, String c, String n) {
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
