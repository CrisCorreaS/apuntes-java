package com.mycompany.ccst02;
//Cristina Correa Segade
/*Diseñar un programa al que se le introduzcan por consola tres números enteros. Si todos son
negativos, mostrar el producto de los tres. Si alguno es negativo, pero no todos, mostrar la suma de
los tres. En caso de que todos sean positivos sumar los dos primeros y multiplicar dicha suma por el
tercero. ¿existe alguna combinación de los valores leídos no contemplado en el algoritmo? (Suponer
que el cero es un número positivo). Hacer el programa lo más sencillo posible.
*/

import java.util.Scanner;

    public class CCSt02e02 {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int num1, num2, num3;
                 System.out.println("Introduce el primer número entero: ");
                 num1 = teclado.nextInt();
                 
                 System.out.println("Introduce el segundo número entero: ");
                 num2 = teclado.nextInt();
                 
                 System.out.println("Introduce el tercer número entero: ");
                 num3 = teclado.nextInt();
                 
                
                if (num1<0 && num2<0 && num3<0) {
                    int result1= num1*num2*num3;
                
                    System.out.println("El resultado del producto de los tres números negativos es " + result1);
                }
                      
                else {
                    
                    if (num1<0 || num2<0 || num3<0) {
                        int result2= num1+num2+num3;    
                    
                        System.out.println("El resultado de la suma de los tres números cuando alguno es negativo es " + result2);
                    }
                      
                    else {
                    
                        if (num1>0 && num2>0 && num3>0) {
                            int result3= (num1+num2)*num3;    
                    
                            System.out.println("El resultado de la suma de los dos primeros números multiplicados por el tercero cuando todos son positivos es " + result3);
                        }
                      
                        else {
                            System.out.println("Los tres números son iguales a 0");
                        }
                    }
                }
    }
}
/*¿existe alguna combinación de los valores leídos no contemplado en el algoritmo?
No exite ya que el 0 es un número positivo según el enunciado
*/