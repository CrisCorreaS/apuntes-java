package com.mycompany.ccst04;

// Cristina Correa Segade

/*
4.8. Realizar un programa que solicite una cadena, un número que indica una posición de la 
cadena  y una letra. El programa reemplazará sobre la misma cadena, el carácter que hubiera en la 
posición indicada por la letra introducida. Hacer dos versiones, la primera con String y otra con 
StringBuilder.  

Este lo hice sin bucle para variar ya que en el enunciado no decía que se hiciera y
en el 8a lo hice para probar cómo sería.
 */
import java.util.Scanner;

public class Ejercicio08b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena1, numero;
        int posicion;
        char letra;

        System.out.println("Introduce un texto: ");
        cadena1 = teclado.nextLine();

        System.out.println("Introduce el número que indique una posición del texto (Ten en cuenta que van de 0 al número de letras que tenga el texto): ");
        numero = teclado.nextLine();
        
        posicion = Integer.parseInt(numero);

        System.out.println("Introduce una letra que quieras introducir en esa posición: ");
        letra = teclado.nextLine().charAt(0);

        StringBuilder cadena2 = new StringBuilder(cadena1);
        cadena2.setCharAt(posicion, letra);
        cadena1 = cadena2.toString();

        System.out.println("El texto introducido y ahora modificado es: " + cadena1);

    }
}
