package com.mycompany.ccst02;
//Cristina Correa Segade
/*Leer dos números enteros y diga si el menor de ellos es divisor del mayor (prevenir
divisiones por cero, que causan error) Repasar operadores en cortocircuito para hacer
un solo if.
*/

import java.util.Scanner;

    public class CCSt02e01j {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int num1, num2;
                 System.out.println("Introduce el primer número: ");
                 num1 = teclado.nextInt();
                 
                 System.out.println("Introduce el segundo número: ");
                 num2 = teclado.nextInt();
                 
                
                if (num1<=num2 && num1!=0 && num2%num1==0 || 
                    num2<=num1 && num2!=0 && num1%num2==0) {
                    System.out.println("El número más pequeño es divisor del mayor");
                }
                 
                else {
                    System.out.println("El número más pequeños no es divisor del mayor");

                }
    }
}
