package com.mycompany.ccst04;

//Cristina Correa Segade
/*
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:  
e. Crear una cadena formada por las 5 primeras posiciones de la cadena. 
 */
import java.util.Scanner;

public class Ejercicio01e {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena, subcadena;
        
        System.out.println("Introduce un texto cualquiera: ");
        cadena = teclado.nextLine();
        
        subcadena = cadena.substring(0, 5);
        System.out.println(subcadena);
    }
}
