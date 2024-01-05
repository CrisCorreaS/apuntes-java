package com.mycompany.ccst04;

// Cristina Correa Segade

/*
4.8. Realizar un programa que solicite una cadena, un número que indica una posición de la 
cadena  y una letra. El programa reemplazará sobre la misma cadena, el carácter que hubiera en la 
posición indicada por la letra introducida. Hacer dos versiones, la primera con String y otra con 
StringBuilder.  
 */
import java.util.Scanner;

public class Ejercicio08a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena1, cadena2, numero;
        int longitudTexto, posicion, i;
        char letra, nueva;

        System.out.println("Introduce un texto: ");
        cadena1 = teclado.nextLine();
        cadena2 = "";
        longitudTexto = cadena1.length();

        System.out.println("Introduce el número que indique una posición del texto (Ten en cuenta que van de 0 al número de letras que tenga el texto): ");
        numero = teclado.nextLine();
        posicion = Integer.parseInt(numero);

        System.out.println("Introduce una letra que quieras introducir en esa posición: ");
        letra = teclado.nextLine().charAt(0);

        for (i = 0; i < longitudTexto; i++) {
            if (i != posicion) {
                nueva = cadena1.charAt(i);
            } else {
                nueva = letra;
            }

            cadena2 += nueva;
        }

        System.out.println("El texto introducido y ahora modificado es: " + cadena2);
    }
}
