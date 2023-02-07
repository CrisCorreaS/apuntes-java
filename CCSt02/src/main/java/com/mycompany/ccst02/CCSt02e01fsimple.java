package com.mycompany.ccst02;
//Cristina Correa Segade
//Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos).

import java.util.Scanner;

    public class CCSt02e01fsimple {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int num1;
                 System.out.println("Introduce un número entero: ");
                 num1 = teclado.nextInt();
                
                if (num1>=10 && num1<=20) {
                    System.out.println("El número " + num1 + " es un número comprendido en el intervalo entre 10 y 20");
                }
                 
                else {
                    System.out.println("El número " + num1 + " no está comprendido entre 10 y 20");
                }
    }
}
