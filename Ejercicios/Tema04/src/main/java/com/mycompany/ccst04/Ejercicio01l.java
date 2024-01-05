package com.mycompany.ccst04;

//Cristina Correa Segade
/*
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:  
l. Decir cuántos dígitos numéricos hay en la cadena.                            
 */
import java.util.Scanner;

public class Ejercicio01l {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena;
        int longitudPalabra, digitos = 0, i;
        char letra;

        System.out.println("Introduce un texto: ");
        cadena = teclado.nextLine();
        
        longitudPalabra = cadena.length();

        for (i = longitudPalabra - 1; i >= 0; i--) {
            letra = cadena.charAt(i);
            
            if (Character.isDigit(letra)) {
                digitos++;
            }
        }

        System.out.println("El número total de digitos introducidos es igual a " + digitos);

    }
}
