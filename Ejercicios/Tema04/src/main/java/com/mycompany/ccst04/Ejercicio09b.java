package com.mycompany.ccst04;

// Cristina Correa Segade

/*
4.9. Escribe un programa que solicite que se introduzca por teclado un nombre completo y una 
edad y muestre el siguiente mensaje. Hacer una versión utilizando la clase Format y otra versión con 
el método System.out.printf:

Hola, me llamo Pepe Pérez López y tengo 20 años 
suponiendo que se introduce Pepe Pérez López como nombre completo y 20 como edad.  

 */
import java.util.Scanner;

public class Ejercicio09b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre, numero;
        int edad;

        System.out.println("Introduce el nombre completo de una persona: ");
        nombre = teclado.nextLine();

        System.out.println("Introduce la edad de esa misma persona: ");
        numero = teclado.nextLine();
        
        edad = Integer.parseInt(numero);

        System.out.printf("Hola, me llamo " + nombre + " y tengo " + edad + " años");
    }
}
