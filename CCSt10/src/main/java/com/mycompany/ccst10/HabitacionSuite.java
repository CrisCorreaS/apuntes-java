//Cristina Correa Segade
//Ejercicio 13

package com.mycompany.ccst10;

import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.SECONDS;


public class HabitacionSuite extends Habitacion {

    @Override
    public float checkOut() {
        float coste = (SECONDS.between(diaEntrada, LocalDateTime.now())) * 200;
        if ((SECONDS.between(diaEntrada, LocalDateTime.now()))>10) {
            coste = (float) (coste-( 0.2 * coste));
        }
        ocupada = false;
        return coste;
    }
}