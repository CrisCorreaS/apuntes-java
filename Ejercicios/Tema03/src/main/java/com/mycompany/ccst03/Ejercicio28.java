package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.28. Sacar por pantalla la suma, la media y el producto de los números pares comprendidos entre 
dos números enteros tecleados previamente. No sabemos si el que introduce primero es menor que 
el segundo. No incluir en los cálculos los números introducidos, solo los intermedios. 
 */
import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2, suma = 0, multiplicacion = 1, variable, contador = 0;
        float media, cont;

        System.out.println("Introduce un número: ");
        num1 = teclado.nextInt();

        System.out.println("Introduce otro número: ");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            variable = num2;
            num2 = num1;
            num1 = variable;
        }

        for (cont = num1; cont <= num2; cont++) {
            if (cont % 2 == 0) {
                suma += cont;
                multiplicacion *= cont;

                contador++;
            }
        }

        media = (float) suma / contador;

        System.out.println("La suma es: " + suma);
        System.out.println("El pruducto es: " + multiplicacion);
        System.out.println("La media es: " + media);

    }
}
