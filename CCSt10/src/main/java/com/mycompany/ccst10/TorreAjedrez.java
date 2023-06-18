//Cristina Correa Segade
//Ejercicio 5

package com.mycompany.ccst10;


public class TorreAjedrez extends PiezaAjedrez {
    @Override
    public boolean mover(int f, int c) {
        if (((fila - f) == 0) || ((columna - c) == 0)) {
            fila = f;
            columna = c;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("La torre se encuentra en la fila %d y columna %d", fila, columna);
    }
}