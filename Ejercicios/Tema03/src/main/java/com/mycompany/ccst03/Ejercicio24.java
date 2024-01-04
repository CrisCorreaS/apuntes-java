package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.24. Realizar un programa que permita introducir el sexo (‘H’,’M’) y la edad de los 30 trabajadores 
de una fábrica. El programa debe obligar a que las edades que se introduzcan estén comprendidas 
entre 16 y 70 años. El programa nos mostrará la edad y el sexo del más joven y también mostrará la 
media de edad de las mujeres. Finalmente nos informará si hay alguno con más de 60 años. Si se 
introduce cero como edad el programa terminará en ese momento sin esperar a que introduzcan 
los 30 trabajadores.   
Usar tipo char para almacenar sexo. 
 */
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad, trabajador = 1, edadJoven = 70, mediaMujeres, sumaMujeres = 0, numMujeres = 0;
        boolean mayor = false;
        char sexo, sexoJoven = 0;
        
        System.out.println("Introduce una edad (0 para parar)");
        edad = teclado.nextInt();

        while (edad != 0 && trabajador <= 30) {

            while (edad < 16 && edad > 70) {
                System.out.println("La edad no está entre 16 y 70, introduce una edad correcta: ");
                edad = teclado.nextInt();
            }
            System.out.println("Indica si es hombre (H) o mujer (M)");
            sexo = teclado.next().charAt(0);

            if (edadJoven > edad) {
                edadJoven = edad;
                sexoJoven = sexo;
            }
            
            if (sexo == 'm') {
                sumaMujeres += edad;
                numMujeres++;
            }
            
            if (edad > 60) {
                mayor = true;
            }
            
            trabajador++;
            
            System.out.println("Introduce otra edad");
            edad = teclado.nextInt();
        }
        mediaMujeres = (sumaMujeres / numMujeres);
        
        if (sexoJoven == 'm') {
            System.out.println("La persona más joven es una mujer y tiene " + edadJoven + " años");
        }
        
        if (sexoJoven == 'h') {
            System.out.println("La persona más joven es un hombre y tiene " + edadJoven + " años");
        }
        
        System.out.println("La edad media de las mujeres es: " + mediaMujeres);
        
        if (mayor) {
            System.out.println("Hay algún trabajador con más de 60 años");
        }
    }
}
