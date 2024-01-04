package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.32. (Opcional) Programa al que se le pase un número entero y que lo muestre en binario. Deberá 
hacer divisiones sucesivas e ir componiendo un número (long) con los restos obtenidos hasta que el 
cociente será cero. Pista: cada cero y uno obtenido como resto hay que situarlo en la posición 
adecuada del resultado: unidades, decenas, centenas, etc.  
 */
import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el número entero que deseas convertir a binario: ");
        int numero = teclado.nextInt();

        long binario = convertirBinario(numero);
        
        System.out.println("El número " + numero + " en binario es: " + binario);
    }

    private static long convertirBinario(int numero) {
        long binario = 0;
        int posicion = 1;

        while (numero > 0) {
            int resto = numero % 2;
            
            binario += resto * posicion;
            numero /= 2;
            posicion *= 10;
        }

        return binario;
    }
}
