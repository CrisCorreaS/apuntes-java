//Cristina Correa Segade
//Ejercicio 25

package com.mycompany.ccst07b;

import java.time.LocalDateTime;


public class Coche {
    private String matricula;
    private LocalDateTime horaLlegada;

    Coche(String mat) {
        matricula = mat;
        horaLlegada = LocalDateTime.now();
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDateTime getHoraLlegada() {
        return horaLlegada;
    }
}
