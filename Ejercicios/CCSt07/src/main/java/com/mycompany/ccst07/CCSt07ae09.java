//Cristina Correa Segade
/*
Realizar un programa que tenga una función a la que se le pasa un Array con las edades de
los alumnos de una clase y nos devuelva la edad media. Añadir una función a la que se le pasa un
Array con las edades de los alumnos y nos devuelva un Array solo con los mayores de edad.
 */

package com.mycompany.ccst07;

import java.util.Arrays;


public class CCSt07ae09 {

    public static void main(String[] args) {
        int[] edades = {18, 17, 19, 20, 18, 17, 21};

        float media = calcularMediaEdades(edades);
        System.out.println("La media es = " + media + " años");

        int[] mayores = mayorEdad(edades);
        System.out.println("El array solo con mayores de edad es: " + Arrays.toString(mayores));
    }

    public static float calcularMediaEdades(int[] edades) {
        int suma = 0;
        for (int edad : edades) {
            suma += edad;
        }
        float media = (float) suma / edades.length;
        return media;
    }

    public static int[] mayorEdad(int[] edades) {
        int longitud = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                longitud++;
            }
        }

        int[] mayores = new int[longitud];
        int j = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= 18) {
                mayores[j] = edades[i];
                j++;
            }
        }
        return mayores;
    }
}
