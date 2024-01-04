package com.mycompany.ccst02;
//Cristina Correa Segade
/*Realizar un programa que se le introduzca una nota (un valor entero entre 0 y 10) y nos
muestre por pantalla la nota final en texto, con la siguiente equivalencia: Muy deficiente (0,1,2),
Insuficiente (3,4), Aprobado (5,6), Notable (7,8) y Sobresaliente (9,10). Haz una versión con switch + “case ->”
*/

import java.util.Scanner;

    public class CCSt02e13c {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int nota;
                 System.out.println("Introduce una nota de 0 a 10: ");
                 nota = teclado.nextInt();
                 
                switch (nota){
                    
                    case 0 -> System.out.println("Muy deficiente");
                    case 1 -> System.out.println("Muy deficiente");
                    case 2 -> System.out.println("Muy deficiente");
                    case 3 -> System.out.println("Insuficiente");
                    case 4 -> System.out.println("Insuficiente");
                    case 5 -> System.out.println("Aprobado"); 
                    case 6 -> System.out.println("Aprobado"); 
                    case 7 -> System.out.println("Notable");
                    case 8 -> System.out.println("Notable");
                    case 9 -> System.out.println("Sobresaliente");
                    case 10 -> System.out.println("Sobresaliente");
                    default -> System.out.println("No es válida esa nota");
                }
    }
}
