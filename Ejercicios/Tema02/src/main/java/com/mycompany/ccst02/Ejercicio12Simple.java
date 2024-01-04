package com.mycompany.ccst02;
//Cristina Correa Segade

/*
2.12. Introduciendo dos fechas (día, mes, año), hacer un programa que nos diga cuál de las dos es
mayor (agrupa las condiciones de día, mes y año en una sola sentencia condicional). Suponemos que
se introducen fechas válidas y no empleamos las clases de fecha de Java.
 */
import java.util.Scanner;

public class Ejercicio12Simple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia1, mes1, year1, dia2, mes2, year2;
        System.out.println("Introduce el día de la primera fecha: ");
        dia1 = teclado.nextInt();

        System.out.println("Introduce el mes de la primera fecha: ");
        mes1 = teclado.nextInt();

        System.out.println("Introduce el año de la primera fecha: ");
        year1 = teclado.nextInt();

        System.out.println("Introduce el día de la segunda fecha: ");
        dia2 = teclado.nextInt();

        System.out.println("Introduce el mes de la segunda fecha: ");
        mes2 = teclado.nextInt();

        System.out.println("Introduce el año de la segunda fecha: ");
        year2 = teclado.nextInt();

        if (year1 < year2
                || year1 == year2 && mes1 < mes2
                || year1 == year2 && mes1 == mes2 && dia1 < dia2) {
            System.out.println("La primera fecha es menor que la segunda");
        } else {
            System.out.println("La primera fecha es mayor o igual que la segunda");
        }
    }
}
