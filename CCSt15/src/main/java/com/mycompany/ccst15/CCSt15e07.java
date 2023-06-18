//Cristina Correa Segade
/*
Realizar un programa que tenga un HashMap que almacene una plantilla de jugadores de un
equipo (Nombre, salario). La plantilla tiene un máximo de 25 jugadores. El programa dispondrá de
menú que permita: añadir jugador, eliminar jugador, lista jugadores con su salario y que tenga
también opción que permita introducir un salario y muestre los jugadores que tiene un salario
parecido al introducido (por “parecido” entendemos que el salario del jugador esté en un rango de
6000 euros arriba o abajo respecto al introducido).
*/

package com.mycompany.ccst15;

import java.util.HashMap;
import java.util.Scanner;


public class CCSt15e07 {

    static Scanner teclado;
    static int opcion;
    static HashMap<String, Double> plantilla = new HashMap<>();

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        boolean salir = false;
        do {

            System.out.println("Seleccione una opción:\n 1. Añadir\n 2. Eliminar\n 3. Consultar\n"
                    + " 4. Consultar por salario\n 0. Salir");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1 -> annadir();
                case 2 -> eliminar();
                case 3 -> consultar();
                case 4 -> consultarSalario();
                case 0 -> salir = true;
                default -> System.out.println("Opción inválida. Intente nuevamente");
            }
        } while (!salir);
    }

    public static void annadir() {
        if (plantilla.size() < 25) {
            System.out.println("Introduce nombre:");
            String nombre = teclado.nextLine();
            System.out.println("Introduce salario:");
            Double salario = Double.parseDouble(teclado.nextLine());
            plantilla.put(nombre, salario);
            System.out.println("Jugador añadido.");
        } else {
            System.out.println("Lista completa, borre algún jugador para añadir uno nuevo");
        }
    }

    public static void eliminar() {
        System.out.println("Introduce el nombre a borrar:");
        String nombre = teclado.nextLine();
        if (plantilla.containsKey(nombre)) {
            plantilla.remove(nombre);
            System.out.println("Jugador borrado");
        } else {
            System.out.println("No existe ese jugador");
        }
    }

    public static void consultar() {
        if (plantilla.isEmpty()) {
            System.out.println("La plantilla está vacía");
        } else {
            for (String key : plantilla.keySet()) {
                System.out.println(key + " -> Salario: " + plantilla.get(key));
            }
        }
    }

    public static void consultarSalario() {
        System.out.println("Introduce el salario:");
        double salario = Double.parseDouble(teclado.nextLine());
        double min = salario - 6000;
        double max = salario + 6000;
        boolean encontrado = false;
        for (String key : plantilla.keySet()) {
            double salarioJugador = plantilla.get(key);
            if (salarioJugador >= min && salarioJugador <= max) {
                System.out.println(key + " -> Salario: " + salarioJugador);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron jugadores con salarios en ese rango");
        }
    }
}