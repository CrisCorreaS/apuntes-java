package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.16. Programar el siguiente juego. El ordenador genera un número al azar entre 0 y 99 que habrá 
que adivinar. El jugador intentará adivinar el número y el programa le responderá si es mayor, menor 
o si ha acertado. Se dispone de un máximo de 5 intentos.  
 */
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 100);
        int num, cont;

        System.out.println("El juego consiste en adivinar un número aleatorio entre 0 y 99 (el número aleatorio es " + numeroAleatorio + " )");
        System.out.println("Tienes otro intento más, cuidado, solo vas a tener 5 intentos en total. Introduce un número entre 0 y 99");
        num = teclado.nextInt();

        for (cont = 0; cont < 5; cont++) {
            if (num != numeroAleatorio) {
                if (num > numeroAleatorio) {
                    System.out.println("El número que has introducido es mayor que el número aleatorio");
                } else {
                    System.out.println("El número que has introducido es menor que el número aleatorio");
                }
                System.out.println("Tienes otro intento más, cuidado, solo vas a tener 5 intentos en total. Introduce un número entre 0 y 99");
                num = teclado.nextInt();
                
                if(num == numeroAleatorio){
                    System.out.println("¡Has adivinado!");
                    cont = 5;
                }
            } else {
                System.out.println("¡Has adivinado!");
                cont = 5;
            }
        }
        System.out.println("El número aleatorio era: " + numeroAleatorio);

    }
}
