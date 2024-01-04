package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.7. Indica la funcionalidad del siguiente programa. ¿Tiene algún error?¿Falta alguna llave? 
¿Podrías reducir el recorrido del for para que el programa sea más rápido, manteniendo su 
funcionalidad? 

import java.util.Scanner; 
public class Ejercicios { 
    public static void main(String[] args) { 
        int num; 
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Introduce un número natural entre 1 y 1000: "); 
        num = teclado.nextInt(); 
        if (num <0 && num > 1000) 
           System.out.println("Numero incorrecto."); 
        else  
           for (int i=num;num>=1;i--)  
               if (num % i == 0) System.out.println(i); 
  }     }
 */
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Puse después la definición de num antes de introducir Scanner

        int num;
        
        System.out.println("Introduce un número natural entre 1 y 1000: ");//Aquí corregí el print() por println()
        num = teclado.nextInt();
        
        if (num < 0 && num > 1000) {
            System.out.println("Numero incorrecto.");
        } else {
            for (int i = num; i >= 1; i--) { //Aquí corregí la condición del for porque el número es estático pero el i es la variable
                if (num % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
