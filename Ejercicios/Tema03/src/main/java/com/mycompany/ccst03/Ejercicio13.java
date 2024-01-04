package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.13. Programa al que le introduzcas un número y que garantice que es positivo, es decir si lo 
introducimos menor o igual que cero nos obligará a volver a introducirlo las veces que sea necesario 
hasta que se introduzca uno positivo. 
Cuando tenemos que hacer algo una o más veces, pero por lo menos una, el do…while puede ser 
mejor opción que el while. 
 */
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Introduce un número positivo");
        num = teclado.nextInt();

        while (num <= 0) {
            System.out.println("Este no es un número positivo, introduce un número positivo");
            num = teclado.nextInt();
        }

        if (num > 0) {
            System.out.println("El número " + num + " es positivo");
        }

    }
}
