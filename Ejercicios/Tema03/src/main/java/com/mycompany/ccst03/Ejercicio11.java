package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.11. Diseñar un algoritmo capaz de leer dos valores enteros, m y n, y nos muestre los números 
comprendidos entre ellos ordenados ascendentemente, junto con el valor de elevar cada uno de 
esos números al cuadrado. No se sabe si m > n, pero se desea utilizar   una sola sentencia repetitiva 
tanto   si m > n como si m < n. 
 */
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, m, cont, cuadrado, mayor, menor;
        System.out.println("Introduce el valor de n");
        n = teclado.nextInt();

        System.out.println("Introduce el valor de m");
        m = teclado.nextInt();

        if (n > m) {
            mayor = n;
            menor = m;
        } else {
            mayor = m;
            menor = n;
        }

        for (cont = mayor; cont >= menor; cont--) { // Así los números van del más mayor al más menor (de forma ascendente) -> for (cont = menor; cont <= mayor; cont++) {} -> Así irían de forma descendente
            cuadrado = cont * cont;
            System.out.println(cont + " y su cuadrado es " + cuadrado);
        }
    }
}
