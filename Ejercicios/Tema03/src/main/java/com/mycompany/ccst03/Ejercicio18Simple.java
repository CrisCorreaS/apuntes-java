package com.mycompany.ccst03;
//Cristina Correa Segade

// 3.18 Mostrar las tablas de multiplicar del 1 al 9.
import java.util.Scanner;

public class Ejercicio18Simple {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont, cont1 = 0, multiplicacion = 0;

        for (cont = 1; cont <= 9; cont++) {
            System.out.println("La tabla de multiplicar del " + cont + " es:");
            
            for (cont1 = 0; cont1 <= 10; cont1++) {
                multiplicacion = cont * cont1;
                System.out.println(cont + " x " + cont1 + " = " + multiplicacion);
            }
        }
    }
}
