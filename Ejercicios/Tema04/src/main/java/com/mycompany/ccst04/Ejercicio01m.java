package com.mycompany.ccst04;

//Cristina Correa Segade
/*
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:  
m. Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)  
 */
import java.util.Scanner;

public class Ejercicio01m {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena;
        int longitudPalabra, i;
        boolean palindromo = true;

        System.out.println("Introduce un texto: ");
        cadena = teclado.nextLine();
        
        longitudPalabra = cadena.length();

        for (i = 0; i < longitudPalabra / 2; i++) {
            char letraInicio = cadena.charAt(i);
            char letraFinal = cadena.charAt(longitudPalabra - 1 - i);

            if (Character.compare(letraInicio, letraFinal) == 0) {
                palindromo = true;
            } else {
                palindromo = false;
            }
        }

        if (palindromo) {
            System.out.println("El texto introducido es un palindromo");
        } else {
            System.out.println("El texto introducido no es un palindromo");
        }
    }
}
