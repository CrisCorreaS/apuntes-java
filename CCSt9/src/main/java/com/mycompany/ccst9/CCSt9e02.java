//Cristina Correa Segade
/*
Realiza un programa que permita al usuario seleccionar un tipo de figura (Triangulo o
Rectangulo), luego llame al constructor adecuado solicitando al usuario los parámetros necesarios,
dependiendo del tipo de figura.
• Después de crear la figura, mostrará las dimensiones de la misma (sea cual sea su tipo).
• Finalmente, y utilizando el operador instanceof, mostrará unos datos adicionales
dependiendo del tipo de figura que sea:
o Si es de tipo Triangulo, mostrará el área.
o Si es de tipo Rectangulo, mostrará si es de forma cuadrada o no.
• Usar una única variable para almacenar la figura, sea del tipo que sea.
*/

package com.mycompany.ccst9;

import java.util.Scanner;

public class CCSt9e02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        Figura2Dv8 figura;

        do {
            System.out.println("Selecciona un tipo de figura");
            System.out.println(
                                "1) Triangulo\n"
                                + "2) Rectángulo\n"
                                + "3) Salir"
                               );
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1 -> {
                    figura = crearTriangulo();
                    figura.verDim();

                    if (figura instanceof Triangulov8) {
                        System.out.println("Área: " + ((Triangulov8) figura).area());
                    }
                }

                case 2 -> {
                    figura = crearRectangulo();
                    figura.verDim();

                    if (figura instanceof Rectangulov8) {
                        if (((Rectangulov8) figura).esCuadrado()) {
                            System.out.println("Es cuadrado");
                        } else {
                            System.out.println("No es cuadrado");
                        }
                    }
                }

                case 3 -> salir = true;

                default -> System.out.println("Opcion invalida");
            }
        } while (!salir);
    }

    public static Figura2Dv8 crearTriangulo() {
        Scanner teclado = new Scanner(System.in);
        String n;
        double b, h;

        System.out.println("Introduce el nombre: ");
        n = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        h = Double.parseDouble(teclado.nextLine());

        System.out.println("Introduce el estilo:");
        String estilo = teclado.nextLine();

        return new Triangulov8(b, h, estilo, n);
    }

    public static Figura2Dv8 crearRectangulo() {
        Scanner teclado = new Scanner(System.in);
        String n;
        double b, h;

        System.out.println("Introduce el nombre: ");
        n = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        h = Double.parseDouble(teclado.nextLine());

        return new Rectangulov8(b, h, n);
    }
}
