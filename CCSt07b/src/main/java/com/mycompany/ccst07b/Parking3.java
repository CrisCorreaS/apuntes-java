//Cristina Correa Segade
//Ejercicio 25

package com.mycompany.ccst07b;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


public class Parking3 {
    private ArrayList<Coche> plazas;
    private int importeMaximo;
    private double importeMinuto;

    Parking3() {
        plazas = new ArrayList<>();
        importeMaximo = 10;
        importeMinuto = 0.02;
    }

    public void mostrarParking() {
        System.out.println("Lista de coches aparcados: ");
        for (Coche coche : plazas) {
            System.out.println("Matrícula: " + coche.getMatricula());
            LocalDateTime horaLlegada = coche.getHoraLlegada();
            int a = horaLlegada.getYear();
            int m = horaLlegada.getMonthValue();
            int d = horaLlegada.getDayOfMonth();
            System.out.println("Fecha: " + d + "/" + m + "/" + a + "\n");
        }
    }

    public int aparcar(String mat) {
        if (plazas.size() < 20) {
            plazas.add(new Coche(mat));
            return plazas.size();
        }
        return 0;
    }

    public double desaparcar() {
        if (plazas.isEmpty()) {
            return -1;
        }
        long tiempoMinutosCoche = ChronoUnit.MINUTES.between(plazas.get(plazas.size() - 1).getHoraLlegada(), LocalDateTime.now());
        double recaudadoCoche = tiempoMinutosCoche * importeMinuto;
        return Math.min(recaudadoCoche, importeMaximo);
    }

    public double totalRecaudado() {
        double importeTotal = 0;
        for (Coche coche : plazas) {
            long tiempoMinutosCadaPlaza = ChronoUnit.MINUTES.between(coche.getHoraLlegada(), LocalDateTime.now());
            double importeCadaPlaza = tiempoMinutosCadaPlaza * importeMinuto;
            importeTotal += Math.min(importeCadaPlaza, importeMaximo);
        }
        return importeTotal;
    }
}
