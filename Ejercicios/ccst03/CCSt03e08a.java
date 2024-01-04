package com.mycompany.ccst03;
//Cristina Correa Segade
//Calcular la suma de los 100 números siguientes a uno tecleado previamente.
import java.util.Scanner;

    public class CCSt03e08a {
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int numero, cont, suma=0;
                System.out.println("Introduce un número");
                numero = teclado.nextInt();
                
                for(cont=numero; cont<=numero+100; cont++) {
                    suma = suma+cont;
                }
                System.out.println("El resultado es " + suma);
    }
}
//Aquí lo hice con for