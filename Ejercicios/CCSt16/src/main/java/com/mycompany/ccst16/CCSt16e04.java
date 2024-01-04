//Cristina Correa Segade
/*
Realizar un programa al que se le introduzca un número entero. Mostrar dicho número en
su representación hexadecimal. Evitar que se produzca una excepción si el usuario no introduce un
valor correcto (por ejemplo, si introduce texto o un número con decimales o un número demasiado
grande).
Pista: La clase wrapper Integer dispone de un método estático para convertir un número en un String
con la representación hexadecimal de dicho número.
*/

package com.mycompany.ccst16;

import java.util.Scanner;


public class CCSt16e04 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        System.out.println("Introduce un número entero:");
        try {
            num = Integer.parseInt(teclado.nextLine());
            String numHex = Integer.toHexString(num);
            System.out.println("La representación hexadecimal es: " + numHex);
        } catch (NumberFormatException e) {
            System.out.println("El valor introducido no es un número entero válido.");
        }
    }
}