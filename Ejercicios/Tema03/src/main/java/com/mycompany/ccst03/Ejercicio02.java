package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.2. Mostrar por pantalla los n primeros números naturales, siendo n el valor tecleado 
previamente.  
 */
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont, numero;
        
        System.out.println("Introduce el número de veces");
        numero = teclado.nextInt();

        for (cont = 1; cont <= numero; cont++) {
            System.out.println(cont);
        }

    }
}
