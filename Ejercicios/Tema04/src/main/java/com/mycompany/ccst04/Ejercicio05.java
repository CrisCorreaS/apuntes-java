package com.mycompany.ccst04;

//Cristina Correa Segade

/*
4.5. (Opcional) Realiza un programa que muestre una contraseña generada aleatoriamente 
teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden ser letras entre 
la ‘a’ y la ‘j’ pero sin letras repetidas.  
 */
import java.util.Random;

public class Ejercicio05 {

    public static void main(String[] args) {
        Random r = new Random();

        String plantilla, cadena;
        int longitudPalabra, i, posicion;
        char letra;

        plantilla = "abcdefghij";
        cadena = "";
        longitudPalabra = r.nextInt(5) + 5;

        for (i = 0; i < longitudPalabra; i++) {
            posicion = r.nextInt(8);

            letra = plantilla.charAt(posicion);

            if (cadena.contains(String.valueOf(letra))) {
                i--;
            } else {
                cadena += letra;
            }
        }

        System.out.println("La contraseña generada aleatoriamente es: " + cadena);
    }
}
