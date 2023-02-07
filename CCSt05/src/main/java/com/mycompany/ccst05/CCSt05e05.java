//Cristina Correa Segade
/*
Programa que calcule el factorial de números menores de 20. El programa permite al usuario
meter los números que desee y finalizará cuando meta un número menor que 1 o mayor que 20.
Crea las funciones que consideres útiles y que puedas reutilizar en otros programas.
*/
package com.mycompany.ccst05;

import java.util.Scanner;

public class CCSt05e05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero=teclado.nextInt();
        while(numero<20&&numero>0){
            System.out.println("El factorial de "+numero+" es "+calcularFactorial(numero));
            System.out.println("---------------------------------------------------------");
            System.out.println("Escribe otro número");
            numero=teclado.nextInt();
        }
    }
    
    public static long calcularFactorial(int numero){
        long resultado=1;

        for(int i=0; i<=numero; i++){
            if(i!=0){
                resultado*=i;
            }
        }
        return resultado;
    }
}

