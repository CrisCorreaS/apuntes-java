package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.9. Sumar una cantidad de números que se van introduciendo por teclado hasta que la suma de 
los mismos valga más de 100. 
 */
import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float numero, suma = 0;

        while (suma <= 100) {
            System.out.println("Introduce un número");
            numero = teclado.nextFloat();
            
            suma = suma + numero;
        }
        
        System.out.println("La suma total es igual a: " + suma);
    }
}
