//Cristina Correa
//Ejercicio 

package com.mycompany.ccst9;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Furgoneta extends Vehiculo {
    protected int longitud;

    public Furgoneta(String mat, int l) {
        super(mat);
        longitud = l;
    }

    public void setLongitud(int l) {
        longitud = l;
    }

    public int getLongitud() {
        return longitud;
    }

    @Override
    public float salida() {
        long tiempoMinutos = ChronoUnit.MINUTES.between(horaLlegada, LocalDateTime.now());
        return (float) ((tiempoMinutos * 0.04) + longitud * 0.20);
    }

    @Override
    public String toString() {
        String linea = String.format(
                "El vehiculo de tipo furgoneta con matricula: %s con fecha y hora de llegada %s", matricula,
                horaLlegada);
        return linea;
    }
}