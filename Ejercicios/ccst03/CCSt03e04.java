package com.mycompany.ccst03;
//Cristina Correa Segade
/*Diseñar un programa capaz de leer un valor entero, que verifique que esté comprendido entre
1 y 10, y mostrar su tabla de multiplicar.
*/
import java.util.Scanner;

    public class CCSt03e04 {
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int numero, cont;
                System.out.println("Introduce un número entre 1 y 10");
                numero = teclado.nextInt();
                
                if (numero>=1 && numero<=10) {
                    System.out.println("Este número está comprendido entre 1 y 10");
                    System.out.println("Su tabla de multiplicar es la siguiente: ");
                    for(cont=1; cont<=10; cont++) {
                        int multiplicacion;
                        multiplicacion=numero*cont;
                        System.out.println(numero + "x" + cont + " = " + multiplicacion);
                    }
                               
                }
                
                else {
                    System.out.println("Este número no está comprendido en el intervalo 1-10");
                }
    }
}
