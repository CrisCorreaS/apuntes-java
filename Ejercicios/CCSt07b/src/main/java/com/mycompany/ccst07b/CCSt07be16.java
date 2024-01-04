//Cristina
/**
Realizar un programa al que se le vayan introduciendo por teclado números enteros. El
programa dispone de dos ArrayList, uno llamado positivos y otro negativos. Se trata de meter
los números introducidos en uno u otro según su signo hasta que finalice el programa (esto ocurrirá
cuando se introduzca cero). Al finalizar, mostrará la media aritmética de cada ArrayList.
 */
package com.mycompany.ccst07b;

import java.util.ArrayList;
import java.util.Scanner;


public class CCSt07be16 {

    public static void main(String[] args) {
        ArrayList<Integer> positivos = new ArrayList<>();
        ArrayList<Integer> negativos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        boolean salir = true;

        do {
            System.out.println("Introduce un número: ");
            int num = teclado.nextInt();
            if (num == 0) {
                salir = false;
            } else if (num > 0) {
                positivos.add(num);
            } else {
                negativos.add(num);
            }
        } while (salir);

        System.out.println("La media de los números positivos es: " + media(positivos));
        System.out.println("La media de los números negativos es: " + media(negativos));
    }

    public static float media(ArrayList<Integer> array) {
        float med = 0;
        for (int i = 0; i < array.size(); i++) {
            med += array.get(i);
        }
        med = (float) med / array.size();
        return med;
    }
}
