//Cristina Correa Segade


package com.mycompany.ccst16;

import java.util.ArrayList;


public class ListaPequena <T> {
    private ArrayList<T> valores;
    public final int tamanoMax;

    ListaPequena(int tamano) {
        this.tamanoMax = tamano;
        valores = new ArrayList<>();
    }

    public ArrayList<T> getValores() {
        return valores;
    }

    public void annadir(T x) {
        if (valores.size() < tamanoMax)
            valores.add(x);
        else
            valores.set(valores.size() - 1, x);
    }

    public void clear() {
        valores.clear();
    }

    public ArrayList<T> getClear() {
        return valores;
    }

    @Override
    public String toString() {
        return "ListaPequena{" + "valores=" + valores + ", tamanoMax=" + tamanoMax + '}';
    }

    public int getTamanoActual() {
        return valores.size();
    }
}