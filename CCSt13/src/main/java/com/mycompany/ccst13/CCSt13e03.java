//Cristina Correa Segade
/*
Haz un programa que solicite al usuario dos números enteros y los intente dividir (división
entera, sin decimales). Si se produce algún error el programa no finalizará de forma abrupta si no
que capturará la excepción ocurrida: o bien entrada de valores incorrectos o bien por división por
cero, informando al usuario de lo que ha acontecido. Finalmente, mostrará el resultado de la división,
que será cero en caso de cualquiera de los dos errores posibles.
*/

package com.mycompany.ccst13;

import java.util.Scanner;


public class CCSt13e03 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero1, numero2;
        int division = 0;

        try {
            System.out.println("Introduce un número entero: ");
            numero1 = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce otro número entero: ");
            numero2 = Integer.parseInt(teclado.nextLine());
            
            if (numero2 != 0) {
                division = numero1 / numero2;
                System.out.println("La división es: " + division);
            } else {
                System.out.println("Error: El divisor no puede ser cero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada de valores incorrectos.");
        }
    }
}