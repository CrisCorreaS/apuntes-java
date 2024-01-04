package com.mycompany.ccst02;
//Cristina Correa Segade

/*
2.11. Realizar un programa al que se le introduzcan DIA, MES, AÑO, que calcule el día siguiente.  
Suponemos que los valores son correctos, sin emplear las clases de fechas de Java. 
Hay que hacer un tratamiento diferente según sea fin de año, fin de mes (no fin de año) 
o un día no fin de mes. 
 */
import java.util.Scanner;

public class Ejercicio11Simple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Empezamos calculando las variables
        int dia, mes, year, diasMes;
        boolean bisiesto;

        System.out.println("Introduce el día: ");
        dia = teclado.nextInt();

        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();

        System.out.println("Introduce el año: ");
        year = teclado.nextInt();

        bisiesto = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        //Empezamos calculando los días del mes de cada uno
        if (bisiesto && mes == 2) {
            diasMes = 29;
        } else {
            if (!bisiesto && mes == 2) {
                diasMes = 28;
            } else {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    diasMes = 31;
                } else {
                    diasMes = 30;
                }
            }
        }

        //Ahora calculamos el día siguiente
        if (dia > 31 || dia <= 0 || mes > 12 || mes <= 0) {
            System.out.println("La fecha no es correcta");
        } else {
            if (dia <= 29 && mes != 2
                    || dia <= 30 && diasMes == 31
                    || dia <= 28 && diasMes == 29
                    || dia <= 27 && diasMes == 28) {

                int tomorrow;

                tomorrow = dia + 1;

                System.out.println("Mañana será " + tomorrow + " del " + mes + " del " + year);
            } else {
                if (dia == 30 && diasMes == 30
                        || dia == 31 && diasMes == 31 && mes != 12
                        || dia == 28 && diasMes == 28
                        || dia == 29 && diasMes == 29) {

                    int nextmonth;

                    nextmonth = mes + 1;

                    System.out.println("Mañana será 1 del " + nextmonth + " del " + year);
                } else {
                    if (dia == 31 && mes == 12) {

                        int nextyear;

                        nextyear = year + 1;

                        System.out.println("Mañana será 1 del 1 del " + nextyear);
                    }
                }
            }
        }
    }
}
