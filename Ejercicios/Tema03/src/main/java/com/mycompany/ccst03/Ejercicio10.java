package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.10. Programa al que se le introduzcan las edades de los alumnos (-1 para finalizar) y nos informe 
si hay alguno menor de edad. 
En cuanto encuentre un menor de edad, la respuesta va a ser “Sí hay alguno”, 
aunque luego sigamos introduciendo edades, esta situación ya no va a cambiar, ojo 
al hacer el “if”. 
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad = 0;

        while (edad != -1) {
            System.out.println("Introduce la edad de un alumno (-1 para finalizar)");
            edad = teclado.nextInt();

            if (edad <= 0) {
                System.out.println("Esta edad no es válida");
            } else {
                if (edad < 18) {
                    System.out.println("Este alumno es menor de edad");
                }
            }

        }
    }
}
