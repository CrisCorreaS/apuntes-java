package com.mycompany.ccst03;
//Cristina Correa Segade

//3.8. Calcular la suma de los 100 números siguientes a uno tecleado previamente.  
import java.util.Scanner;

public class Ejercicio08a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, cont, suma = 0;
        
        System.out.println("Introduce un número");
        numero = teclado.nextInt();

        for (cont = numero; cont <= numero + 100; cont++) {
            suma += cont;
        }
        
        System.out.println("El resultado es " + suma);
    }
}
//Aquí lo hice con for
