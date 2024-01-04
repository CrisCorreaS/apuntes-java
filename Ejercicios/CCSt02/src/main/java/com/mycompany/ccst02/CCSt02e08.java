package com.mycompany.ccst02;
//Cristina Correa Segade
/*La tabla siguiente representa las horas de salida de un bus. Diseña un algoritmo al que se le
introduzca el día (1-7) y la hora (9-14), verifique la entrada y nos informe si hay bus o no. Hacer una
primera condición que haga la verificación de la entrada de datos y otra única condición para ver si
hay bus.
*/

import java.util.Scanner;

    public class CCSt02e08 {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int dia, hora;
                System.out.println("Introduce el día: ");
                dia = teclado.nextInt();
                
                System.out.println("Introduce la hora: ");
                hora = teclado.nextInt();
                
                if (dia==7 || hora==10 || hora==14 && dia!=6 || dia==4 && hora==12) {
                    System.out.println("Hay bus");
                }
                
                else {
                    System.out.println("No hay bus");
                }
    }
}
