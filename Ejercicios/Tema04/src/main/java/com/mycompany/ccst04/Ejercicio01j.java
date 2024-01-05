package com.mycompany.ccst04;

//Cristina Correa Segade
/*
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:  
j. Si se encuentra en su interior con “prueva” sustituir por “prueba”. 

 */
import java.util.Scanner;

public class Ejercicio01j {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena;

        System.out.println("Introduce un texto: ");
        cadena = teclado.nextLine();
        cadena = cadena.replace("prueva", "prueba");

        System.out.println(cadena);
    }
}
