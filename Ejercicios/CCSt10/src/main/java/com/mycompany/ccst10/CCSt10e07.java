//Cristina Correa
/*
Crea una interfaz llamada Perimetrable con un solo método llamado calcularPerimetro al que
no se le pasa ningún parámetro y devuelve un double con el perímetro de la clase que la implemente.
Copia las clases Figura2D, Triangulo, TrianColor y Rectangulo en su última versión (añade sufijo _v10)
y modifica la nueva Figura2D para que implemente Perimetrable.
- ¿Qué ocurre al añadir esta implementación? ¿Se produce algún error de compilación?
- ¿Por qué? ¿Hay alguna forma rápida de arreglar ese error?
- Modifica las clases necesarias para que calculen el perímetro correctamente (supón que los
triángulos son equiláteros para simplificar el cálculo)
Haz un programa sencillo que cree instancias de Triangulo, TrianColor y Rectangulo y muestre su
perímetro.
*/


package com.mycompany.ccst10;

import java.util.ArrayList;


public class CCSt10e07 {

    public static void main(String[] args) {
        ArrayList<Figura2Dv10> figuras = new ArrayList<>();

        figuras.add(new Triangulov10(10D, 4D, "isosceles", "figura1"));
        figuras.add(new Rectangulov10(3, 6, "figura2"));
        figuras.add(new TrianColorv10(5, 3, "equilatero", "azul", "figura3"));
        figuras.add(new Triangulov10(11, 9, "isosceles", "figura4"));
        figuras.add(new Rectangulov10(2, 5, "figura5"));
        figuras.add(new TrianColorv10(4, 7, "rectangulo", "rojo", "figura"));

        for (Figura2Dv10 fig : figuras) {
            System.out.println("El perimetro de la figura es: " + fig.calcularPerimetro());
        }
    }
}