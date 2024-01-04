/*
1.4. Queremos conocer los datos estadísticos de una asignatura, por lo tanto, necesitamos un 
programa al que se le introduzcan por consola el número de suspensos, suficientes, notables y 
sobresalientes de una asignatura, y nos calcule: 
• El tanto por ciento de alumnos que han superado la asignatura. 
• El tanto por ciento de notables y sobresalientes de la asignatura. 
Trata de minimizar el número de operaciones realizadas. Los datos se introducen en variables sin 
decimales, pero los porcentajes sí tienen decimales. ¿Tendría algún sentido pedirle al usuario que 
introdujese el total de alumnos? 
*/

package com.mycompany.ccs01;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definición de variables
        int f, c, b, a;
        
        //Entrada de datos
        System.out.println("Introduce el número de suspensos: ");
        f = teclado.nextInt();

        System.out.println("Introduce el número de suficientes: ");
        c = teclado.nextInt();

        System.out.println("Introduce el número de notables: ");
        b = teclado.nextInt();

        System.out.println("Introduce el número de sobresalientes: ");
        a = teclado.nextInt();

        //calculos
        int total;
        float superado, excelente;

        total = f + c + b + a;
        superado = (((float) a + b + c) / total) * 100;
        excelente = (((float) b + a) / total) * 100;

        //Mostrar datos
        System.out.println("El porcentaje total de alumnos que han superado la asignatura es del: " + superado + "%");
        System.out.println("El porcentaje de notables y sobresalientes de la asignatura es del: " + excelente + "%");
    }

}
