package com.mycompany.ccst02;
//Cristina Correa Segade

/*
2.9. Realizar un programa al que se le introduzca la hora del día (0 –23) y nos diga que días de la
semana hay salida de bus (utilizar la tabla anterior):

        Lunes Martes Miérc. Jueves Viernes Sábado  Domingo 
9:00                                                 Si
10:00     Si    Si     Si     Si      Si     Si      Si 
11:00                                                Si 
12:00                         Si                     Si   
13:00                                                Si 
14:00     Si    Si     Si     Si      Si             Si  
 */
import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int hora;
        
        System.out.println("Introduce una hora del 0 al 23: ");
        hora = teclado.nextInt();

        if (hora < 9 || hora > 14) {
            System.out.println("No hay bus a esta hora ningún día");
        } else {
            if (hora == 10) {
                System.out.println("Hay bus a esta hora todos los días");
            } else {
                if (hora == 14) {
                    System.out.println("Hay bus a esta hora todos los días excepto el sábado");
                } else {
                    if (hora == 12) {
                        System.out.println("Hay bus a esta hora solo los jueves y domingos");
                    } else {
                        if (hora == 9 || hora == 11 || hora == 13) {
                            System.out.println("Hay bus a esta hora solo los domingos");
                        } else {
                            System.out.println("No hay bus este día a esta hora");
                        }
                    }
                }
            }
        }
    }
}
