//Cristina Correa Segade
/*
Realiza una función/método que se le pase por parámetro una cadena que representa una
dirección de correo electrónico. En caso de que la cadena no cumpla las condiciones sintácticas de
un email, se generará una excepción de tipo: “Formato email inválido”. Los requisitos que tiene que
tener una dirección de email podrían ser: número mínimo de caracteres=5, una arroba y al menos
un punto después de la arroba. Hacer también un programa que llame a la función anterior y capture
la excepción generada.
*/

package com.mycompany.ccst13;

import java.util.Scanner;


public class CCSt13e08 {

    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.println("Introduce tu correo electrónico: ");
        try {
            comprobarCorreo(teclado.nextLine());
        } catch (FormatoEmailInvalido fI) {
            System.out.println(fI.getMessage());
        }
    }

    public static void comprobarCorreo(String correo) throws FormatoEmailInvalido {
        if (correo.length() < 5 || correo.indexOf("@") == -1 ||
                correo.indexOf(".", correo.indexOf("@") + 1) == -1) {
            throw new FormatoEmailInvalido();
        }
    }
}

class FormatoEmailInvalido extends Exception {
    @Override
    public String getMessage() {
        return "Formato email inválido";
    }
}