package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.23. Programa que permita introducir números y  nos muestre el resultado de sumarlos, hasta 
que introduzca un número mayor que 1000. Si no se introduce un número mayor que 1000 el 
programa finalizará después de introducidos 15 números. (Ojo: es fácil equivocarse y hacer que 
solicite un numero de más o bien que no sume correctamente)
 */
import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 0, suma = 0, cont = 0;

        while (num <= 1000 && cont < 15) {
            System.out.println("Introduce un número");
            num = teclado.nextInt();

            if (num < 1000) {
                suma += num;
                
                System.out.println("La suma actual es: " + suma);
            } else {
                System.out.println("Hemos finalizado la suma");
            }
            cont++;
        }
    }
}
