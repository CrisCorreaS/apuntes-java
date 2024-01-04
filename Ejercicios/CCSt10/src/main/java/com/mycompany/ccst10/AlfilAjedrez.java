//Cristina Correa Segade
//Ejercicio 5

package com.mycompany.ccst10;


public class AlfilAjedrez extends PiezaAjedrez {
    @Override
    public boolean mover(int f, int c) {
        if ((fila - f) == (columna - c)) {
            fila = f;
            columna = c;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("El alfil se encuentra en la fila %d y columna %d", fila, columna);
    }
}