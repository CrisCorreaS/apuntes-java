//Cristina Correa Segade

/*
2.1 Hacer programas sencillos que hagan lo siguiente:

k) Leer un número y decir si es múltiplo de 2, de 3 y/o de 10.  Si no es múltiplo de 2 ya no 
hay que mirar si lo es de 10. 

 */
package com.mycompany.ccst02;

/*Leer un número y decir si es múltiplo de 2, de 3 y/o de 10. Si no es múltiplo de 2 ya no
hay que mirar si lo es de 10.
 */

import java.util.Scanner;

public class Ejercicio01k {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;
        
        System.out.println("Introduce un número entero: ");
        num1 = teclado.nextInt();

        if (num1 % 10 == 0 && num1 % 3 == 0) {
            System.out.println("El número " + num1 + " es un número divisible entre 2, 3 y 10");
        } else {
            if (num1 % 10 == 0) {
                System.out.println("El número " + num1 + " es un número divisible entre 2 y 10");
            } else {
                if (num1 % 2 == 0 && num1 % 3 == 0) {
                    System.out.println("El número " + num1 + " es un número divisible entre 2 y 3");
                } else {
                    if (num1 % 3 == 0) {
                        System.out.println("El número " + num1 + " es un número divisible entre 3");
                    } else {
                        if (num1 % 2 == 0) {
                            System.out.println("El número " + num1 + " es un número divisible entre 2");
                        } else {
                            System.out.println("El número " + num1 + ", es un número que no se puede dividir entre 2, 3 o 10");
                        }
                    }
                }
            }

        }
    }
}
