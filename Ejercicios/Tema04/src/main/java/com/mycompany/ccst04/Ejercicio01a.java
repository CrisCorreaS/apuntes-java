package com.mycompany.ccst04;

//Cristina Correa Segade
/*
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:  
a. Mostrar por pantalla el contenido de la cadena pasada a mayúsculas y minúsculas. 
 */
import java.util.Scanner;

public class Ejercicio01a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena, mayus, minus;

        System.out.println("Introduce un texto cualquiera: ");
        cadena = teclado.nextLine();

        mayus = cadena.toUpperCase();
        System.out.println(mayus);

        minus = cadena.toLowerCase();
        System.out.println(minus);

    }
}
