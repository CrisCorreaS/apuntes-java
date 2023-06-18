//Cristina
/**
Realizar el programa que simule el comportamiento de una “cola” FIFO con los nombres de
pacientes que esperan en la consulta del médico. Tendrá un menú con las siguientes opciones a)
Llega un paciente (esto es, Introducir elemento al final de la cola) b) Llamar al paciente para ser
atendido (esto es, sacar el primer elemento de la cola) mostrándolo por pantalla y c) Mostrar el
estado de la cola y d) salir de programa.
 */
package com.mycompany.ccst07b;

import java.util.ArrayList;
import java.util.Scanner;


public class CCSt07be23 {

    private static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
         ArrayList<String> listaPacientes = new ArrayList<>();
        
        boolean salir = false;
        int opcion;
        
        do {
            mostrarMenu();
            opcion = obtenerOpcion();
            
            switch (opcion) {
                case 1 -> agregarPaciente(listaPacientes);
                case 2 -> llamarPaciente(listaPacientes);
                case 3 -> mostrarLista(listaPacientes);
                case 4 -> salir = true;
                default -> System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }
    
    public static void mostrarMenu() {
        System.out.println("Introduce opción:");
        System.out.println("1) Añadir un paciente");
        System.out.println("2) Llamar al paciente");
        System.out.println("3) Mostrar cola de pacientes");
        System.out.println("4) Salir");
    }
    
  
    public static int obtenerOpcion() {
        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Opción inválida");
            return obtenerOpcion();
        }
    }

    
    public static void agregarPaciente(ArrayList<String> lista) {
        System.out.println("Introduce el nombre del paciente:");
        String paciente = teclado.nextLine();
        lista.add(paciente);
    }
    

    public static void llamarPaciente(ArrayList<String> lista) {
        if (!lista.isEmpty()) {
            String paciente = lista.get(0);
            lista.remove(0);
            System.out.println("El paciente " + paciente + " ha sido llamado");
        } else {
            System.out.println("No hay pacientes en la cola.");
        }
    }
    
 
    public static void mostrarLista(ArrayList<String> lista) {
        if (!lista.isEmpty()) {
            System.out.println("La lista de pacientes en espera es: ");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println((i + 1) + "- " + lista.get(i));
            }
        } else {
            System.out.println("No hay pacientes en la cola");
        }
    }
}
