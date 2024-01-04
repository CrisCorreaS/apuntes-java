/*
1.8. Diseñar un programa al que se le introduzcan las edades de cuatro personas y nos calcule la 
media de edad de los mismos. Hacer una segunda versión que solo utilice dos variables. ¿Sería 
posible hacerlo con una sola variable?

Versión con solo una variable
 */
package com.mycompany.ccs01;

import java.util.Scanner;

public class Ejercicio08c {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int personas = 0;

        //Entrada de datos
        System.out.println("Introduce la edad de la primera persona: ");
        personas += teclado.nextInt();

        System.out.println("Introduce la edad de la segunda persona: ");
        personas += teclado.nextInt();

        System.out.println("Introduce la edad de la tercera persona: ");
        personas += teclado.nextInt();

        System.out.println("Introduce la edad de la cuarta persona: ");
        personas += teclado.nextInt();

        System.out.println("La edad media de las cuatro personas son: " + personas / (float) 4 + " años");
    }

}
