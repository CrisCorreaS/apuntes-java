//Cristina Correa
/*
Pensando que en el futuro implementemos el juego de ajedrez para dos jugadores, se desea
crear una clase abstracta llama PiezaAjedrez, con dos atributos enteros llamados fila y columna que
representan sus coordenadas en el tablero (valores entre 0 y 7) y un método abstracto llamado
mover () al que se le pasan como parámetro la fila y columna destino de un movimiento. El método
devolver true si el movimiento se puede realizar o false si es un movimiento erróneo. Implementa
esa clase y sus subclases AlfilAjedrez y TorreAjedrez. Para simplificarlo, vamos a pensar en
movimientos en un tablero vacío, es decir solo con una pieza, la que se está movimiento.
• Haz un programa que permita al usuario mover una sola pieza (al comenzar elegirá Alfil o Torre) por
el tablero, partiendo de la posición 0,0, indicando las coordenadas destino del movimiento que quiere
hacer cada vez, terminando el programa cuando introduzca fila -1.
• El programa tendrá una función que presente por pantalla la situación del tablero.
• Por comodidad, puedes hacer las clases dentro del mismo fichero que el programa.
*/


package com.mycompany.ccst10;

import java.util.ArrayList;
import java.util.Scanner;


public class CCSt10e05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fila;
        int columna;

        ArrayList<PiezaAjedrez> piezas = new ArrayList<>();
        piezas.add(new AlfilAjedrez());
        piezas.add(new TorreAjedrez());

        System.out.println("Elige una pieza para mover:");
        System.out.println("0- Mover Alfil");
        System.out.println("1- Mover Torre");
        int opcion = Integer.parseInt(teclado.nextLine());

        while (true) {
            System.out.println("Pulsa 0 si quieres ver el tablero");
            if (Integer.parseInt(teclado.nextLine()) == 0) {
                verTablero(piezas);
            }

            System.out.println("Elige la fila de destino: de 0 a 7 (-1 para salir):");
            fila = Integer.parseInt(teclado.nextLine());
            if (fila == -1) {
                break;
            }

            System.out.println("Elige la columna de destino: de 0 a 7:");
            columna = Integer.parseInt(teclado.nextLine());

            if (piezas.get(opcion).mover(fila, columna)) {
                System.out.println("Movimiento realizado correctamente");
            } else {
                System.out.println("Movimiento no realizado, es incorrecto");
            }
        }
    }

    public static void verTablero(ArrayList<PiezaAjedrez> piezas) {
        for (PiezaAjedrez pieza : piezas) {
            System.out.println(pieza.toString());
        }
    }
}