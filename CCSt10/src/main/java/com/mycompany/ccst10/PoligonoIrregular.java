//Cristina Correa Segade
//Ejercicio 8

package com.mycompany.ccst10;

import java.util.ArrayList;


public class PoligonoIrregular implements Perimetrable {
    private ArrayList<Float> lados;

    public PoligonoIrregular(ArrayList<Float> lados) {
        this.lados = lados;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 0;
        for (float lado : lados) {
            perimetro += lado;
        }
        return perimetro;
    }
}