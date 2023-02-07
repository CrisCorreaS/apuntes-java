package com.mycompany.ccst02;
//Cristina Correa Segade
//Leer un número entero y determinar si es mayor de 10.

import java.util.Scanner;

    public class CCSt02e01a {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int num1;
                 System.out.println("Introduce un número entero: ");
                 num1 = teclado.nextInt();
                
                if (num1>10) {
                    System.out.println("El número " + num1 + " es un número mayor a 10");
                }
                 
                else {
                    System.out.println("El número " + num1 + " es un número menor o igual a 10");

                }
    }
}
 