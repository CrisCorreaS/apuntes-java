package com.mycompany.ccst02;
//Cristina Correa Segade
//Leer un número entero y de determinar si se trata de un número par o impar.

import java.util.Scanner;

public class CCSt02e01c {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;
        System.out.println("Introduce un número entero: ");
        num1 = teclado.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("El número " + num1 + " es par");
        } 
        
        else {
            System.out.println("El número " + num1 + " es impar");
        }

    }
}
