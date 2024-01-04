/*
1.5. Un departamento de climatología ha realizado recientemente su conversión al sistema 
métrico. Diseñar un algoritmo para realizar las siguientes conversiones: 
• Leer por consola la temperatura dada en la escala Celsius y mostrar su equivalente 
Fahrenheit (la fórmula de conversión es “F=9/5 ºC+32”). Resultado redondeado a dos 
decimales. 
• Leer la cantidad de agua del pluviómetro en pulgadas y mostrar su equivalente en 
centímetros (25.5 mm = 1 pulgada). Resultado redondeado a un decimal. 
*/

package com.mycompany.ccs01;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definición de variables
        float temperaturaFahrenheit, aguaPulgadas;
        
        //Entrada de datos
        System.out.println("Introduce los grados Fahrenheit: ");
        temperaturaFahrenheit = teclado.nextFloat();

        System.out.println("Introduce la cantidad de agua en pulgadas: ");
        aguaPulgadas = teclado.nextFloat();

        //calculos
        double temperaturaCelsius, aguaCentimetros;
        temperaturaCelsius = ((temperaturaFahrenheit - 32) * 5) / 9;
        aguaCentimetros = 2.55 * aguaPulgadas;

        //Mostrar datos
        System.out.println("Los grados Celsius equivalentes son: " + temperaturaCelsius + "ºC");
        System.out.println("Los centímetros equivalesntes son: " + aguaCentimetros + "cm");
    }

}
