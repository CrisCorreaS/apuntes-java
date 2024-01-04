//Cristina Correa
/*
Crea una nueva clase PoligonoIrregular (no es hija de Figura2D ni de ninguna otra clase) que
tiene como único atributo un ArrayList con la longitud de todos los lados del mismo. Haz que esta
clase implemente Perimetrable. Crea un programa sencillo con una instancia de PoligonoIrregular y
que calcule su perímetro. Añade al programa un ArrayList de figuras (PoligonoIrregular,
Rectangulo_v10, Triangulo_v10, Triancolo_v10) y que muestre el perímetro de todos ellos.
- ¿Tiene sentido que Perimetrable sea interfaz y no clase abstracta? ¿Por qué?
*/


package com.mycompany.ccst10;

import java.util.ArrayList;


public class CCSt10e08 {

    public static void main(String[] args) {
        ArrayList<Perimetrable> figuras = new ArrayList<>();
        ArrayList<Float> lados = new ArrayList<>();
        lados.add(16.5f);
        lados.add(1.5f);
        lados.add(8.3f);
        lados.add(2.4f);

        figuras.add(new Triangulov10(10, 4, "isosceles", "figura1"));
        figuras.add(new Rectangulov10(3, 6, "figura2"));
        figuras.add(new TrianColorv10(5, 3, "equilatero", "azul", "figura3"));
        figuras.add(new Triangulov10(11, 9, "isosceles", "figura4"));
        figuras.add(new Rectangulov10(2, 5, "figura5"));
        figuras.add(new TrianColorv10(4, 7, "rectangulo", "rojo", "figura"));
        figuras.add(new PoligonoIrregular(lados));

        for (Perimetrable figura : figuras) {
            System.out.println("El perímetro de la figura es: " + figura.calcularPerimetro());
        }
    }
}