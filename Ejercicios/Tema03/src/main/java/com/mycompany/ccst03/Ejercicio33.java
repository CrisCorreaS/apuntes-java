package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.33.  (Opcional) Amplia el programa anterior para que el usuario pueda introducir previamente la 
base destino y el programa pueda pasar a binario (base 2), ternario (base 4) u octal (base 8). 
 */
import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el número entero que deseas convertir:");
        int numero = teclado.nextInt();

        System.out.println("Escribe en qué base quieres convertir el número:");
        int base = teclado.nextInt();

        long nuevoNum = convertirBase(numero, base);

        System.out.println("El número " + numero + " en base " + base + " es: " + nuevoNum);
    }

    private static long convertirBase(int numero, int base) {
        long numeroNuevo = 0;
        int posicion = 1;

        while (numero > 0) {
            int resto = numero % base;

            numeroNuevo += resto * posicion;
            numero /= base;
            posicion *= 10;
        }

        return numeroNuevo;
    }
}
