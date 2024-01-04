//Cristina Correa
/*
Empleando las tres clases definidas en el ejercicio anterior (Delfín, BallenaAzul y TriAtleta) y la
interfaz Nadador, realiza un programa que contenga un ArrayList de nadadores (polimorfismo de
interfaces) con tres elementos, uno de cada tipo, esto es un Delfín, una BallenaAzul y un TriAtleta.
A continuación, recorre el ArrayList con un bucle for...each, mostrando cuánto tarda cada uno de
ellos en recorrer un kilómetro.
*/


package com.mycompany.ccst10;

import java.util.ArrayList;


public class CCSt10e10 {

    public static void main(String[] args) {
        ArrayList<Nadador> nadador = new ArrayList<>();

        nadador.add(new Delfin());
        nadador.add(new BallenaAzul(5));
        nadador.add(new Triatleta());

        for (Nadador nad : nadador) {
            System.out.println("El tiempo que tarda en recorrer un kilómetro es: " + nad.nadar(1000));
        }
    }
}