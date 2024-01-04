//Cristina Correa
//Ejercicio 3 

package com.mycompany.ccst9;


public class TrianColorv8 extends Triangulov8{
    
    private String color;

    public TrianColorv8(double base, double altura, String estilo, String color, String nombre) {
        super(base, altura, estilo, nombre);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void verColor() {
        System.out.println("Color: " + color);
    }
}
