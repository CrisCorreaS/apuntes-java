//Cristina Correa
//Ejercicio 1, 2 y 3

package com.mycompany.ccst9;


public class Triangulov8 extends Figura2Dv8{
    private String estilo;

    public Triangulov8(double base, double altura, String estilo, String nombre) {
        super(base, altura, nombre);
        this.estilo = estilo;
    }

    public Triangulov8(double lado, String nombre) {
        super(lado, nombre);
        this.estilo = "igualBaseAltura";
    }

    public double area() {
        return (getAncho() * getAlto()) / 2;
    }

    public void verEstilo() {
        System.out.println(estilo);
    }
}
