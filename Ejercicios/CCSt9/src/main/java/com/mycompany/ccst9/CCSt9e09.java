//Cristina Correa Segade
/*
Haz un programa con un menú que permita gestionar la cola de espera de un médico. Hay
tres tipos de pacientes: los que vienen a consulta (se le pide al usuario nombre, fecha de nacimiento,
motivo de la consulta), los que viene por recetas (se le pide: nombre, fecha de nacimiento, lista de
medicamentos) y el que viene a revisión (se le pide nombre, fecha de nacimiento y fecha de la visita
anterior).
• Las tarifas del médico son: Consulta: 100 eur. Recetas: 5 eur por cada unidad. Revisión: 30 eur
para mayores de 65 años, 50 eur para resto.
• Crear una clase para cada tipo de paciente en el propio archivo del programa con los
constructores necesarios y el método de facturar() en cada una de las clases. Implementa
herencia si lo crees necesario.
• El programa tendrá un menú para:
a) Registrar la llegada del paciente: se le preguntará por qué viene al médico y se le piden
sus datos.
b) Llamar a consulta (por orden de llegada). Se le cobra la tarifa correspondiente.
c) Consultar total facturado hasta ese momento.
*/

package com.mycompany.ccst9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CCSt9e09 {

    public static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int totalFacturado = 0;

        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Elegiste la opción 1");
                    registarPaciente();
                }
                case 2 -> {
                    System.out.println("Elegiste la opción 2");
                    if (!pacientes.isEmpty()) {
                        Paciente paciente = pacientes.remove(0);
                        System.out.println(paciente.toString());
                        totalFacturado += paciente.facturar();
                    } else {
                        System.out.println("No hay pacientes en espera.");
                    }
                }
                case 3 -> {
                    System.out.println("Elegiste la opción 3");
                    System.out.println("El total facturado es: " + totalFacturado);
                }
                case 0 -> salir = true;
                default -> System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opción:");
        System.out.println("1- Registrar paciente");
        System.out.println("2- Llamar a consulta");
        System.out.println("3- Consultar total facturado");
        System.out.println("0- Salir del programa");
        try { // si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }

    public static void registarPaciente() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduce la fecha de nacimiento (formato: AAAA-MM-DD): ");
        String f = teclado.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(f);
        System.out.println("Introduce el motivo de la consulta: ");
        System.out.println("1 Consulta");
        System.out.println("2 Recetas");
        System.out.println("3 Revisión");
        int motivo = Integer.parseInt(teclado.nextLine());
        switch (motivo) {
            case 1 -> pacientes.add(new Paciente(nombre, fechaNacimiento, "Consulta"));
            case 2 -> {
                System.out.println("Introduce el número de medicamentos");
                int medicamentos = Integer.parseInt(teclado.nextLine());
                pacientes.add(new PacienteRecetas(nombre, fechaNacimiento, medicamentos));
            }
            case 3 -> {
                System.out.println("Introduce la fecha de la última revisión (formato: AAAA-MM-DD): ");
                f = teclado.nextLine();
                LocalDate fechaUltimaRevision = LocalDate.parse(f);
                pacientes.add(new PacienteRevision(nombre, fechaNacimiento, fechaUltimaRevision));
            }
            default -> System.out.println("Opción incorrecta");
        }
    }
}
