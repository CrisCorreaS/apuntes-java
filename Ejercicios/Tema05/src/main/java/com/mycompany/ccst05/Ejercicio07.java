//Cristina Correa Segade
/*
5.7.  Un número primo es aquel que solo tiene como divisores el número 1 y a él mismo. Usando 
la función del programa anterior, haz un programa que muestre la suma de los números primos 
comprendidos entre 1 y 1000. 
 */
package com.mycompany.ccst05;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long suma = 0;

        for (int i = 2; i <= 1000; i++) {
            if (esPrimo(i)) {
                suma += i;
            }
        }
        System.out.println("La suma de los números primo comprendidos entre 1 y 1000 es " + suma);
    }

    public static int cantidadDivisores(int numero) {
        int resultado = 0;
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                resultado += 1;
            }
        }
        return resultado;
    }

    public static boolean esPrimo(int numero) {
        if (cantidadDivisores(numero) == 2) {
            return true;
        } else {
            return false;
        }
    }

}
