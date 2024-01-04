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

public class Ejercicio09Simple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int hora;
        
        System.out.println("Introduce una hora del 0 al 23: ");
        hora = teclado.nextInt();

        switch (hora) {
            case 9:
                System.out.println("A esta hora hay buses los domingos");
                break;
            case 10:
                System.out.println("A esta hora hay buses todos los días");
                break;
            case 11:
                System.out.println("A esta hora hay buses los domingos");
                break;
            case 12:
                System.out.println("A esta hora hay buses los jueves y domingos");
                break;
            case 13:
                System.out.println("A esta hora hay buses los domingos");
                break;
            case 14:
                System.out.println("A esta hora hay buses todos los días excepto los sábados");
                break;
            default:
                System.out.println("A esta hora no hay buses");
        }
    }
}
