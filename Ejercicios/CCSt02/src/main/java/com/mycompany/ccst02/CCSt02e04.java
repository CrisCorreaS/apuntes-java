package com.mycompany.ccst02;
//Cristina Correa Segade
/*Programa al que se le introduzcan las coordenadas X e Y de dos puntos del plano, nos diga si
lo que forman es un cuadrado o un rectángulo y calcule el área del mismo.
*/

import java.util.Scanner;

public class CCSt02e04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x, y;
        System.out.println("Introduce la coordenada x: ");
        x = teclado.nextInt();

        System.out.println("Introduce la coordenada y: ");
        y = teclado.nextInt();
        
        int absx, absy;
        absx = Math.abs(x);
        absy = Math.abs(y);

        if (absx==absy) {
            int areacuadrado = absx*absy;
            System.out.println("El área del cuadrado es igual a: " + areacuadrado);
        } 
        else {
            int arearectangulo = absx*absy;
            System.out.println("El área del rectángulo es igual a: " + arearectangulo);

        }

    }
}
