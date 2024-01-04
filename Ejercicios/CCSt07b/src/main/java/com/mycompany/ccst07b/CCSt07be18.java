//Cristina
/**
Realizar un programa que tenga una función a la que se le pasa un entero y devuelva un
ArrayList con todos sus divisores.
 */
package com.mycompany.ccst07b;

import java.util.ArrayList;
import java.util.Scanner;


public class CCSt07be18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> divisores;

        System.out.println("Introduce un número: ");
        int numero = teclado.nextInt();
        teclado.close();

        divisores = CalcularDivisores(numero);

        System.out.println("Los divisores de  " + numero + " son: ");
        for (int divisor : divisores) {
            System.out.println(divisor);
        }
    }

    public static ArrayList<Integer> CalcularDivisores(int num) {
        ArrayList<Integer> divisores = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }
}
