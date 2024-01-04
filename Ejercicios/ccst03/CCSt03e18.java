package com.mycompany.ccst03;
//Cristina Correa Segade
/*Mostrar las tablas de multiplicar del 1 al 9.
*/
import java.util.Scanner;

    public class CCSt03e18 {
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
               int cont, num, multiplicacion=0;
               
               System.out.println("La tabla de multiplicar del 1 es: ");
               for (cont=0; cont<=10; cont++) {
                    multiplicacion = 1*cont;
                    System.out.println("1 x " + cont + " = " + multiplicacion);
               }
               
               System.out.println("La tabla de multiplicar del 2 es: ");
               for (cont=0; cont<=10; cont++) {
                    multiplicacion = 2*cont;
                    System.out.println("2 x " + cont + " = " + multiplicacion);
               }
               
               System.out.println("La tabla de multiplicar del 3 es: ");
               for (cont=0; cont<=10; cont++) {
                    multiplicacion = 3*cont;
                    System.out.println("3 x " + cont + " = " + multiplicacion);
               }
               
               System.out.println("La tabla de multiplicar del 4 es: ");
               for (cont=0; cont<=10; cont++) {
                    multiplicacion = 4*cont;
                    System.out.println("4 x " + cont + " = " + multiplicacion);
               }
               
               System.out.println("La tabla de multiplicar del 5 es: ");
               for (cont=0; cont<=10; cont++) {
                    multiplicacion = 5*cont;
                    System.out.println("5 x " + cont + " = " + multiplicacion);
               }
               
               System.out.println("La tabla de multiplicar del 6 es: ");
               for (cont=0; cont<=10; cont++) {
                    multiplicacion = 6*cont;
                    System.out.println("6 x " + cont + " = " + multiplicacion);
               }
               
               System.out.println("La tabla de multiplicar del 7 es: ");
               for (cont=0; cont<=10; cont++) {
                    multiplicacion = 7*cont;
                    System.out.println("7 x " + cont + " = " + multiplicacion);
               }
               
               System.out.println("La tabla de multiplicar del 8 es: ");
               for (cont=0; cont<=10; cont++) {
                    multiplicacion = 8*cont;
                    System.out.println("8 x " + cont + " = " + multiplicacion);
               }
               
               System.out.println("La tabla de multiplicar del 9 es: ");
               for (cont=0; cont<=10; cont++) {
                    multiplicacion = 9*cont;
                    System.out.println("9 x " + cont + " = " + multiplicacion);
               }
    }
}
