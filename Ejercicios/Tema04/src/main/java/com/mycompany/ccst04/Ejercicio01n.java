package com.mycompany.ccst04;

//Cristina Correa Segade
/*
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:  
n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones 
intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.
 */
import java.util.Scanner;

public class Ejercicio01n {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena, inversa;
        int longitudPalabra, i;

        System.out.println("Introduce un texto: ");
        cadena = teclado.nextLine();
        
        inversa = "";
        longitudPalabra = cadena.length();

        for (i = longitudPalabra - 1; i >= 0; i--) {
            inversa = inversa + cadena.charAt(i);
        }

        System.out.println("Este es el texto introducido: " + cadena);
        System.out.println("Este es el texto introducido inverso: " + inversa);
    }
}
