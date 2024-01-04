package com.mycompany.ccst03;
//Cristina Correa Segade

//3.8. Calcular la suma de los 100 números siguientes a uno tecleado previamente.  
import java.util.Scanner;

public class Ejercicio08b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, cont = 0, suma = 0;
        
        System.out.println("Introduce un número");
        numero = teclado.nextInt();

        while (cont <= numero + 100) {
            suma = suma + cont;
            cont++;
        }
        System.out.println("suma");
    }
}
//Aquí lo hice con while
