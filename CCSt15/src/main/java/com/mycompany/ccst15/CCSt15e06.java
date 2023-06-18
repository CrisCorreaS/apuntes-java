//Cristina Correa Segade
/*

*/

package com.mycompany.ccst15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CCSt15e06 {

    private static Scanner teclado;
    private static Map<String, Double> plantilla;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        plantilla = new HashMap<>();

        boolean salir = false;
        while (!salir) {
            System.out.println("Seleccione una opción:\n" +
                    "1. Añadir jugador\n" +
                    "2. Eliminar jugador\n" +
                    "3. Consultar todos los jugadores\n" +
                    "4. Consultar salario de un jugador\n" +
                    "5. Incrementar salario de un jugador\n" +
                    "0. Salir");
            int opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1 -> annadirJugador();
                case 2 -> eliminarJugador();
                case 3 -> consultarTodos();
                case 4 -> consultarSalario();
                case 5 -> incrementarSalario();
                case 0 -> salir = true;
                default -> System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        }
    }

    public static void annadirJugador() {
        System.out.println("Introduce el nombre del jugador:");
        String nombre = teclado.nextLine();

        if (plantilla.containsKey(nombre)) {
            System.out.println("Error: el jugador ya existe.");
        } else {
            System.out.println("Introduce el salario del jugador:");
            double salario = Double.parseDouble(teclado.nextLine());
            plantilla.put(nombre, salario);
            System.out.println("Jugador añadido correctamente.");
        }
    }

    public static void eliminarJugador() {
        System.out.println("Introduce el nombre del jugador a eliminar:");
        String nombre = teclado.nextLine();

        if (plantilla.containsKey(nombre)) {
            plantilla.remove(nombre);
            System.out.println("Jugador eliminado correctamente.");
        } else {
            System.out.println("No existe ese jugador en la plantilla.");
        }
    }

    public static void consultarTodos() {
        if (plantilla.isEmpty()) {
            System.out.println("La plantilla está vacía.");
        } else {
            System.out.println("Jugadores en la plantilla:");
            for (Map.Entry<String, Double> entry : plantilla.entrySet()) {
                String nombre = entry.getKey();
                double salario = entry.getValue();
                System.out.println(nombre + " -> Salario: " + salario);
            }
        }
    }

    public static void consultarSalario() {
        System.out.println("Introduce el nombre del jugador:");
        String nombre = teclado.nextLine();

        if (plantilla.containsKey(nombre)) {
            double salario = plantilla.get(nombre);
            System.out.println("Salario de " + nombre + ": " + salario);
        } else {
            System.out.println("No existe ese jugador en la plantilla.");
        }
    }

    public static void incrementarSalario() {
        System.out.println("Introduce el nombre del jugador:");
        String nombre = teclado.nextLine();

        if (plantilla.containsKey(nombre)) {
            double salarioActual = plantilla.get(nombre);
            double salarioIncrementado = salarioActual * 1.1;
            plantilla.put(nombre, salarioIncrementado);
            System.out.println("Salario de " + nombre + " incrementado correctamente.");
            System.out.println("Nuevo salario: " + salarioIncrementado);
        } else {
            System.out.println("No existe ese jugador en la plantilla.");
        }
    }
}
