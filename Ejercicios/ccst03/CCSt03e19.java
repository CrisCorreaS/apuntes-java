package com.mycompany.ccst03;
//Cristina Correa Segade
/*Programa que se le introduzcan números por consola y que informe si estan ordenados
ascendentemente o no. El programa finaliza si se introduce cero o en cuanto se detecte que los
números no están ordenados.
 */
import java.util.Scanner;

public class CCSt03e19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numPresente, numPasado = 0;
        System.out.println("Escribe el primer número. Recuerda que a continuación tienes que poner los números en orden ascendente (0 para stop)");
        numPresente = teclado.nextInt();
        
        while (numPresente !=0 && numPasado == 0) {
            numPasado = numPresente;
            
            System.out.println("Escribe el siguiente número:");
            numPresente = teclado.nextInt();
        }
        
        while (numPresente != 0 && numPasado <= numPresente) {
            numPasado = numPresente;
            System.out.println("Escribe el siguiente número");
            numPresente = teclado.nextInt();
        }
        
        if (numPresente == 0) {
            System.out.println("Se ha parado el programa al escribir 0");
        } 
        
        else {
            System.out.println("Los números están ordenados de forma incorrecta");
        }
    }
}
