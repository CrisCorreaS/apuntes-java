//Cristina Correa
/*
Copia la última versión de las clases de los primeros ejercicios: Figura2D, Triangulo, TrianColor
y Rectangulo (añade sufijo _v9) y realiza los siguientes cambios:
• Crea un método abstracto llamado area () en Figura2D que ha de implementarse en las clases hijas.
• Crea un método precio (float precioMetroCuadrado) en la clase Figura2D, que use el método
abstracto anterior.
• Verificar que las clases hijas implementan el método area (). ¿Qué ocurriría si no lo tuviesen
implementado?
• Haz un programa que almacene figuras de los tres tipos en un ArrayList y finalmente se recorra el
ArrayList con un for-each mostrando el precio de cada figura, suponiendo un precio de 10 euros el
metro cuadrado.
*/


package com.mycompany.ccst10;

import java.util.ArrayList;


public class CCSt10e01 {

    public static void main(String[] args) {
        ArrayList<Figura2Dv9> figuras = new ArrayList<>();

        figuras.add(new Triangulov9(10D, 4D, "isosceles", "figura1"));
        figuras.add(new Rectangulov9(3, 6, "figura2"));
        figuras.add(new TrianColorv9(5, 3, "equilatero", "azul", "figura3"));
        figuras.add(new Triangulov9(11, 9, "isosceles", "figura4"));
        figuras.add(new Rectangulov9(2, 5, "figura5"));
        figuras.add(new TrianColorv9(4, 7, "rectangulo", "rojo", "figura"));

        for (Figura2Dv9 figura : figuras) {
            System.out.println("Nombre de la figura: " + figura.getNombre());
            System.out.println("Área de la figura: " + figura.area());
            System.out.println("Precio de la figura (precio/metro cuadrado = 10): " + figura.precioMetroCuadrado(10));
        }
    }
}