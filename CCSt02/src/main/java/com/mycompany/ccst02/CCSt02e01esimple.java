package com.mycompany.ccst02;
//Cristina Correa Segade
//Leer dos números enteros y diga si al menos uno de los dos es mayor de 10.

import java.util.Scanner;

public class CCSt02e01esimple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        System.out.println("Introduce el primer número entero: ");
        num1 = teclado.nextInt();

        System.out.println("Introduce el segundo número entero: ");
        num2 = teclado.nextInt();

        
        if (num1 > 10 && num2 < 10 || num1 < 10 && num2 > 10 || num1 > 10 && num2 > 10) {
            System.out.println("Al menos un número es mayor de 10");
        } 
        else {
            System.out.println("Ninguno de los números es mayor de 10");

        }

    }
}
