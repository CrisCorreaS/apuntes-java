package com.mycompany.ccst02;
//Cristina Correa Segade

/*
2.8. La tabla siguiente representa las horas de salida de un bus. Diseña un algoritmo al que se le
introduzca el día (1-7) y la hora (9-14), verifique la entrada y nos informe si hay bus o no. Hacer una
primera condición que haga la verificación de la entrada de datos y otra única condición para ver si
hay bus.

        Lunes Martes Miérc. Jueves Viernes Sábado  Domingo 
9:00                                                 Si
10:00     Si    Si     Si     Si      Si     Si      Si 
11:00                                                Si 
12:00                         Si                     Si   
13:00                                                Si 
14:00     Si    Si     Si     Si      Si             Si  

 */
import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia, hora;
        
        System.out.println("Introduce el día: ");
        dia = teclado.nextInt();

        System.out.println("Introduce la hora: ");
        hora = teclado.nextInt();

        if (dia == 7 || hora == 10 || hora == 14 && dia != 6 || dia == 4 && hora == 12) {
            System.out.println("Hay bus");
        } else {
            System.out.println("No hay bus");
        }
    }
}
