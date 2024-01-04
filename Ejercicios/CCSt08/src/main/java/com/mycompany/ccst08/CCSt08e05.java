//Crsitina Correa Segade
/*
Copia las clases anteriores como una nueva versión de las mismas (añade sufijo _v5) y realiza
los siguientes cambios:
• Añade un constructor más a la clase Figura2D, a este se le pasa solo un parámetro que se le
asigna tanto al alto como al ancho (figura igual alto que ancho).
• Hacer el constructor sin parámetros (ya no se crea por defecto) en este caso tanto alto como
ancho igual a cero.
• Añade a la clase Triangulo también un constructor sin parámetros, que invoque al
constructor sin parámetros de la clase base (aunque se hace por defecto) y que ponga el
estilo a null.
• Añade otro constructor a la clase Triangulo, con un solo parámetro, para aquellos que tienen
igual alto que ancho (en este caso el estilo será ‘igualBaseAltura’).
• Haz un programa similar a los de ejercicios anteriores pero que use las nuevas
características incorporadas en este ejercicio
 */

package com.mycompany.ccst08;

import java.util.Scanner;

public class CCSt08e05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el estilo (isósceles, rectángulo, equilátero): ");
        String est = teclado.nextLine();
        System.out.println("Introduce el ancho:");
        double b = Double.parseDouble(teclado.nextLine());
        System.out.println("Introduce el alto:");
        double h = Double.parseDouble(teclado.nextLine());
        
        Triangulov5 triangulo1 = new Triangulov5(b, h, est);
        triangulo1.verDim();
        triangulo1.verEstilo();
        System.out.println("El área es: " + triangulo1.area());
        
        Triangulov5 triangulo2 = new Triangulov5();
        triangulo2.verDim();
        triangulo2.verEstilo();
        System.out.println("El área es: " + triangulo2.area());
        
        Triangulov5 triangulo3 = new Triangulov5(b);
        triangulo3.verDim();
        triangulo3.verEstilo();
        System.out.println("El área es: " + triangulo3.area());

    }
}
