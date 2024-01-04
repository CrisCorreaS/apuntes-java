//Cristina Correa Segade
//Ejercicio 6

package com.mycompany.ccst07;

public class Parking {
    
    private static final String[] matricula = new String[20];
    private int ocupada = 0;

    public String getMatricula(int i) {
        return matricula[i];
    }

    public boolean estaLleno() {
        return ocupada == 20;
    }

    public int aparcar(String mat) {
        if (estaLleno()) {
            return 0;
        }

        ocupada++;
        int plaza = 21 - ocupada;
        matricula[plaza - 1] = mat;
        return plaza;
    }

    public String desaparcar() {
        if (ocupada == 0) {
            return "";
        }

        String matriculaDesaparcada = matricula[ocupada - 1];
        matricula[ocupada - 1] = null;
        ocupada--;
        return matriculaDesaparcada;
    }

    public int plazasLibres() {
        return 20 - ocupada;
    }
}
