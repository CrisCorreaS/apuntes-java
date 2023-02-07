package com.mycompany.ccst02;
//Cristina Correa Segade
//Leer dos números enteros y diga si uno y solo uno es mayor de 10.

import java.util.Scanner;

    public class CCSt02e01g {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int num1, num2;
                 System.out.println("Introduce el primer número entero: ");
                 num1 = teclado.nextInt();
                 
                 System.out.println("Introduce el segundo número entero: ");
                 num2 = teclado.nextInt();
                
                if (num1>10 && num2<10) {
                    System.out.println("El primer número es mayor de 10");
                }
                
                        
                else {
                    if (num1<10 && num2>10) {
                        System.out.println("El segundo número es mayor de 10");
                    }
                    
                    else {
                        if (num1<10 && num2<10) {
                            System.out.println("Ambos números son menores de 10");
                        }
                        else{
                            System.out.println("Ambos números son mayores o iguales a 10");
                        }
                    }

                }
    }
}
