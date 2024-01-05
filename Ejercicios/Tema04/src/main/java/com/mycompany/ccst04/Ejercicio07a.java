package com.mycompany.ccst04;

// Cristina Correa Segade

/*
4.7. Un algoritmo de encriptado monoalfabético consiste en la sustitución de una letra por otra a 
lo largo de todo el mensaje,  por ejemplo las A por F, las B por X, las C por M. Obviamente si la A pasa 
a ser F, ninguna otra letra pasará F. Hacer un programa que le introduzca una cadena en mayúsculas 
y muestre la cadena encriptada en (todo lo que no sean letras mayúsculas se deja intacto: números, 
espacios en blanco, etc.). Hacer una segunda versión que funcione con mayúsculas y minúsculas. 
 */
import java.util.Scanner;

public class Ejercicio07a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena1, cadena2;
        int longitudPalabra, i, posicion;
        char letra, nueva;

        System.out.println("Introduce un texto: ");
        cadena1 = teclado.nextLine();

        longitudPalabra = cadena1.length();
        String plantilla = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        cadena2 = "";

        for (i = 0; i < longitudPalabra; i++) {
            letra = cadena1.charAt(i);
            posicion = plantilla.indexOf(letra);

            if (posicion != -1) {
                nueva = plantilla.charAt(25 - posicion);
            } else {
                nueva = letra;
            }

            cadena2 = cadena2 + nueva;
        }

        System.out.println("El texto introducido encriptado es: " + cadena2);
    }
}
