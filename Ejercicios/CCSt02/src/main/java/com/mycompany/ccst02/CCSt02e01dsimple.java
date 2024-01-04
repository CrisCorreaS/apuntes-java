package com.mycompany.ccst02;
//Cristina Correa Segade
//Leer dos números enteros y diga si los dos son mayores de 10 o no lo son.

import java.util.Scanner;

public class CCSt02e01dsimple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        System.out.println("Introduce el primer número");
        num1 = teclado.nextInt();
        
        System.out.println("Introduce el segundo número");
        num2 = teclado.nextInt();
        
        if (num1>10 && num2 >10) {
            System.out.println("Los dos números son mayores de 10");
        }
        else {
            System.out.println("Ambos números no son mayores de 10");
        }
    }
}
