package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.5. Sumar una cantidad de números que se van introduciendo, siempre que sean positivos hasta 
que se teclee el -1. 
Para sumar valores e ir acumulando esa suma se suele emplear una estructura 
con la siguiente forma. Antes del bucle: acumulador = 0. Y dentro del bucle 
acumulador = acumulador + nuevo valor.
 */
import java.util.Scanner;

public class Ejercicio05a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0, suma = 0;

        while (numero != -1) {
            System.out.println("Introduce un número positivo");
            numero = teclado.nextInt();
            
            if (numero > -1) {
                suma = suma + numero;
                System.out.println("La suma de estos números es: " + suma);
            }
        }
    }
}
/*
Lo he hecho interpretando que querían saber el resultado de cada suma, no la total.
No lee los números negativos y se para en el -1
*/
