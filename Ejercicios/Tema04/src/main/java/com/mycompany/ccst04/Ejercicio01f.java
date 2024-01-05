package com.mycompany.ccst04;

//Cristina Correa Segade
/*
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:  
f. Crear una cadena formada por las 5 últimas posiciones de la cadena. 
 */
import java.util.Scanner;

public class Ejercicio01f {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena, subcadena;
        int i;

        System.out.println("Introduce un texto cualquiera: ");
        cadena = teclado.nextLine();
        
        i = cadena.length();
        i -= 5;
        subcadena = cadena.substring(i);
        
        System.out.println(subcadena);
    }
}
