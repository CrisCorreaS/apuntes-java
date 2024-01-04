//Cristina
/**
Realizar un programa que cree un ArrayList con 10.000 números aleatorios entre 1 y 6 (como
si fuese lanzar un dado). Utilizando los métodos estáticos de la clase Collections guarda en otro
ArrayList la distribución de resultados obtenidos (cuantas veces ha salido el uno, cuantas veces ha
salido el dos, etc...) y muestra su contenido. Finalmente, también mediante métodos de Collections,
mostrar la diferencia de veces entre el número que más ha salido y el que menos ha salido.
 */
package com.mycompany.ccst07b;

import java.util.ArrayList;
import java.util.Random;


public class CCSt07be22 {

    public static void main(String[] args) {
        ArrayList<Integer> lista = generarArray();
        int[] distribucion = calcularDistribucion(lista);

        for (int i = 1; i <= 6; i++) {
            System.out.println("El número " + i + " ya ha salido " + distribucion[i - 1] + " veces.");
        }

        int maximo = buscarMaximo(distribucion);
        int minimo = buscarMinimo(distribucion);
        int diferencia = maximo - minimo;
        System.out.println("La diferencia de veces entre el número que más ha salido y el que menos es de: " + diferencia +  " veces");
    }

    public static ArrayList<Integer> generarArray() {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            array.add(random.nextInt(6) + 1);
        }
        return array;
    }

    public static int[] calcularDistribucion(ArrayList<Integer> lista) {
        int[] distribucion = new int[6];

        for (int numero : lista) {
            //Esto lo encontré en StackOverflow
            distribucion[numero - 1]++;
        }
        return distribucion;
    }

    public static int buscarMaximo(int[] array) {
        int maximo = Integer.MIN_VALUE;

        for (int elemento : array) {
            if (elemento > maximo) {
                maximo = elemento;
            }
        }
        return maximo;
    }

    public static int buscarMinimo(int[] array) {
        int minimo = Integer.MAX_VALUE;

        for (int elemento : array) {
            if (elemento < minimo) {
                minimo = elemento;
            }
        }
        return minimo;
    }
}
