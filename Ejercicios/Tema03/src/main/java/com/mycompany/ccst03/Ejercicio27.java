package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.27. La suma de los dígitos de los números múltiplos de tres es también un múltiplo de tres. 
Realizar un programa que compruebe si esta afirmación es correcta o no para los primeros 10000 
números enteros positivos.
 */
import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {

        int num, unidad, decena, centena, millar, decenaMillar;

        for (num = 1; num <= 10000; num++) {
            unidad = num % 10;
            decena = (num / 10) % 10;
            centena = (num / 100) % 100;
            millar = (num / 1000) % 1000;
            decenaMillar = (num / 10000) % 10000;

            if ((unidad + decena + centena + millar + decenaMillar) % 3 == 0) {
                System.out.println(num);
            }
        }

    }
}
