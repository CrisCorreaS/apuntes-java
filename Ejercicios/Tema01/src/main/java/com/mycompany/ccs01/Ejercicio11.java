/*
1.11. Diseñar un programa al que se le introduzca la longitud de dos catetos de un ángulo recto y 
nos devuelva el valor de la hipotenusa. Busca en internet como calcular en Java potencias y raíces 
cuadradas para aplicar el teorema de Pitágoras. Investiga también si existe en Java alguna utilidad 
que nos haga este cálculo automáticamente.
 */
package com.mycompany.ccs01;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definición de variables
        int cateto1, cateto2;
        
        //Entrada de datos
        System.out.println("Introduce la longitud el primer cateto en cm: ");
        cateto1 = teclado.nextInt();

        System.out.println("Introduce la longitud del segundo cateto en cm: ");
        cateto2 = teclado.nextInt();

        //calculos
        double hipotenusa, sumaCatetos;

        sumaCatetos = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        hipotenusa = Math.sqrt(sumaCatetos);

        //Mostrar datos
        System.out.println("La hipotenusa es igual a: " + hipotenusa + "cm");
    }

}
