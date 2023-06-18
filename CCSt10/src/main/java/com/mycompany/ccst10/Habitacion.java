//Cristina Correa Segade
//Ejercicio 13

package com.mycompany.ccst10;

import java.time.LocalDateTime;


public abstract class Habitacion {
    protected boolean ocupada;
    protected LocalDateTime diaEntrada;

    public Habitacion() {
        ocupada = false;
    }

    public void checkIn() {
        diaEntrada = LocalDateTime.now();
        ocupada = true;
    }

    public abstract float checkOut();

    public boolean estaOcupada() {
        return ocupada;
    }

    @Override
    public String toString() {
        return "Habitación " + (ocupada ? "ocupada" : "libre");
    }
}

