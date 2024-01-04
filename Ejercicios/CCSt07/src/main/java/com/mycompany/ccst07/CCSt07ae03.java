//Cristina Correa Segade
/*
Realiza un programa similar al anterior, pero que en la parte ‘a’ garantice que no hay
temperaturas repetidas.
 */

package com.mycompany.ccst07;

import java.util.Random;


public class CCSt07ae03 {

    public static void main(String[] args) {
        Random r = new Random();
        int temperaturaMeses[] = new int[12];
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = r.nextInt(41);

            //Comprobamos que ninguna temperatura se repita
            for (int j = 0; j < i; j++) {
                if (temperaturaMeses[i] == temperaturaMeses[j]) {
                    temperaturaMeses[i] = r.nextInt(41);
                    j = 0;
                }
            }
        }
        for (int temperatura : temperaturaMeses) {
            System.out.println("La temperatura es: " + temperatura);

        }
    }
}
