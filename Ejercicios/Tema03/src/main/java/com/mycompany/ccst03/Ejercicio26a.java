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

public class Ejercicio26a {

    public static void main(String[] args) {

        // Programa a.)
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }

    }
}
