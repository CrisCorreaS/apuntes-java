package com.mycompany.ccst02;
//Cristina Correa Segade
//Leer tres números enteros y diga hay alguno mayor que cero, pero no todos.

import java.util.Scanner;

    public class CCSt02e01m {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int num1, num2, num3;
                 System.out.println("Introduce el primer número entero: ");
                 num1 = teclado.nextInt();
                 
                 System.out.println("Introduce el segundo número entero: ");
                 num2 = teclado.nextInt();
                 
                 System.out.println("Introduce el tercer número entero: ");
                 num3 = teclado.nextInt();
                
                if (num1>0 && num2>0 && num3<=0) {
                    System.out.println("Los dos primeros números son mayores de 0");
                }
                      
                else {
                    if (num1<=0 && num2>0 && num3>0) {
                     System.out.println("Los dos últimos números son mayores de 0");
                    }
                 
                    else {
                        if (num1>0 && num2<=0 && num3>0) {
                            System.out.println("El primer y el segundo número son mayores de 0");
                        }
                        
                        else {
                            if (num1>0 && num2<=0 && num3<=0) {
                            System.out.println("El primer número es mayor de 0");
                            }
                            
                            else {
                                if (num1<=0 && num2>0 && num3<=0) {
                                    System.out.println("El segundo número es mayor de 0"); 
                                }
                                
                                else {
                                    if (num1<=0 && num2<=0 && num3>0) {
                                        System.out.println("El tercer número es mayor de 0"); 
                                    }
                                
                                    else {
                                        System.out.println("Todos los números son mayores o menores de 0");
                                    }
                                }
                            }
                        }
                    }

                }
    }
}