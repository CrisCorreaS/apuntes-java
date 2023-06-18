//Cristina Correa Segade
/*
Haz un programa con un TreeSet de Persona_v2 (es un conjunto ordenado), que introduzca
“a mano” unas cuantas personas en el conjunto y a continuación las muestre con un for...each. ¿Qué
ocurre? Crea una nueva versión de Persona_v3 que resuelva los problemas encontrados y que
ordene y no permita duplicados por nombre sin distinguir mayúsculas de minúsculas. Si eliminases
de la clase Persona_v3 los métodos equals() y hashCode(). ¿Seguiría funcionando correctamente?
*/

package com.mycompany.ccst15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.TreeSet;


public class CCSt15e16 {

    static Scanner teclado = new Scanner(System.in);
    static TreeSet<Persona1v3> invitados = new TreeSet<>();
    
    static int opcion;

    public static void main(String[] args) {
        boolean salir = false;
        long edad;
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

        Persona1v3 persona = new Persona1v3(nombre, telefono, email, fechaNacimiento);
        boolean correcto = invitados.add(persona);
        if (correcto)
            System.out.println("Jugador añadido");
        else
            System.out.println("Duplicado");
    }

    public static void mostrarLista() {
        for (Persona1v3 invi : invitados) {
            System.out.println(invi);
        }
    }

    public static long edad(LocalDate fecha) {
        long edad = 0;
        edad = ChronoUnit.YEARS.between(fecha, LocalDate.now());
        return edad;
    }

    public static long media() {
        long media = 0;
        long suma = 0;
        long edadInvitado;
        LocalDate fecha;
        for (Persona1v3 invi : invitados) {
            fecha = invi.getfNacimiento();
            edadInvitado = edad(fecha);
            suma += edadInvitado;
        }
        media = suma / invitados.size();
        return media;
    }

    public static String calcularMayor() {
        String mayor = null;
        long edadInvitado;
        long edadMayor = 0;
        LocalDate fecha;
        for (Persona1v3 invi : invitados) {
            fecha = invi.getfNacimiento();
            edadInvitado = edad(fecha);
            if (edadInvitado > edadMayor) {
                mayor = invi.getNombre();
                edadMayor = edadInvitado;
            }
        }
        return mayor;
    }
}
