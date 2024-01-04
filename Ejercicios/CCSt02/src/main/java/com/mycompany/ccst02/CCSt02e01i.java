package com.mycompany.ccst02;
//Cristina Correa Segade
/*Leer dos números enteros y diga si el segundo es divisor del primero (prevenir divisiones
por cero, que causan error) Repasar operadores en cortocircuito para hacer un solo if.
*/

import java.util.Scanner;

    public class CCSt02e01i {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int num1, num2;
                 System.out.println("Introduce el primer número: ");
                 num1 = teclado.nextInt();
                 
                 System.out.println("Introduce el segundo número: ");
                 num2 = teclado.nextInt();
                
                if (num2!=0 && num1%num2==0) {
                    System.out.println("El segundo número es divisor del primero");
                }
                 
                else {
                    System.out.println("El segundo número no es divisor del primero");

                }
    }
}
