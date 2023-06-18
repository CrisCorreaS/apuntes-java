//Cristina Correa
//Ejercicio 7

package com.mycompany.ccst07;

import java.time.LocalDateTime;


public class Coche {
    public String matricula;
    public LocalDateTime horaLlegada;
    public double importePagar;

    Coche(String mat) {
        matricula = mat;
        horaLlegada = LocalDateTime.now();
        importePagar = 0;
    }
}
