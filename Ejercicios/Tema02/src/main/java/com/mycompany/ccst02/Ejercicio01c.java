//Cristina Correa Segade

/*
2.1 Hacer programas sencillos que hagan lo siguiente: 

c) Leer un número entero y de determinar si se trata de un número par o impar. 
 */
package com.mycompany.ccst02;
//Leer un número entero y de determinar si se trata de un número par o impar.

import java.util.Scanner;

public class Ejercicio01c {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;
        
        System.out.println("Introduce un número entero: ");
        num1 = teclado.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("El número " + num1 + " es par");
        } else {
            System.out.println("El número " + num1 + " es impar");
        }

    }
}
