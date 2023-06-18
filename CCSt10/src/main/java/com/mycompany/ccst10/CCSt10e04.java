//Cristina Correa
/*
Copia el ejercicio del capítulo anterior de la lista de espera del médico y redefine la superclase
Paciente como abstracta haciendo el método facturar() abstracto, ya que se implementa en las tres
clases hijas.
*/


package com.mycompany.ccst10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class CCSt10e04 {

    public static ArrayList<Paciente> pacientes = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int totalFacturado = 0;

        do {
            int opcion = pintarMenu(teclado);
            switch (opcion) {
                case 1 -> {
                    System.out.println("Elegiste la opción 1");
                    registrarPaciente(teclado);
                }
                case 2 -> {
                    System.out.println("Elegiste la opción 2");
                    if (!pacientes.isEmpty()) {
                        System.out.println(pacientes.get(0));
                        totalFacturado += pacientes.get(0).facturar();
                        pacientes.remove(0);
                    } else {
                        System.out.println("No hay pacientes en espera.");
                    }
                }
                case 3 -> {
                    System.out.println("Elegiste la opción 3");
                    System.out.println("El total facturado es de: " + totalFacturado + "€");
                }
                case 0 -> salir = true;
                default -> System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu(Scanner teclado) {
        System.out.println("Elige una opción:");
        System.out.println("1- Registrar paciente");
        System.out.println("2- Llamar a consulta");
        System.out.println("3- Consultar total facturado");
        System.out.println("0- Salir del programa");
        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }

    public static void registrarPaciente(Scanner teclado) {
        System.out.println("Introduce el nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Introduce la fecha de nacimiento (formato: AAAA-MM-DD): ");
        String f = teclado.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(f);
        System.out.println("Introduce el motivo de la consulta entre estos tres: ");
        System.out.println("1- Consulta");
        System.out.println("2- Recetas");
        System.out.println("3- Revisión");
        int motivo = Integer.parseInt(teclado.nextLine());
        switch (motivo) {
            case 1 -> pacientes.add(new PacienteConsulta(nombre, fechaNacimiento));
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