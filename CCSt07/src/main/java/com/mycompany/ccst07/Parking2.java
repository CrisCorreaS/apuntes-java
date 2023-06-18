//Cristina Correa Segade
//Ejercicio 6

package com.mycompany.ccst07;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Parking2 {
    
    private final Coche[] plazas;
    private int ocupada;
    private static final int maxPlazas = 20;
    private double totalRecaudado;

    Parking2() {
        plazas = new Coche[maxPlazas];
        ocupada = 0;
        totalRecaudado = 0;
    }

    public int aparcar(String mat) {
        if (ocupada == maxPlazas) {
            return 0;
        } else {
            plazas[ocupada] = new Coche(mat);
            ocupada++;
            return ocupada;
        }
    }

    public Coche desaparcar() {
        if (ocupada == 0) {
            return null;
        } else {
            Coche coche = plazas[ocupada - 1];
            ocupada--;
            LocalDateTime horaSalida = LocalDateTime.now();
            long minutosEstancia = ChronoUnit.MINUTES.between(coche.horaLlegada, horaSalida);
            double importe = minutosEstancia * 0.02;
            coche.importePagar = Math.min(importe, 10);
            totalRecaudado += coche.importePagar;
            return coche;
        }
    }

    public Coche[] mostrarParking() {
        Coche[] parking = new Coche[ocupada];
        System.arraycopy(plazas, 0, parking, 0, ocupada);
        return parking;
    }

    public double totalRecaudado() {
        return totalRecaudado;
    }
}
