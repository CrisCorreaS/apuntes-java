//Cristina
/**
Realizar un programa con una función a la que se le pasan dos ArrayList de enteros como
parámetros y nos devuelva true si los dos ArrayList tienen los mismos elementos, aunque sean en
otro orden, y devuelva false en caso contrario (suponemos que no tienen valores repetidos).
 */
package com.mycompany.ccst07b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class CCSt07be24 {

    public static void main(String[] args) {
        ArrayList<Integer> array1 = generarArray();
        ArrayList<Integer> array2 = generarArray();

        if (compararArrays(array1, array2)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays son diferentes");
        }
    }

    public static boolean compararArrays(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        if (array1.size() != array2.size()) {
            return false;
        }

        ArrayList<Integer> copyArray2 = new ArrayList<>(array2);
        for (Integer num : array1) {
            if (!copyArray2.contains(num)) {
                return false;
            }
            copyArray2.remove(num);
        }

        return true;
    }

    public static ArrayList<Integer> generarArray() {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(100));
        }

        Collections.sort(array);
        return array;
    }
}
