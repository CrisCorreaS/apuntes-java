package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.3. Diseñar un algoritmo que permita introducir números positivos y nos vaya informando uno a 
uno  si es par o impar. El programa finalizará cuando se introduzca un número negativo. Hacer dos 
versiones, una primera con una lectura de teclado adelantada (antes de entrar en el bucle) y otra 
versión en la que la lectura de datos se haga únicamente al principio del bucle. 

Lectura del teclado adelantada:
 */
import java.util.Scanner;

public class Ejercicio03a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        
        System.out.println("Introduce un número");
        numero = teclado.nextInt();

        while (numero >= 0) {

            if (numero % 2 == 0) {
                System.out.println("Este númeo es par");
            } else {
                System.out.println("El número es impar");
            }
            
            System.out.println("Introduce un número");
            numero = teclado.nextInt();
        }

    }
}
