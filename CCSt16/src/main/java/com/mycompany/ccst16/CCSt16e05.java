//Cristina Correa Segade
/*
Escribe un programa que solicite al usuario que introduzca una cadena y verifique, mediante
expresiones regulares, si la cadena se corresponde con:
a) Una matrícula de coche (4 dígitos y 3 letras mayúsculas).
b) Un número binario de una o más posiciones.
c) Un número hexadecimal de entre 5 y 8 posiciones.
d) Una fecha en formato YYYY-MM-DD (solo formato, no valida días del mes).
e) Como el anterior, pero admite también que el día o el mes esté en un solo dígito.
f) Un nombre de usuario en twitter, empieza por @ y puede contener letras mayúsculas
y minúsculas, números, guiones y guiones bajos (entre 2 y 15 caracteres)
*/

package com.mycompany.ccst16;

import java.util.Scanner;


public class CCSt16e05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // a) Una matrícula de coche (4 dígitos y 3 letras mayúsculas).
        System.out.println("Introduce una matrícula: ");
        String matricula = teclado.nextLine().toUpperCase();
        String comprobarMatricula = "\\d{4}[A-Z]{3}";
        if (matricula.matches(comprobarMatricula)) {
            System.out.println("Correcto");
        } else {
            System.out.println("La cadena no cumple las condiciones de 4 dígitos y 3 letras mayúsculas");
        }

        // b) Un número binario de una o más posiciones.
        System.out.println("Introduce un número binario: ");
        String numeroBinario = teclado.nextLine();
        String comprobarBinario = "[01]+";
        if (numeroBinario.matches(comprobarBinario)) {
            System.out.println("Correcto");
        } else {
            System.out.println("La cadena no es un número binario válido");
        }

        // c) Un número hexadecimal de entre 5 y 8 posiciones.
        System.out.println("Introduce un número hexadecimal: ");
        String numeroHexadecimal = teclado.nextLine();
        String comprobarHexadecimal = "[0-9A-Fa-f]{5,8}";
        if (numeroHexadecimal.matches(comprobarHexadecimal)) {
            System.out.println("Correcto");
        } else {
            System.out.println("La cadena no es un número hexadecimal válido");
        }

        // d) Una fecha en formato YYYY-MM-DD (solo formato, no valida días del mes).
        System.out.println("Introduce una fecha en formato YYYY-MM-DD: ");
        String fecha = teclado.nextLine();
        String comprobarFecha = "\\d{4}-\\d{2}-\\d{2}";
        if (fecha.matches(comprobarFecha)) {
            System.out.println("Correcto");
        } else {
            System.out.println("La cadena no es una fecha válida en formato YYYY-MM-DD");
        }

        // e) Como el anterior, pero admite también que el día o el mes esté en un solo dígito.
        System.out.println("Introduce una fecha en formato YYYY-M-D: ");
        String fecha2 = teclado.nextLine();
        String comprobarFecha2 = "\\d{4}-\\d{1,2}-\\d{1,2}";
        if (fecha2.matches(comprobarFecha2)) {
            System.out.println("Correcto");
        } else {
            System.out.println("La cadena no es una fecha válida en formato YYYY-M-D");
        }

        /* f) Un nombre de usuario en twitter, empieza por @ y puede contener letras mayúsculas y minúsculas,
            números, guiones y guiones bajos (entre 2 y 15 caracteres)
        */
        System.out.println("Introduce un nombre de usuario de Twitter: ");
        String nombreUsuario = teclado.nextLine();
        String comprobarUsuario = "@[A-Za-z0-9_-]{2,15}";
        if (nombreUsuario.matches(comprobarUsuario)) {
            System.out.println("Correcto");
        } else {
            System.out.println("El nombre de usuario no cumple las condiciones");
        }
    }
}
