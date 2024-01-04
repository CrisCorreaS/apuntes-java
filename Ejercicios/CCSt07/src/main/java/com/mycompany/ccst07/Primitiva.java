//Cristina Correa Segade
/*
Ejercicio 5
 */

package com.mycompany.ccst07;

import java.util.Random;


public class Primitiva {

    private static final int[] numeros = new int[6];

    public void setNumeros() {
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(49) + 1;
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    numeros[i] = random.nextInt(49) + 1;
                    j = 0;
                }
            }
        }
    }

    public int getNumeros(int i) {
        return numeros[i];
    }

    public int comprobarBoleto(int[] boleto) {
        int aciertos = 0;
        boolean[] numerosComprobados = new boolean[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < boleto.length; j++) {
                if (!numerosComprobados[i] && numeros[i] == boleto[j]) {
                    aciertos++;
                    numerosComprobados[i] = true;
                }
            }
        }

        return aciertos;
    }

    public int[] generarBoletoAlAzar() {
        Random random = new Random();
        int[] boletoAzar = new int[6];

        for (int i = 0; i < 6; i++) {
            boletoAzar[i] = random.nextInt(49) + 1;

            for (int j = 0; j < i; j++) {
                if (boletoAzar[i] == boletoAzar[j]) {
                    boletoAzar[i] = random.nextInt(49) + 1;
                    j = 0;
                }
            }
        }

        return boletoAzar;
    }
}
