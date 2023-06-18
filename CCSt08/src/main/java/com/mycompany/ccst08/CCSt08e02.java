//Crsitina Correa Segade
/*
Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v2) y realiza
los siguientes cambios:
• Ahora los atributos ancho y alto serán privados.
• Añade los métodos getter y setter para ambos atributos.
• Modifica la clase Triangulo obligados por los cambios en su clase padre.
• Haz una copia del programa anterior, sobre las nuevas clases creadas, y comprueba que el
programa creado en el ejercicio anterior sigue funcionando.
 */

package com.mycompany.ccst08;

import java.util.Scanner;

public class CCSt08e02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el estilo (isósceles, rectángulo, equilátero): ");
        String est = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        double h = Double.parseDouble(teclado.nextLine());
        
        Triangulov2 triangulo = new Triangulov2(b, h, est);
        triangulo.verDim();
        triangulo.verEstilo();
        
        System.out.println("El área es: " + triangulo.area());
    }
}
