//Cristina Correa Segade
//Ejercicio 2

package com.mycompany.ccst10;


public abstract class Figura3Dv1 {
    protected String nombre;

    Figura3Dv1(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double volumen();

    @Override
    public String toString() {
        return String.format("La figura: %s tiene un volumen: %f", nombre, volumen());
    }
}
