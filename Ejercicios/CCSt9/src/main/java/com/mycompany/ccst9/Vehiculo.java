//Cristina Correa
//Ejercicio 

package com.mycompany.ccst9;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Vehiculo {
    protected String matricula;
    protected LocalDateTime horaLlegada;

    public Vehiculo(String mat) {
        matricula = mat;
        horaLlegada = LocalDateTime.now();
    }

    public void setMatricula(String mat) {
        matricula = mat;
    }

    public String getMatricula() {
        return matricula;
    }

    public float salida() {
        long tiempoMinutos = ChronoUnit.MINUTES.between(horaLlegada, LocalDateTime.now());
        return (float) (tiempoMinutos * 0.04);
    }

    @Override
    public String toString() {
        String linea = String.format(
                "El vehiculo de tipo general con matricula: %s con fecha y hora de llegada %s", matricula, horaLlegada);
        return linea;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vehiculo) {
            Vehiculo otro = (Vehiculo) obj;
            return matricula.equals(otro.matricula);
        }
        return false;
    }
}

