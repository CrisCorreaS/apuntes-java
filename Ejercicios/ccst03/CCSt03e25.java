package com.mycompany.ccst03;
//Cristina Correa Segade
/*Mostrar por pantalla alternativamente “hola” y “adiós” hasta completar x líneas, siendo x un
número entero positivo tecleado previamente (ojo: el número x puede ser par o impar)
 */
import java.util.Scanner;

public class CCSt03e25 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int x, cont;
        System.out.println("¿Cuantas lí­neas quieres hacer?");
        x = teclado.nextInt();
        for (cont = 1; cont <= x; cont++) {
            if(cont%2==0){
            System.out.println("adios");
            }
            else System.out.println("hola");   
        }
    }
}