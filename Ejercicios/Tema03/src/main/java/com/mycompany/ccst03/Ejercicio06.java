package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.6. Diseñar un programa que muestre los números pares comprendidos entre 100 y 1 en orden 
descendente
 */
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        int numero;

        for (numero = 2; numero <= 100; numero += 2) {
            System.out.println(numero);
        }

    }
}
//Lo hice que fuera del 1 al 100, pero también se podría hacer al revés
