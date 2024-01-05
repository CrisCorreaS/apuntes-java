//Cristina Correa Segade
/*
5.3.  Hacer una función llamada CalcularDiasMes que se le pase como parámetro un año y un mes 
y devuelva los días que tiene ese mes, teniendo en cuenta los años bisiestos. A continuación, realizar 
un programa al que se le introduzca una fecha y nos informe de los días pasados desde el 1 de enero 
de ese año (no usar clases Java de fechas).  
 */
package com.mycompany.ccst05;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un año");
        int año = teclado.nextInt();

        System.out.println("Escribe un mes");
        int mes = teclado.nextInt();

        System.out.println("Escribe un día");
        int dia = teclado.nextInt();

        int totalDias = dia;

        System.out.println("El mes " + mes + " tiene " + calcularDiasMes(año, mes) + " dias");

        for (int i = 0; i < mes; i++) {
            switch (i) {
                case 1:
                    totalDias += calcularDiasMes(año, i);
                    break;
                case 2:
                    totalDias += calcularDiasMes(año, i);
                    break;
                case 3:
                    totalDias += calcularDiasMes(año, i);
                    break;
                case 4:
                    totalDias += calcularDiasMes(año, i);
                    break;
                case 5:
                    totalDias += calcularDiasMes(año, i);
                    break;
                case 6:
                    totalDias += calcularDiasMes(año, i);
                    break;
                case 7:
                    totalDias += calcularDiasMes(año, i);
                    break;
                case 8:
                    totalDias += calcularDiasMes(año, i);
                    break;
                case 9:
                    totalDias += calcularDiasMes(año, i);
                    break;
                case 10:
                    totalDias += calcularDiasMes(año, i);
                    break;
                case 11:
                    totalDias += calcularDiasMes(año, i);
                    break;
                case 12:
                    totalDias += calcularDiasMes(año, i);
                    break;
            }
        }

        System.out.println("El total de días que han pasado desde el 1 de enero del mismo año es de " + totalDias + " dias");

    }

    public static int calcularDiasMes(int año, int mes) {
        if (mes > 12 || mes < 0) {
            return 0;
        } else {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                return 31;
            } else {
                if (mes == 4 || mes == 6 || mes == 9 || mes == 10) {
                    return 30;
                } else {
                    if (añoBisiesto(año) && mes == 2) {
                        return 29;
                    } else {
                        if (añoBisiesto(año) == false && mes == 2) {
                            return 28;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static boolean añoBisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
