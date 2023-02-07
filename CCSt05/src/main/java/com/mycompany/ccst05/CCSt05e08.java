//Cristina Correa Segade
/*
Realizar un programa al que se le introduzcan dos números enteros positivos y nos diga cuál
de los dos tiene más divisores (usar función previa).
*/
package com.mycompany.ccst05;

import java.util.Scanner;

public class CCSt05e08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el primer número");
        int num1 = teclado.nextInt();
        
        System.out.println("Escribe el segundo número");
        int num2 = teclado.nextInt();
        
        if(num1<0||num2<0){
            System.out.println("Has escrito un número incorrecto");
        }
        else{
            if(num1==num2){
                System.out.println("Los dos números son iguales y tienen la misma cantidad de divisores: "+cantidadDivisores(num1));
            }
            else{
                if(cantidadDivisores(num1)==cantidadDivisores(num2)){
                    System.out.println("Ambos números son diferentes pero tienen la misma cantidad de divisores" +cantidadDivisores(num1));
                }
                else{
                    if(num1==masDivisores(num1,num2)){
                        System.out.println("El número "+num1+ " tiene más divisores");
                    }
                    else{
                        System.out.println("El número "+num2+" tiene más divisores");
                    }
                }
            }
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
    
    public static int masDivisores(int num1, int num2){
        if(cantidadDivisores(num1)>cantidadDivisores(num2)){
            return num1;
        }
        else{
            return num2;
        }
    }
}

