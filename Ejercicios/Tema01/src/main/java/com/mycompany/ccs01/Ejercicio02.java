/*
1.2. Realiza un programa que lea por consola un valor en dólares y lo convierta a euros (suponer 
que 1 euro es igual a=1,14 dólares).
 */
package com.mycompany.ccs01;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double dol, eu;
        System.out.println("Introduce los dólares que quieras cambiar: ");
        dol = teclado.nextDouble();

        eu = dol / 1.14;

        System.out.println("Resultado: " + eu + " euros");
    }

}
