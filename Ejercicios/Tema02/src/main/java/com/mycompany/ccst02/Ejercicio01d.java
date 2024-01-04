//Cristina Correa Segade

/*
2.1 Hacer programas sencillos que hagan lo siguiente: 

d) Leer dos números enteros y diga si los dos son mayores de 10 o no lo son. 

 */
package com.mycompany.ccst02;
//Leer dos números enteros y diga si los dos son mayores de 10 o no lo son.

import java.util.Scanner;

public class Ejercicio01d {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        
        System.out.println("Introduce el primer número entero: ");
        num1 = teclado.nextInt();

        System.out.println("Introduce el segundo número entero: ");
        num2 = teclado.nextInt();

        if (num1 > 10 && num2 > 10) {
            System.out.println("Ambos números son mayores de 10");
        } else {
            if (num1 < 10 && num2 < 10) {
                System.out.println("Ambos números son menores de 10");
            } else {
                if (num1 == 10 && num2 == 10) {
                    System.out.println("Ambos números son iguales a 10");
                } else {
                    if (num1 > 10 || num2 < 10) {
                        System.out.println("El primer número es mayor de 10 y el segundo número es menor de 10");
                    } else {
                        System.out.println("El segundo número es mayor de 10 pero el primer número es menor de 10");
                    }
                }
            }

        }

    }
}
