package com.mycompany.ccst04;

//Cristina Correa Segade
/*
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:  
n. Crear una cadena que sea igual a la introducida, pero con la primera y última posiciones 
intercambiadas. Ejemplo: si introducen: “abcde”, obtendría “ebcda”.
 */
import java.util.Scanner;

public class Ejercicio01nSimple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String cadena = teclado.nextLine();

        StringBuilder sb = new StringBuilder(cadena);

        char primeraLetra = sb.charAt(0);
        char ultimaLetra = sb.charAt(sb.length() - 1);
        sb.setCharAt(0, ultimaLetra);
        sb.setCharAt(sb.length() - 1, primeraLetra);
        
        String inversa = sb.toString();

        System.out.println("Este es el texto introducido: " + cadena);
        System.out.println("Este es el texto introducido inverso: " + inversa);
    }
}
