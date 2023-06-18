//Cristina Correa Segade
/*
Modificar el ejercicio anterior para añadir a las figuras posibles el Triancolor. Así pues, el
usuario seleccionará entre: Triangulo, Triancolor, Rectangulo.
• Después de crear la figura, mostrará las dimensiones de la misma (sea cual sea su tipo).
• Finalmente, y utilizando el operador instanceof, mostrará unos datos adicionales
dependiendo del tipo de figura que sea:
o Si es de tipo Triangulo, mostrará el área (sea Triancolor o no).
o Si es de tipo Rectangulo, mostrará si es de forma cuadrada o no.
o Si es de tipo Triancolor, mostrará el color.
*/

package com.mycompany.ccst9;

import java.util.Scanner;

public class CCSt9e03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        String nombre, estilo, color;
        double base, altura;

        Figura2Dv8 figura = null;

        do {
            System.out.println("Selecciona un tipo de figura");
            System.out.println("1) Triángulo");
            System.out.println("2) Rectángulo");
            System.out.println("3) Triángulo de Color");
            System.out.println("4) Salir");
            int opcion = teclado.nextInt();

            if (opcion == 4) {
                salir = true;
                continue;
            }

            System.out.println("Introduce el nombre:");
            nombre = teclado.nextLine();
            System.out.println("Introduce el ancho o la base:");
            base = Double.parseDouble(teclado.nextLine());
            System.out.println("Introduce el alto:");
            altura = Double.parseDouble(teclado.nextLine());

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduce el estilo:");
                    estilo = teclado.nextLine();
                    figura = new Triangulov8(base, altura, estilo, nombre);
                }
                case 2 -> figura = new Rectangulov8(base, altura, nombre);
                case 3 -> {
                    System.out.println("Introduce el estilo:");
                    estilo = teclado.nextLine();
                    System.out.println("Introduce el color:");
                    color = teclado.nextLine();
                    figura = new TrianColorv8(base, altura, estilo, color, nombre);
                }
                default -> System.out.println("Opcion invalida");
            }

            if (figura != null) {
                figura.verDim();
                if (figura instanceof Triangulov8) {
                    System.out.println("Área: " + ((Triangulov8) figura).area());
                }
                if (figura instanceof Rectangulov8) {
                    if (((Rectangulov8) figura).esCuadrado()) {
                        System.out.println("Es cuadrado");
                    } else {
                        System.out.println("No es cuadrado");
                    }
                }
                if (figura instanceof TrianColorv8) {
                    ((TrianColorv8) figura).verColor();
                }
            }
        } while (!salir);

    }
}