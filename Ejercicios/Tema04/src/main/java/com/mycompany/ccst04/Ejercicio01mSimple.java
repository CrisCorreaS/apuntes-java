package com.mycompany.ccst04;

//Cristina Correa Segade
/*
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:  
m. Decir si la cadena es un palíndromo (se lee igual hacia adelante como hacia atrás)  
 */
import java.util.Scanner;

public class Ejercicio01mSimple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();

        StringBuilder sb = new StringBuilder(cadena);

        sb.reverse();
        String cadenaReves = sb.toString();

        String resultado = cadena.equals(cadenaReves) ? " es un palíndromo" : " no es un palíndromo";

        System.out.println("La cadena " + cadena + resultado);
    }
}
