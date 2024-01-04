package com.mycompany.ccst02;
//Cristina Correa Segade
/*Realizar un programa que informe si un año introducido previamente es bisiesto o no. Son
bisiestos los años múltiplos de 4 que no sean múltiplos de 100. Como excepción los múltiplos de 400
también son bisiestos. Se puede hacer una primera versión con varias sentencias condicionales y
otra más sofisticada con una sola. No usar las clases de fechas de Java.
*/

import java.util.Scanner;

    public class CCSt02e07 {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int year;
                 System.out.println("Introduce el año: ");
                 year = teclado.nextInt();
                
                if (year%4==0 && year%100!=0 || year%400==0) {
                    System.out.println("El año " + year + " es un año bisiesto");
                }
                 
                else {
                    System.out.println("El año " + year + " no es un año bisiesto");

                }
    }
}
