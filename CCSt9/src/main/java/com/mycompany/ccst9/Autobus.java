//Cristina Correa
//Ejercicio 

package com.mycompany.ccst9;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Autobus extends Vehiculo {
    protected int numAsientos;

    public Autobus(String mat, int n) {
        super(mat);
        numAsientos = n;
    }

    public void setNumAsientos(int n) {
        numAsientos = n;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    @Override
    public float salida() {
        long tiempoMinutos = ChronoUnit.MINUTES.between(horaLlegada, LocalDateTime.now());
        return (float) ((tiempoMinutos * 0.04) + numAsientos * 0.25);
    }

    @Override
    public String toString() {
        String linea = String.format(
                "El vehiculo de tipo autobús con matricula: %s con fecha y hora de llegada %s", matricula,
                horaLlegada);
        return linea;
    }
}
