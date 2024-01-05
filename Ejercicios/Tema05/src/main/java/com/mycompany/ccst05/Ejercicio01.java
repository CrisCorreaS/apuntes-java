//Cristina Correa Segade

/*
5.1. Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a 
dichas funciones: 
• Función llamada par() que se le pasa un entero y devuelve true si es par, false si  no lo 
es. 
• Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos. 
• Función llamada sumaIntervalo() que le pasan dos long y devuelve otro long  con la suma 
de los números comprendidos entre los números pasados (el primero es menor que el 
segundo, y ambos mayores que cero, en caso contrario devuelve -1) 
• Función llamada contarCeros() que se le pasa una cadena y devuelve la cantidad de ceros 
que tiene. 
• Función llamada aleatorio() que se le pasan dos valores enteros devuelve un entero al 
azar comprendido entre esos dos valores (el primero es menor que el segundo, y ambos 
mayores que cero, en caso contrario devuelve -1)
 */
package com.mycompany.ccst05;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe un número y te diremos si es par o no");
        int comprobarPar = teclado.nextInt();

        System.out.println("Escribe tres números y comprobaremos cual es el mayor");
        double comprobarMayor1 = teclado.nextDouble();
        double comprobarMayor2 = teclado.nextDouble();
        double comprobarMayor3 = teclado.nextDouble();

        System.out.println("Escribe dos números y te daremos su intervalo, recuerda las condiciones");
        long comprobarIntervalo1 = teclado.nextLong();
        long comprobarIntervalo2 = teclado.nextLong();

        System.out.println("Escribe una cadena y contaremos sus ceros");
        String comprobarCeros = teclado.nextLine();

        System.out.println("Escribe dos números que cumplan las condiciones y te daremos un número aleatorio de su intervalo");
        int comprobarAleatorio1 = teclado.nextInt();
        int comprobarAleatorio2 = teclado.nextInt();

        //par()
        if (par(comprobarPar)) {
            System.out.println("El número " + comprobarPar + " es par");
        } else {
            System.out.println("El número " + comprobarPar + " es impar");
        }

        //mayor()
        System.out.println("El número mayor es " + mayor(comprobarMayor1, comprobarMayor2, comprobarMayor3));

        //sumaIntervalo()
        if (sumaIntervalo(comprobarIntervalo1, comprobarIntervalo2) == -1) {
            System.out.println("Los números introducidos son incorrectos");
        } else {
            System.out.println("El intervalo es " + sumaIntervalo(comprobarIntervalo1, comprobarIntervalo2));
        }

        //contarCeros()
        System.out.println("La cadena " + comprobarCeros + "tiene " + contarCeros(comprobarCeros) + " ceros");

        //aleatorio()
        if (aleatorio(comprobarAleatorio1, comprobarAleatorio2) == -1) {
            System.out.println("Los números introducidos son incorrectos");
        } else {
            System.out.println("El número aleatorio es: " + aleatorio(comprobarAleatorio1, comprobarAleatorio2));
        }
    }

    public static boolean par(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static double mayor(double num1, double num2, double num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else {
            if (num2 >= num1 && num2 >= num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }

    public static long sumaIntervalo(long num1, long num2) {
        if (num1 > 0 && num2 > 0 && num1 < num2) {
            return num2 - num1;
        } else {
            return -1;
        }
    }

    public static int contarCeros(String cadena) {
        int numCeros = 0;
        
        for (int cont = 0; cont < cadena.length(); cont++) {
            if (cadena.charAt(cont) == '0') {
                numCeros++;
            }
        }
        return numCeros;
    }

    public static int aleatorio(int num1, int num2) {
        if (num1 < 0 || num2 < 0 || num1 > num2) {
            return -1;
        }
        
        Random random = new Random();
        return random.nextInt(num2 - num1 + 1) + num1;
    }
}
