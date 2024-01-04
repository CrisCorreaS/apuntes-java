package com.mycompany.ccst02;
//Cristina Correa Segade

/*
2.10. Realizar un programa al que se le introduzcan DIA, MES, AÑO, que verifique que los valores
introducidos sean correctos, sin emplear las clases de fechas de Java.
 */
import java.util.Scanner;

public class Ejercicio10Simple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia, mes, year;
        boolean bisiesto;
        
        System.out.println("Introduce el día: ");
        dia = teclado.nextInt();

        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();

        System.out.println("Introduce el año: ");
        year = teclado.nextInt();

        bisiesto = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        if (dia > 31 && (mes > 12 || mes == 0)) {
            System.out.println("La fecha no es correcta");
        } else {
            if (dia <= 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
                    || dia <= 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)
                    || bisiesto && dia <= 29 && mes == 2
                    || !bisiesto && dia <= 28 && mes == 2) {
                System.out.println("La fecha es correcta");
            } else {
                System.out.println("La fecha no es correcta");
            }
        }
    }
}
