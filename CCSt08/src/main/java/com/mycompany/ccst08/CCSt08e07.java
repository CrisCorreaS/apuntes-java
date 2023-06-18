//Crsitina Correa Segade
/*
Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v7) y realiza
los siguientes cambios:
• Figura2D_v7 tendrá un nuevo constructor, que recibe como parámetro otro objeto de tipo
Figura2D_v7 y que copiará todos sus datos.
• Hacer otro constructor análogo para la clase Triangulo_v7.
• Hay un programa que cree un Triangulo_v7 con el constructor de 3 parámetros creado
previamente, y otro triángulo utilizando el nuevo constructor. Mostrar el área de ambos.
 */

package com.mycompany.ccst08;

import java.util.Scanner;

public class CCSt08e07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el estilo (isósceles, rectángulo, equilátero): ");
        String est = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        double h = Double.parseDouble(teclado.nextLine());
        
        Triangulov7 triangulo1 = new Triangulov7(b, h, est);
        System.out.println("El área del primer triángulo es: " + triangulo1.area());
        
        Triangulov7 triangulo2 = new Triangulov7(triangulo1);
        System.out.println("El área del triángulo copiado es: " + triangulo2.area());
    }
}
