package com.mycompany.ccst03;
//Cristina Correa Segade
/*Programa que permita introducir números y nos muestre el resultado de sumarlos, hasta
que introduzca un número mayor que 1000. Si no se introduce un número mayor que 1000 el
programa finalizará después de introducidos 15 números. (Ojo: es fácil equivocarse y hacer que
solicite un numero de más o bien que no sume correctamente)
 */
import java.util.Scanner;

public class CCSt03e23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int num, suma = 0, cont = 1;
        System.out.println("Introduce un número");
        num = teclado.nextInt();
        while (num <= 1000 && cont <= 14) {
            suma += num;
            System.out.println("La suma actual es: " + suma);
            System.out.println("Introduce otro número");
            num = teclado.nextInt();
            cont++;
        }
        System.out.println("La suma total es: " + suma);
    }
}