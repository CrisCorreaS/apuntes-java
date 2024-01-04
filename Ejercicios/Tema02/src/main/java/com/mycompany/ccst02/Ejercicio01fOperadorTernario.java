//Cristina Correa Segade

/*
2.1 Hacer programas sencillos que hagan lo siguiente:

f) Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos). 

 */
package com.mycompany.ccst02;
//Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos).

import java.util.Scanner;

public class Ejercicio01fOperadorTernario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1;
        boolean respuesta;
        
        System.out.println("Introduce un número entero: ");
        num1 = teclado.nextInt();

        respuesta = (num1 >= 10 && num1 <= 20) ? true : false;
        
        if(respuesta){
            System.out.println("El número " + num1 + " es un número comprendido en el intervalo entre 10 y 20");
        } else {
            System.out.println("El número " + num1 + " no está comprendido entre 10 y 20");
        }
    }
}
