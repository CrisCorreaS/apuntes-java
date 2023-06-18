//Cristina Correa Segade
//Ejercicio 5

package com.mycompany.ccst10;


public abstract class PiezaAjedrez {
    protected int fila;
    protected int columna;

    public PiezaAjedrez() {
        fila = 0;
        columna = 0;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public abstract boolean mover(int f, int c);

    @Override
    public abstract String toString();
}