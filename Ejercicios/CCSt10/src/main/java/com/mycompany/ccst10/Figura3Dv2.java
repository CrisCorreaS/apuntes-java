//Cristina Correa Segade
//Ejercicio 3

package com.mycompany.ccst10;


public abstract class Figura3Dv2 {
    protected String nombre;

    Figura3Dv2(String n) {
        nombre = n;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double volumen();

    public abstract double superficie();

    @Override
    public String toString() {
        String linea = String.format("La figura: %s tiene una superficie: %f y un volumen: %f", nombre, superficie(), volumen());
        return linea;
    }
}
