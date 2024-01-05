package com.mycompany.ccst04;

//Cristina Correa Segade
/*
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:  
b. Decir si en la cadena aparece el carácter ‘x’. 
 */
import java.util.Scanner;

public class Ejercicio01b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena;
        int posicion;

        System.out.println("Introduce un texto: ");
        cadena = teclado.nextLine();
        
        posicion = cadena.indexOf('x');

        if (posicion != -1) {
            System.out.println("En el texto introducido aparece el carácter x");
        } else {
            System.out.println("En el texto introducido no aparece el carácter x");
        }
    }
}
