package com.mycompany.ccst03;
//Cristina Correa Segade
//Sin ejecutarlo, intenta explicar que hace este programa.
import java.util.Scanner;

public class CCSt03e15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int hora = 0; //Se define la variable entera hora que es igual a 0 para que entre al bucle 
        for (int i = 1; i <= 7 * 24; i++) { //Se hace un bucle que va del 1 al 168 (7*24), de 1 en 1
            System.out.println(hora); //Escribimos la hora
            if (++hora > 23) { //Si la hora es mayor de 23
                hora = 0; //La hora vuelve a ser 0
            }
        }
    } //fin main
} //fin clase

//En definitiva, lo que hace este programa es darnos la hora, del 0 al 23, siete veces
