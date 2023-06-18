//Cristina Correa
/*
Diseña una clase abstracta llamada Figura3D_v1 con método abstracto volumen (). Crea
subclases: Esfera_v1 y PrismaRectangular_v1 que implementen el método de la superclase.
Incorpora los atributos que creas necesarios a las tres clases. Haz un programa que cree una
instancia de cada una de las 2 figuras y muestre cuál de ellas ocupa más.
*/


package com.mycompany.ccst10;

import java.util.ArrayList;


public class CCSt10e02 {

    public static void main(String[] args) {
        ArrayList<Figura3Dv1> figuras = new ArrayList<>();

        figuras.add(new Esferav1(3, "esfera"));
        figuras.add(new PrismaRectangularv1(3, 4, 8, "prisma"));

        for (Figura3Dv1 fig : figuras) {
            System.out.println(fig.toString());
        }
        
        if (figuras.get(0).volumen() > figuras.get(1).volumen()) {
            System.out.println("La esfera ocupa más que el prisma");
        } else {
            System.out.println("El prisma ocupa más que la esfera");
        }
    }
}