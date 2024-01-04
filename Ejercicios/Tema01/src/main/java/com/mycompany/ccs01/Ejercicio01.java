/*
1.1. Realiza un programa que lea por consola un valor en euros y lo convierta a dólares (suponer 
que 1 euro es igual a 1,14 dólares).
 */
package com.mycompany.ccs01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double dol, eu;
        System.out.println("Introduce los euros que quieras cambiar: ");
        eu = teclado.nextDouble();

        dol = eu * 1.14;

        System.out.println("Resultado: " + dol + " dólares");
    }

}
