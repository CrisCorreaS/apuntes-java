package com.mycompany.ccst03;
//Cristina Correa Segade
// 3.1. Mostrar por pantalla la frase “esto es un bucle” 10 veces.

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont;

        for (cont = 1; cont <= 10; cont++) {
            System.out.println("Esto es un bucle");
        }

    }
}
