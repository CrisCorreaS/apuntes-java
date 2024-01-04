//Cristina Correa Segade

/*
2.1 Hacer programas sencillos que hagan lo siguiente: 

m) Leer tres números enteros y diga hay alguno mayor que cero, pero no todos. 
 */
package com.mycompany.ccst02;
//Leer tres números enteros y diga hay alguno mayor que cero, pero no todos.

import java.util.Scanner;

public class Ejercicio01mSimple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Introduce el primer número entero: ");
        num1 = teclado.nextInt();

        System.out.println("Introduce el segundo número entero: ");
        num2 = teclado.nextInt();

        System.out.println("Introduce el tercer número entero: ");
        num3 = teclado.nextInt();

        if (num1 > 0 && num2 > 0 && num3 <= 0
                || num1 > 0 && num2 <= 0 && num3 <= 0
                || num1 > 0 && num2 <= 0 && num3 > 0
                || num1 <= 0 && num2 <= 0 && num3 > 0
                || num1 <= 0 && num2 > 0 && num3 > 0
                || num1 <= 0 && num2 > 0 && num3 <= 0) {
            System.out.println("Hay algún número mayor de cero pero no todos");
        } else {
            System.out.println("Todos los números son mayores, menores o iguales a cero");

        }
    }
}
