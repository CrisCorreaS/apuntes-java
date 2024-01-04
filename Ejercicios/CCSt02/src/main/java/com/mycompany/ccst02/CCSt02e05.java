package com.mycompany.ccst02;
//Cristina Correa Segade
/*Diseñar un algoritmo al que se le introduzca la cantidad de horas, minutos y segundo
mostrados en un reloj digital, que verifique que los valores sean correctos y calcule el total de
segundos transcurridos desde el comienzo del día. No emplear las clases de fecha de Java.
*/

import java.util.Scanner;

    public class CCSt02e05 {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int horas, minutos, segundos;
                 System.out.println("Introduce el número de horas: ");
                 horas = teclado.nextInt();
                 
                 System.out.println("Intoduce el número de minutos: ");
                 minutos = teclado.nextInt();
                 
                 System.out.println("Introduce el número de segundos: ");
                 segundos = teclado.nextInt();
                 
                
                if (segundos<=59 && minutos<=59 && horas<=23) {
                    int segtot;
                    segtot = horas*60*60 + minutos*60 + segundos;
                    System.out.println("La hora verificada es: " + horas + ":" + minutos + ":" + segundos + " y la cantidad de segundos es igual a: " + segtot + " segundos");
                }
                      
                else {
                    System.out.println("La hora está mal");
                    
                }
    }
}
