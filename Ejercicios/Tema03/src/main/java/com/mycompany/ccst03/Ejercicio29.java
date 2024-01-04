package com.mycompany.ccst03;
//Cristina Correa Segade
/*
3.29. Hacer un programa para llevar el control de venta de entradas. Lo primero que ha de hacer 
es pedir la cantidad de entradas que se pondrán a la venta, después irá solicitando la cantidad de 
entradas que quiere comprar, estando limitado a un máximo de 10 por cliente. El programa finalizará 
cuando se agoten las entradas mostrando la cantidad de entradas que se ha llevado el que más ha 
comprado. Pensar primero el bucle y luego lo que hay que hacer en cada iteración 
 */
import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int entradas, compra, maximo = 0;
        
        System.out.println("Introduce el número total de entradas que se pondrán a la venta");
        entradas = teclado.nextInt();

        while (entradas > 0) {
            System.out.println("Quedan " + entradas + " entradas");
            System.out.println("¿Cuántas entradas vas a comprar?");
            compra = teclado.nextInt();
            
            System.out.println("Vas a comprar: " + compra + " entradas");

            if (entradas >= compra) {
                entradas -= compra;
            } else {
                System.out.println("Solo quedan: " + entradas + " entradas a la venta");
            }

            if (maximo < compra) {
                maximo = compra;
            }
        }
        System.out.println("Se han agotado la entradas");
        System.out.println("La persona que más etradas ha comprado, compró: " + maximo + " entradas");

    }
}
