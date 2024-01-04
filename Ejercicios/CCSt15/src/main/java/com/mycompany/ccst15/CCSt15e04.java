//Cristina Correa Segade
/*
Repite el ejercicio anterior con un LinkedHashSet ¿Qué ha cambiado?
*/

package com.mycompany.ccst15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class CCSt15e04 {

    static Scanner teclado = new Scanner(System.in);
    static LinkedHashSet<Persona> invitados = new LinkedHashSet<>();

    public static void main(String[] args) {
        boolean salir = false;

        do {
            System.out.println("Seleccione una opción:\n 1) Añadir persona\n 2) Mostrar lista\n 3) Media de edad\n 0) Salir");
            int opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1 -> añadir();
                case 2 -> mostrarLista();
                case 3 -> System.out.println("La media de edad es: " + media() + " y el nombre del mayor es: " + calcularMayor());
                case 0 -> salir = true;
                default -> System.out.println("Opción inválida");
            }
        } while (!salir);
    }

    public static void añadir() {
        System.out.println("Introduce nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Introduce teléfono:");
        String telefono = teclado.nextLine();
        System.out.println("Introduce email:");
        String email = teclado.nextLine();
        System.out.println("Introduce la fecha de nacimiento (AAAA-MM-DD):");
        String nacimiento = teclado.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(nacimiento);

        Persona persona = new Persona(nombre, telefono, email, fechaNacimiento);

        if (invitados.contains(persona)) {
            System.out.println("La persona ya está en la lista de invitados.");
        } else {
            invitados.add(persona);
            System.out.println("Persona añadida correctamente.");
        }
    }

    public static void mostrarLista() {
        for (Persona invitado : invitados) {
            System.out.println(invitado);
        }
    }

    public static long edad(LocalDate fecha) {
        return ChronoUnit.YEARS.between(fecha, LocalDate.now());
    }

    public static double media() {
        if (invitados.isEmpty()) {
            return 0;
        }

        long suma = 0;
        for (Persona invitado : invitados) {
            suma += edad(invitado.getfNacimiento());
        }

        return (double) suma / invitados.size();
    }

    public static String calcularMayor() {
        String mayor = null;
        long edadMayor = 0;

        for (Persona invitado : invitados) {
            long edadInvitado = edad(invitado.getfNacimiento());

            if (edadInvitado > edadMayor) {
                mayor = invitado.getNombre();
                edadMayor = edadInvitado;
            }
        }

        return mayor;
    }
}