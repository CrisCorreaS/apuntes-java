package com.mycompany.ccst02;
//Cristina Correa Segade

/*
2.6. Un sistema de ecuaciones lineales de la forma:

ax + by = c
dx + ey = f
puede resolverse utilizando las siguientes fórmulas: (ver en el ejercicio)

Realizar un programa que lea por teclado los dos conjuntos de coeficientes (a, b y c, y d, e y f)
y calcule los valores para ‘x’ e ‘y’ según la fórmula descrita ¿Existen algunos casos para los
cuales este algoritmo no funcione? Nota: cuando en matemáticas se escriben dos variables
juntas, por ejemplo ‘ce’ quiere decir ‘c por e’.
 */
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float a, b, c, d, e, f, x, y;
        
        System.out.println("Introduce el valor a: ");
        a = teclado.nextFloat();

        System.out.println("Intoduce el valor b: ");
        b = teclado.nextFloat();

        System.out.println("Introduce el valor c: ");
        c = teclado.nextFloat();

        System.out.println("Introduce el valor d: ");
        d = teclado.nextFloat();

        System.out.println("Intoduce el valor e: ");
        e = teclado.nextFloat();

        System.out.println("Introduce el valor f: ");
        f = teclado.nextFloat();

        if (a * e - b * d == 0) {
            System.out.println("No se puede hacer la operación porque el denominador es igual a 0");
        } else {
            x = (c * e + b * f) / (a * e - b * d);
            y = (a * f - c * d) / (a * e - b * d);
            System.out.println("El valor de x es: " + x);
            System.out.println("El valor de y es: " + y);
        }
    }
}
