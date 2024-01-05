package com.mycompany.ccst04;

//Cristina Correa Segade
/*
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:  
d. Decir si la cadena contiene el carácter ‘x’ a partir de la cuarta posición. 
 */
import java.util.Scanner;

public class Ejercicio01d {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena;
        int posicion;

        System.out.println("Introduce un texto cualquiera: ");
        cadena = teclado.nextLine();
        
        posicion = cadena.indexOf('x', 4);

        if (posicion != -1) {
            System.out.println("En el texto introducido aparece el caracter x a partir de la cuarta posición");
        } else {
            System.out.println("En el texto introducido no aparece el caracter x a partir de la cuarta posición");
        }
    }
}
