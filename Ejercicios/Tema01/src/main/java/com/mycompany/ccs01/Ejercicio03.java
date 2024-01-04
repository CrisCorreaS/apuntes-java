/*
1.3. Realiza un programa que lea por consola dos números enteros (sin decimales) y nos muestre 
los resultados de sumar, restar y dividir dichos números. Comprueba que la división responde con 
decimales  
 */
package com.mycompany.ccs01;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;
        System.out.println("Introduce el primer número entero: ");
        num1 = teclado.nextInt();

        System.out.println("Introduce el segundo número entero: ");
        num2 = teclado.nextInt();

        int suma, resta, multiplicacion;
        float division;

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / (float) num2;

        System.out.println("Resultado de la suma: " + suma);
        System.out.println("Resultado de la resta: " + resta);
        System.out.println("Resultado de la multiplicación: " + multiplicacion);
        System.out.println("Resultado de la división: " + division);
    }

}
