//Cristina Correa Segade
/*
Realiza una función llamada cantidadDivisores al que se le pase como parámetro un número
entero y devuelva el número de divisores o bien cero si el número es negativo. Usa dicha función en
un main.
*/
package com.mycompany.ccst05;

import java.util.Scanner;

public class CCSt05e06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número");
        int numero = teclado.nextInt();
        
        if(numero<0){
            System.out.println("El número es negativo por lo que el resultado es 0");
        }
        
        else{
            System.out.println("El número de divisores del número "+numero+" es "+cantidadDivisores(numero));
        }
    }
    
    public static int cantidadDivisores(int numero){
        int resultado=0;
        for(int i=1;i<=numero;i++){
            if(numero%i==0){
                resultado+=1;
            }
        }
        return resultado;
    }

}

