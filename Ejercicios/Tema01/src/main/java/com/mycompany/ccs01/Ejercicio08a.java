/*
1.8. Diseñar un programa al que se le introduzcan las edades de cuatro personas y nos calcule la 
media de edad de los mismos. Hacer una segunda versión que solo utilice dos variables. ¿Sería 
posible hacerlo con una sola variable?
*/

package com.mycompany.ccs01;

import java.util.Scanner;

public class Ejercicio08a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definición de variables
        int p1, p2, p3, p4;
        
        //Entrada de datos
        System.out.println("Introduce la edad de la primera persona: ");
        p1 = teclado.nextInt();

        System.out.println("Introduce la edad de la segunda persona: ");
        p2 = teclado.nextInt();

        System.out.println("Introduce la edad de la tercera persona: ");
        p3 = teclado.nextInt();

        System.out.println("Introduce la edad de la cuarta persona: ");
        p4 = teclado.nextInt();

        //calculos
        double media, edadTotal;

        edadTotal = p1 + p2 + p3 + p4;
        media = edadTotal / 4;

        //Si quiero hacerlo más simple podría hacerlo así: media= (p1+p2+p3+p4)/4;
        //Si quiero hacerlo con solo dos variables
        //Mostrar datos
        System.out.println("La edad media de las cuatro personas son: " + media + " años");
    }

}
