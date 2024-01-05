package com.mycompany.ccst04;

//Cristina Correa Segade
/*
4.1. Realizar un programa al que se le introduzca una cadena por teclado y haga lo siguiente:  
c. Decir si la cadena tiene más de 10 posiciones. 

 */
import java.util.Scanner;

public class Ejercicio01c {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena;
        int longitud;
        
        System.out.println("Introduce un texto cualquiera: ");
        cadena = teclado.nextLine();
        
        longitud = cadena.length();
        
        if(longitud > 10) {
            System.out.println("El texto tiene más de 10 posiciones");
        } 
        else {
            System.out.println("El texto no tiene más de 10 posiciones");
        }
    }
}
