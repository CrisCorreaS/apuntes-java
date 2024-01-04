package com.mycompany.ccst03;
//Cristina Correa Segade
/*
3.26 Hacer cuatro programas que pinten 9 lí­neas según los siguientes gráficos:
a.)        b.) c.)      d.)
0000000000 1 1111111111 9
1111111111 22 222222222 98
2222222222 333 33333333 987
3333333333 4444 4444444 9876
Cada apartado se resuelve con un for dentro de otro for 
 */
import java.util.Scanner;

public class Ejercicio26c {

    public static void main(String[] args) {

        // Programa c.)
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 12 - i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
