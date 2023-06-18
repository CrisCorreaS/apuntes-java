//Cristina Correa Segade
/*
Crea una enumeración pública con el género de las personas (masculino, femenino) en un
archivo propio. Crea una nueva versión de la clase Persona (Persona_v4) que la incorpore como
atributo y adapta los métodos necesarios para tratarla (constructor, toString, etc). Haz un programa
que solicite al usuario por consola los datos de personas y los almacene en un HashSet (Introducirá
nombre “Z” para indicar que no desea introducir más personas). Finalmente mostrará todos los
datos almacenados en el conjunto.
*/

package com.mycompany.ccst16;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;


public class CCSt16e01 {

    static HashSet<Persona1v4> personas = new HashSet<>();
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        boolean salir = false;
        do {
            System.out.println("Seleccione una opcion:\n A)Añadir\n B)Mostrar lista\n Z)Salir");
            char opc = teclado.nextLine().charAt(0);
            char opcion = Character.toLowerCase(opc);

            switch (opcion) {
                case 'a' -> engadir();
                case 'b' -> mostrarLista();
                case 'z' -> salir = true;
            }
        } while (!salir);

    }

    public static void engadir() {
        System.out.println("Introduce nombre");
        String nombre = teclado.nextLine();
        if (nombre.equalsIgnoreCase("Z")) {
            return;
        }

        System.out.println("Introduce telefono");
        String telefono = teclado.nextLine();

        System.out.println("Introduce email");
        String email = teclado.nextLine();

        System.out.println("Introduce la fecha de nacimiento (AAAA-MM-DD)");
        String nacimiento = teclado.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(nacimiento);

        System.out.println("Introduce el género: Masculino o Femenino");
        String gen = teclado.nextLine().toUpperCase();
        try {
            Genero genero = Genero.valueOf(gen);
            Persona1v4 pers = new Persona1v4(nombre, telefono, email, fechaNacimiento, genero);
            personas.add(pers);
            System.out.println("Persona añadida");
        } catch (IllegalArgumentException e) {
            System.out.println("Género incorrecto");
        }
    }

    public static void mostrarLista() {
        for (Persona1v4 per : personas) {
            System.out.println(per);
        }
    }
}