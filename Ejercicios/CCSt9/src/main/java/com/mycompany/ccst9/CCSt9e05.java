//Cristina Correa Segade
/*
Empleando las clases previas: MovilPrepago, MovilTarifaPlana, MovilPlus, realizar un
programa que inicialmente permita seleccionar al usuario qué tipo de tarifa tiene entre las tres
posibles, luego configurará el móvil solicitando al usuario los parámetros necesarios y finalmente
presentará al usuario un menú para realizar las operaciones permitidas (navegar, llamar, recargar,
videollamar, ver saldo y salir) según el tipo de tarifa.
*/

package com.mycompany.ccst9;

import java.util.Scanner;

public class CCSt9e05 {

    public static void main(String[] args) {
        MovilPrepago telefono = null;
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Elija una tarifa:");
        System.out.println("1. Movil Prepago");
        System.out.println("2. Movil Plus");
        System.out.println("3. Movil Tarifa Plana");

        int tarifa = teclado.nextInt();

        System.out.println("Introduce el número de móvil: ");
        long num = Long.parseLong(teclado.nextLine());
        System.out.println("Introduce el coste de establecimiento de llamada: ");
        float cEL = Float.parseFloat(teclado.nextLine());
        System.out.println("Introduce el coste por minuto de llamada: ");
        float cML = Float.parseFloat(teclado.nextLine());
        System.out.println("Introduce el saldo: ");
        float sal = Float.parseFloat(teclado.nextLine());

        switch (tarifa) {
            case 1 -> {
                System.out.println("Introduce el coste por consumo de megas: ");
                float cCM = Float.parseFloat(teclado.nextLine());
                telefono = new MovilPrepago(num, cEL, cML, cCM, sal);
            }
            case 2 -> {
                System.out.println("Introduce el coste por consumo de megas: ");
                float cCMPlus = Float.parseFloat(teclado.nextLine());
                telefono = new MovilPlus(num, cEL, cML, cCMPlus, sal);
            }
            case 3 -> telefono = new MovilTarifaPlana(num, cEL, cML, sal);
            default -> System.out.println("Opción incorrecta");
        }

        if (telefono != null) {
            do {
                int opcion = pintarMenu();
                switch (opcion) {
                    case 1 -> {
                        System.out.println("Elegiste opción 1");
                        System.out.println(telefono.toString());
                    }
                    case 2 -> {
                        System.out.println("Elegiste opción 2");
                        System.out.print("Introduce el importe a recargar: ");
                        int n = teclado.nextInt();
                        telefono.recargar(n);
                    }
                    case 3 -> {
                        System.out.println("Elegiste opción 3");
                        System.out.print("Introduce los segundos de la llamada: ");
                        int seg = teclado.nextInt();
                        if (telefono instanceof MovilPlus) {
                            ((MovilPlus) telefono).efectuarLlamada(seg);
                        } else {
                            telefono.efectuarLlamada(seg);
                        }
                    }
                    case 4 -> {
                        System.out.println("Elegiste opción 4");
                        System.out.print("Introduce los MB usados: ");
                        int mb = teclado.nextInt();

                        if (telefono instanceof MovilPlus) {
                            ((MovilPlus) telefono).navegar(mb);
                        } else if (telefono instanceof MovilTarifaPlana) {
                            ((MovilTarifaPlana) telefono).navegar();
                        } else {
                            telefono.navegar(mb);
                        }
                    }
                    case 5 -> {
                        System.out.println("\tElegiste opción 5");
                        if (telefono instanceof MovilPlus) {
                            System.out.print("Introduce los segundos de la videollamada: ");
                            int sg = teclado.nextInt();
                            ((MovilPlus) telefono).videollamada(sg);
                        } else {
                            System.out.println("Opción inválida");
                        }
                    }
                    case 0 -> salir = true;
                    default -> System.out.println("Opción incorrecta");
                }
            } while (!salir);
        }

        System.out.println("Fin del programa");
        teclado.close();
    }

    public static int pintarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU DE OPCIONES");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Recargar móvil");
        System.out.println("3. Efectuar llamada");
        System.out.println("4. Navegar por internet");
        System.out.println("5. Hacer videollamada");
        System.out.println("0. Salir del programa");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        return opcion;
    }
}