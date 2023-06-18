//Crsitina Correa Segade
/*
Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v3) y realiza
los siguientes cambios:
• Añade un constructor a la clase Triangulo al que se le pasan tres parámetros: estilo, alto y
ancho.
• Se invocará al constructor por defecto de la clase base.
• Modificar el programa de los ejercicios anteriores para que los triángulos sean creados
mediante este nuevo constructor.
 */

package com.mycompany.ccst08;

import java.util.Scanner;

public class CCSt08e03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el estilo (isósceles, rectángulo, equilátero): ");
        String est = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        double h = Double.parseDouble(teclado.nextLine());

        Triangulov3 triangulo = new Triangulov3(b, h, est);
        triangulo.verDim();
        triangulo.verEstilo();
        
        System.out.println("El área es: " + triangulo.area());
    }
}
