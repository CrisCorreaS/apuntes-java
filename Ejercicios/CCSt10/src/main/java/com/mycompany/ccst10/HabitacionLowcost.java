//Cristina Correa Segade
//Ejercicio 13

package com.mycompany.ccst10;

import java.time.LocalDateTime;
import static java.time.temporal.ChronoUnit.SECONDS;


public class HabitacionLowcost extends Habitacion {

    @Override
    public  float checkOut(){
       ocupada=false;
       return ((SECONDS.between(diaEntrada,LocalDateTime.now()))*50);
   } 
}