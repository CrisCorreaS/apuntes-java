package com.mycompany.ccst02;
//Cristina Correa Segade

/*
2.11. Realizar un programa al que se le introduzcan DIA, MES, AÑO, que calcule el día siguiente.  
Suponemos que los valores son correctos, sin emplear las clases de fechas de Java. 
Hay que hacer un tratamiento diferente según sea fin de año, fin de mes (no fin de año) 
o un día no fin de mes. 
 */
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dia, mes, year;

        System.out.println("Introduce el día: ");
        dia = teclado.nextInt();

        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();

        System.out.println("Introduce el año: ");
        year = teclado.nextInt();

        if (dia > 31 || mes > 12 || mes <= 0) {
            System.out.println("La fecha no es correcta");
        } else {
            if (dia <= 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)) {
                if (dia < 31) {
                    int tomorrow;
                    tomorrow = dia + 1;
                    System.out.println("Mañana va a ser " + tomorrow + " del " + mes + " del " + year);
                } else {
                    int mesSiguiente;
                    mesSiguiente = mes + 1;
                    System.out.println("Mañana va a ser " + 1 + " del " + mesSiguiente + " del " + year);
                }
            } else {
                if (dia <= 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
                    if (dia < 30) {
                        int tomorrow;
                        tomorrow = dia + 1;
                        System.out.println("Mañana va a ser" + tomorrow + " del " + mes + " del " + year);
                    } else {
                        int mesSiguiente;
                        mesSiguiente = mes + 1;
                        System.out.println("Mañana va a ser " + 1 + " del " + mesSiguiente + " del " + year);
                    }
                } else {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && dia <= 29 && mes == 2) {
                        if (dia < 29) {
                            int tomorrow;
                            tomorrow = dia + 1;
                            System.out.println("Mañana va a ser " + tomorrow + " del " + mes + " del " + year);
                        } else {
                            int mesSiguiente;
                            mesSiguiente = mes + 1;
                            System.out.println("Mañana va a ser " + 1 + " del " + mesSiguiente + " del " + year);
                        }
                    } else {
                        if (year % 4 != 0 && dia <= 28 && mes == 2) {
                            if (dia < 28) {
                                int tomorrow;
                                tomorrow = dia + 1;
                                System.out.println("Mañana va a ser " + tomorrow + " del " + mes + " del " + year);
                            } else {
                                int mesSiguiente;
                                mesSiguiente = mes + 1;
                                System.out.println("Mañana va a ser " + 1 + " del " + mesSiguiente + " del " + year);
                            }
                        } else {
                            if (dia <= 31 && mes == 12) {
                                if (dia < 31) {
                                    int tomorrow;
                                    tomorrow = dia + 1;
                                    System.out.println("Mañana va a ser " + tomorrow + " del " + mes + " del " + year);
                                } else {
                                    int nextYear;
                                    nextYear = year + 1;
                                    System.out.println("Mañana va a ser 1 del 1 del " + nextYear);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
