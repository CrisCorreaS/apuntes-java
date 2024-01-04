package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.3. Diseñar un algoritmo que permita introducir números positivos y nos vaya informando uno a 
uno  si es par o impar. El programa finalizará cuando se introduzca un número negativo. Hacer dos 
versiones, una primera con una lectura de teclado adelantada (antes de entrar en el bucle) y otra 
versión en la que la lectura de datos se haga únicamente al principio del bucle. 

Lectura de datos únicamente al principio del bucle:
 */
import java.util.Scanner;

public class Ejercicio03b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;

        while (numero >= 0) {
            System.out.println("Introduce un número");
            numero = teclado.nextInt();
            
            if (numero % 2 == 0) {
                System.out.println("Este númeo es par");
            } else {
                System.out.println("El número es impar");
            }
        }

    }
}
