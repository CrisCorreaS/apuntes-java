package com.mycompany.ccst03;
//Cristina Correa Segade
/*Programa que muestre los número primos comprendidos entre 2 y 1000. Hacer los bucles
con un número máximo de iteraciones (se permite el uso de break) sabiendo que:
- Un número primo es solo divisible por 1 y el mismo.
- Los números primos son todos impares salvo el 2.
- Los divisores de un número siempre son menores que la mitad de dicho número (salvo el
mismo).
- Si un número no es divisible por 2 ya no va a serlo por ningún otro número par.
 */
import java.util.Scanner;

public class CCSt03e20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num = 2;
        for (num = 2; num <= 1000; num++) {
            boolean primo = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(num);
            }
        }

    }
}
