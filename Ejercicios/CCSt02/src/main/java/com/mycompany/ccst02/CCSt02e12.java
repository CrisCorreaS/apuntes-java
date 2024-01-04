package com.mycompany.ccst02;
//Cristina Correa Segade
/*Introduciendo dos fechas (día, mes, año), hacer un programa que nos diga cuál de las dos es
mayor (agrupa las condiciones de día, mes y año en una sola sentencia condicional). Suponemos que
se introducen fechas válidas y no empleamos las clases de fecha de Java.
*/

import java.util.Scanner;

    public class CCSt02e12 {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int dia1, mes1, year1, dia2, mes2, year2;
                 System.out.println("Introduce el día de la primera fecha: ");
                 dia1 = teclado.nextInt();
                 
                 System.out.println("Introduce el mes de la primera fecha: ");
                 mes1 = teclado.nextInt();
                 
                 System.out.println("Introduce el año de la primera fecha: ");
                 year1 = teclado.nextInt();
                 
                 System.out.println("Introduce el día de la segunda fecha: ");
                 dia2 = teclado.nextInt();
                 
                 System.out.println("Introduce el mes de la segunda fecha: ");
                 mes2 = teclado.nextInt();
                 
                 System.out.println("Introduce el año de la segunda fecha: ");
                 year2 = teclado.nextInt();
                
                if (year1<year2) {
                    System.out.println("La primera fecha es menor que la segunda");
                }
                      
                else {
                    if (year1==year2) {
                        if (mes1<mes2) {
                            System.out.println("La primera fecha es menor que la segunda");
                        }
                        else {
                            if (mes1==mes2) {
                                if (dia1<dia2) {
                                    System.out.println("La primera fecha es menor que la segunda");
                                }
                                else {
                                    if (dia1==dia2) {
                                        System.out.println("La fecha es la misma");
                                    }
                                    else {
                                        System.out.println("La primera fecha es mayor que la segunda");
                                    }
                                    
                                }
                            }
                            else {
                                System.out.println("La primera fecha es mayor que la segunda");
                            }
                        }
                    }
                    else {
                        System.out.println("La primera fecha es mayor que la segunda");
                    }
                   
                }
       }
}