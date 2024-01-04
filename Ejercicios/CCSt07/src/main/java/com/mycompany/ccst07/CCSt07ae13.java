//Cristina Correa Segade
/*
Realizar un programa que tenga un Array con una agenda de teléfonos simple con unos
valores cualquiera. Por ejemplo:
Marta 666111222
Miguel 981981981
Ana 900900900
Daniel +34881000001
Al programa se le pasará como parámetro un nombre. Si el nombre está en la agenda, mostrará su
teléfono, y en caso contrario informará que no existe dicha persona. java prog Ana.
 */

package com.mycompany.ccst07;

import java.util.Scanner;


public class CCSt07ae13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] agenda = {
            {"Marta", "666111222"},
            {"Miguel", "981981981"},
            {"Ana", "900900900"},
            {"Daniel", "+34881000001"}
        };

        System.out.print("Escriba un nombre: ");
        String nombreBuscado = scanner.nextLine();

        boolean encontrado = false;
        String telefono = "";

        for (String[] contacto : agenda) {
            String nombre = contacto[0];
            if (nombre.equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                telefono = contacto[1];
                break;
            }
        }

        if (encontrado) {
            System.out.println("El teléfono de " + nombreBuscado + " es: " + telefono);
        } 
        else {
            System.out.println(nombreBuscado + " no aparece en la agenda.");
        }
    }
}
