//Crsitina Correa Segade
/*
Realiza las siguientes operaciones:
• Crea una clase llamada Figura2D con atributos numéricos con decimales y públicos: ancho
y alto y un método verDim que muestre por consola el alto y el ancho en una sola línea, con
dos decimales.
• Define una clase llamada Triángulo que es hija de Figura2D y añádele una cadena llamada
estilo (vale: isósceles, rectángulo, equilátero, etc.), un método llamado área que devuelva la
superficie del triángulo y un último método llamado verEstilo que muestre por consola el
valor del atributo estilo.
• Finalmente hacer un programa que cree un triángulo, asigne valores a sus atributos y use
los métodos para ver sus dimensiones, estilo y área.
 */

package com.mycompany.ccst08;

import java.util.Scanner;

public class CCSt08e01 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el estilo(isósceles, rectángulo, equilátero): ");
        String est = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        double h = Double.parseDouble(teclado.nextLine());
        
        Triangulo triangulo = new Triangulo(b, h, est);
        triangulo.verDim();
        triangulo.verEstilo();
        
        System.out.println("El área es: " + triangulo.area());
    }
}
