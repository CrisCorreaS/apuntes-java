//Cristina Correa Segade
/*
Modifica la clase Persona (llámale Persona_v2) para que dos personas sean iguales si tienen
el mismo nombre sin tener en cuenta mayúsculas y minúsculas. Repite el ejercicio anterior
intentando incluir en el conjunto valores que no sean permitidos por esta nueva condición (por
ejemplo: Ana y ANA generarían un duplicado).
*/

package com.mycompany.ccst15;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;


public class CCSt15e05 {

    static HashSet<Persona1v2> invitados = new HashSet<>();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        do {
            System.out.println("Seleccione una opción:\n 1) Añadir\n 2) Mostrar lista\n 3) Media de edad\n 0) Salir");
            int opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1 -> engadir();
                case 2 -> mostrarLista();
                case 3 -> System.out.println("La media de edad es: " + media() + " y el nombre del mayor es: " + calcularMayor());
                case 0 -> salir = true;
            }
        } while (!salir);
    }

    public static void engadir() {
        System.out.println("Introduce nombre");
        String nombre = teclado.nextLine();
        System.out.println("Introduce telefono");
        String telefono = teclado.nextLine();
        System.out.println("Introduce email");
        String email = teclado.nextLine();
        System.out.println("Introduce la fecha de nacimiento (AAAA-MM-DD)");
        String nacimiento = teclado.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(nacimiento);

        Persona1v2 persona = new Persona1v2(nombre, telefono, email, fechaNacimiento);
        if (invitados.contains(persona)) {
            System.out.println("Persona duplicada. No se añadirá a la lista.");
        } else {
            invitados.add(persona);
            System.out.println("Persona añadida correctamente.");
        }
    }

    public static void mostrarLista() {
        for (Persona1v2 invi : invitados) {
            System.out.println(invi);
        }
    }

    public static long edad(LocalDate fecha) {
        return fecha.until(LocalDate.now()).getYears();
    }

    public static long media() {
        long suma = 0;
        for (Persona1v2 invi : invitados) {
            suma += edad(invi.getfNacimiento());
        }
        return invitados.isEmpty() ? 0 : suma / invitados.size();
    }

    public static String calcularMayor() {
        String mayor = null;
        long edadMayor = 0;
        for (Persona1v2 invitado : invitados) {
            long edadInvitado = edad(invitado.getfNacimiento());
            if (edadInvitado > edadMayor) {
                mayor = invitado.getNombre();
                edadMayor = edadInvitado;
            }
        }
        return mayor;
    }
}