//Cristina Correa Segade
/*
Realizar un programa que tenga definido un Array de 12 filas y 30 columnas llamado
temperaturaDia con las temperaturas medias de un lugar en cada uno de los días del año
(suponemos meses de 30 días). Serán valores enteros negativos o positivos. El programa debe tener
funciones para realizar las siguientes tareas:
a. Llenar de valores el Array: para evitar tener que introducir los valores a mano, genera
valores al azar para todos los días. Para enero, febrero, marzo, noviembre y diciembre los
valores estarán comprendidos entre -10 y +20 y para el resto de meses entre +10 y +35.
b. Mostrar por pantalla el contenido del array en forma de tabla: todos los días de un mes
en la misma fila, ocupando 3 posiciones (una para el signo y dos dígitos para la
temperatura).
c. Mostrar la temperatura media del año.
d. Calcular la temperatura media de cada mes.
e. Crear un Array unidimensional con la temperatura mínima de cada mes.
 */

package com.mycompany.ccst07;

import java.util.Random;


public class CCSt07ae10 {

    public static void main(String[] args) {
        int[][] temperaturaDia = new int[12][30];
        float[] media = new float[12];
        int sumatotal = 0;
        float mediaAnual;
        int[] minimo = new int[12];

        for (int fila = 0; fila < 12; fila++) {
            int min = 10;
            int sumaMes = 0;
            for (int columna = 0; columna < 30; columna++) {
                if (fila < 3 || fila >= 10) {
                    temperaturaDia[fila][columna] = frio();
                    if (temperaturaDia[fila][columna] < min) {
                        min = temperaturaDia[fila][columna];
                    }
                } else {
                    temperaturaDia[fila][columna] = calor();
                }
                System.out.printf("%+03d  ", temperaturaDia[fila][columna]);
                sumaMes += temperaturaDia[fila][columna];
            }
            minimo[fila] = min;
            sumatotal += sumaMes;
            media[fila] = mediaMes(sumaMes);
            System.out.println("");
        }

        mediaAnual = (float) sumatotal / (30 * 12);
        System.out.println("La temperatura media del año es: " + mediaAnual);

        for (int i = 0; i < 12; i++) {
            System.out.println("La temperatura media del mes " + (i + 1) + " es: " + media[i]);
            System.out.println("Y su temperatura mínima es: " + minimo[i]);
        }
    }

    public static int frio() {
        int temp;
        Random r = new Random();
        temp = r.nextInt(31) - 10;
        return temp;
    }

    public static int calor() {
        int temp;
        Random r = new Random();
        temp = r.nextInt(26) + 10;
        return temp;
    }

    public static float mediaMes(int suma) {
        float media = (float) suma / 30;
        return media;
    }
}
