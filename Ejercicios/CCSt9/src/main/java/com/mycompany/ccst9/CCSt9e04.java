//Cristina Correa Segade
/*
Realiza un programa que contenga un ArrayList de figuras2D de cualquiera de sus tipos e
introduce valores “a mano”, por ejemplo, un par de instancias de cada tipo. A continuación, el
programa:
• Sumar el área de todas ellas. ¿Tienen implementado el método área () todas ellas?
• Contar cuantos triángulos (sean de color o no) y cuantos rectángulos.
*/

package com.mycompany.ccst9;

import java.util.ArrayList;
import java.util.Scanner;

public class CCSt9e04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String n, e, c;
        double b, h, sumaArea = 0;
        int trian = 0, rect = 0, salir = 0;
        ArrayList<Figura2D> figuras = new ArrayList<>();

        do {
            System.out.println("Selecciona un tipo de figura");
            System.out.println(
                            "1)Triángulo\n"
                            + "2)Rectángulo\n"
                            + "3)Triángulo Color"
                           );
            int opcion = Integer.parseInt(teclado.nextLine());
            
            System.out.println("Introduce el nombre: ");
            n = teclado.nextLine();
            System.out.println("Introduce el ancho:");
            b = Double.parseDouble(teclado.nextLine());
            System.out.println("Introduce el alto:");
            h = Double.parseDouble(teclado.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el estilo: ");
                    e = teclado.nextLine();
                    figuras.add(new Triangulo(b, h, e, n));
                    break;
                case 2:
                    figuras.add(new Rectangulo(b, h, n));
                    break;
                case 3:
                    System.out.println("Introduce el estilo: ");
                    e = teclado.nextLine();
                    System.out.println("Introduce el color: ");
                    c = teclado.nextLine();
                    figuras.add(new TrianColor(b, h, e, c, n));
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            salir++;
        } while (salir < 2);

        for (Figura2D fig : figuras) {
            if (fig instanceof Triangulo) {
                sumaArea += fig.area();
                trian++;
            }
            if (fig instanceof Rectangulo) {
                sumaArea += fig.area();
                rect++;
            }
        }

        System.out.println("La suma de todas las áreas es: " + sumaArea);
        System.out.println("Hay " + trian + " triángulos");
        System.out.println("Hay " + rect + " rectángulos");

        teclado.close();
    }
}
