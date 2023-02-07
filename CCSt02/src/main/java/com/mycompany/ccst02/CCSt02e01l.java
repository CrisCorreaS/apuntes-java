package com.mycompany.ccst02;
//Cristina Correa Segade
//Leer tres números enteros y diga hay alguno mayor que cero.

import java.util.Scanner;

    public class CCSt02e01l {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int num1, num2, num3;
                 System.out.println("Introduce el primer número entero: ");
                 num1 = teclado.nextInt();
                 
                 System.out.println("Introduce el segundo número entero: ");
                 num2 = teclado.nextInt();
                 
                 System.out.println("Introduce el tercer número entero: ");
                 num3 = teclado.nextInt();
                
                if (num1>0 || num2>0 || num3>0) {
                    System.out.println("Uno de los tres números es mayor de 0");
                }
                      
                else {
                    
                    System.out.println("Ningún número es mayor de 0");

                }
    }
}
