//Cristina Correa Segade
/*
Realizar una clase llamada Parking que gestione los coches aparcados en un parking mediante
un Array que almacene las matrículas. El parking es un poco raro, mide solo 3 metros de ancho y
caben 20 coches, pero uno detrás de otro por lo que el último en entrar debe ser el primero en salir
(esta estructura se llama pila LIFO – Last Input, First Output ). La clase debe tener métodos siguientes:
a. Mostrar el estado del parking, esto es las matrículas de las plazas ocupadas.
b. Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno.
La plaza del fondo es la número 1 y la que está más cerca de la entrada es la 20.
c. Desaparcar: (¿hace falta pasarle algún parámetro?). Devuelve la matrícula del coche a
desaparcar o bien una cadena vacía si el parking está vacío.
d. Mostrar la cantidad de plazas libres en ese momento.
Hacer un programa con un menú que permita al usuario usar los métodos creados mostrando la
información del parking correspondiente a los métodos creados (los métodos no deben escribir nada
por consola, eso lo hace el programa que usa la clase)
Para implementar este tipo de estructuras LIFO existe una Colecciones que resuelven
esto de forma más sencilla, se verá en el tercer trimestre.
 */

package com.mycompany.ccst07;

import java.util.Scanner;


public class CCSt07ae06 {

    public static void main(String[] args) {
        Parking parking = new Parking();
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce la matrícula del nuevo coche a aparcar: ");
            String matricula = teclado.nextLine();
            int plaza = parking.aparcar(matricula);
            if (plaza == 0) {
                System.out.println("El parking está lleno. No se puede aparcar el coche.");
            } else {
                System.out.println("El número de la plaza para el coche introducido es: " + plaza);
            }
        }

        System.out.println("Las matrículas de los coches aparcados son: ");
        for (int j = 0; j < 20 - parking.plazasLibres(); j++) {
            System.out.println(parking.getMatricula(j));
        }

        System.out.println("El número de plazas libres es: " + parking.plazasLibres());

        String matriculaDesaparcada = parking.desaparcar();
        if (matriculaDesaparcada.isEmpty()) {
            System.out.println("El parking está vacío. No hay coches para desaparcar.");
        } else {
            System.out.println("La matrícula del coche desaparcado es: " + matriculaDesaparcada);
        }
    }
}
