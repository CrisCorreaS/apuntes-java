//Cristina Correa
/*
Haz una nueva versión de las clases del ejercicio anterior (añádele el sufijo _v2). Añádele a la
clase base el método abstracto superficie (). Crea una nueva clase Cilindro y haz que implemente los
métodos de la superclase. Haz un programa que permita crear una instancia de cada una de las 3
figuras y nos muestre cuál tiene más superficie.
*/


package com.mycompany.ccst10;

import java.util.ArrayList;


public class CCSt10e03 {

    public static void main(String[] args) {
        ArrayList<Figura3Dv2> figuras = new ArrayList<>();

        figuras.add(new Esferav2(3, "esfera"));
        figuras.add(new PrismaRectangularv2(3, 4, 8, "prisma"));
        figuras.add(new Cilindrov2(3, 8, "cilindro"));

        for (Figura3Dv2 fig : figuras) {
            System.out.println(fig.toString());
        }

        Figura3Dv2 figuraMayorSuperficie = obtenerFiguraMayorSuperficie(figuras);
        System.out.println("La figura con mayor superficie es: " + figuraMayorSuperficie.getNombre());
    }

    public static Figura3Dv2 obtenerFiguraMayorSuperficie(ArrayList<Figura3Dv2> figuras) {
        Figura3Dv2 figuraMayorSuperficie = figuras.get(0);

        for (int i = 1; i < figuras.size(); i++) {
            Figura3Dv2 figura = figuras.get(i);
            if (figura.superficie() > figuraMayorSuperficie.superficie()) {
                figuraMayorSuperficie = figura;
            }
        }

        return figuraMayorSuperficie;
    }
}