package com.mycompany.ccst02;
//Cristina Correa Segade
/*
2.13. Realizar un programa que se le introduzca una nota (un valor entero entre 0 y 10) y nos
muestre por pantalla la nota final en texto, con la siguiente equivalencia: Muy deficiente (0,1,2),
Insuficiente (3,4), Aprobado (5,6), Notable (7,8) y Sobresaliente (9,10). Haz una versión con if
anidados.
 */

import java.util.Scanner;

public class Ejercicio13a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota;
        System.out.println("Introduce una nota de 0 a 10: ");
        nota = teclado.nextInt();

        if (nota < 3) {
            System.out.println("Muy deficiente");
        } else {
            if (nota <= 4) {
                System.out.println("Inuficiente");
            } else {
                if (nota <= 6) {
                    System.out.println("Aprobado");
                } else {
                    if (nota <= 8) {
                        System.out.println("Notable");
                    } else {
                        System.out.println("Sobresaliente");
                    }
                }
            }

        }
    }
}
