//Crsitina Correa Segade
/*
Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v4) y realiza
los siguientes cambios:
• Añade un constructor a la clase Figura2D al que se le pasan dos parámetros: alto y ancho.
¿Funciona ahora el constructor de Triangulo (creado en el ejercicio anterior)? ¿Por qué?
• Reescribe el constructor de Triangulo creado en el ejercicio anterior para que haga uso del
nuevo constructor de la clase base.
• Comprueba que el programa creado en el ejercicio anterior sigue funcionando.
• Haz una copia del programa anterior, sobre las nuevas clases creadas, y comprueba que
sigue funcionando.
 */

package com.mycompany.ccst08;

import java.util.Scanner;

public class CCSt08e04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el estilo (isósceles, rectángulo, equilátero): ");
        String est = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        double h = Double.parseDouble(teclado.nextLine());
        
        Triangulov4 triangulo = new Triangulov4(b, h, est);
        triangulo.verDim();
        triangulo.verEstilo();
        
        System.out.println("El área es: " + triangulo.area());
    }
}
