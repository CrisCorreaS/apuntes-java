//Cristina Correa Segade
/*
5.2. Programa que presente un menú y permita calcular repetidas veces a) el área de círculo 
necesitará el radio- , b) el área de cuadrado –necesitará el lado - , c) el área de triángulo –necesitará 
base y altura – d) Salir. Usar funciones para cada una de las 3 opciones. 
 */
package com.mycompany.ccst05;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int caso;

        do {
            System.out.println("Elige cualquiera de las opciones");
            System.out.println("1 Calcular el área de un círculo");
            System.out.println("2 Calcular el área de un cuadrado");
            System.out.println("3 Calcular el área de un triángulo");
            System.out.println("4 Salir");
            caso = teclado.nextInt();

            switch (caso) {
                case 1:
                    System.out.println("Introduce el radio");
                    double radio = teclado.nextDouble();
                    
                    System.out.println("El área del círculo es " + areaCirculo(radio));
                    break;

                case 2:
                    System.out.println("Introduce el lado del cuadrado");
                    double lado = teclado.nextDouble();
                    
                    System.out.println("El área del cuadrado es " + areaCuadrado(lado));
                    break;

                case 3:
                    System.out.println("Introduce la base y la altura");
                    double base = teclado.nextDouble();
                    double altura = teclado.nextDouble();
                    
                    System.out.println("El área del triángulo es " + areaTriangulo(base, altura));
                    break;

                case 4:
                    System.out.println("Vas a salir del programa");
                    break;

                default:
                    System.out.println("Has escrito una opción inválida");
            }

            System.out.println("---------------------------------------------------------------------");

        } while (caso != 4);

    }

    public static double areaCirculo(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public static double areaCuadrado(double lado) {
        double area = lado * lado;
        return area;
    }

    public static double areaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }
}
