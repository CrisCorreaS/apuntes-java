//Cristina Correa Segade
/*
Modificar el programa anterior para que el usuario tenga un Array de 5 teléfonos, y que
después de elegir la operación a realizar pueda elegir con cuál de los 5 teléfonos desea hacerla.
*/

package com.mycompany.ccst9;

import java.util.ArrayList;
import java.util.Scanner;

public class CCSt9e06 {

    public static void main(String[] args) {
        ArrayList<MovilPrepago> telefonos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("Elija una tarifa:");
            System.out.println("1 Movil Prepago");
            System.out.println("2 Movil Plus");
            System.out.println("3 Movil Tarifa Plana");

            int tarifa = teclado.nextInt();
            System.out.println("Introduce el numero de movil: ");
            long num = teclado.nextLong();
            System.out.println("Introduce el coste de establecimiento de llamada: ");
            float cEL = teclado.nextFloat();
            System.out.println("Introduce el coste por minuto de llamada: ");
            float cML = teclado.nextFloat();
            System.out.println("Introduce el saldo: ");
            float sal = teclado.nextFloat();

            switch (tarifa) {
                case 1 -> {
                    System.out.println("Introduce el coste por consumo de megas: ");
                    float cCM = teclado.nextFloat();
                    telefonos.add(new MovilPrepago(num, cEL, cML, cCM, sal));
                }
                case 2 -> {
                    System.out.println("Introduce el coste por consumo de megas: ");
                    float cCM = teclado.nextFloat();
                    telefonos.add(new MovilPlus(num, cEL, cML, cCM, sal));
                }
                case 3 -> telefonos.add(new MovilTarifaPlana(num, cEL, cML, sal));
                default -> System.out.println("Opción incorrecta");
            }
        } while (telefonos.size() < 5);

        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Elegiste opción 1");
                    System.out.println(telefonos.get(seleccionarTelefono()));
                }
                case 2 -> {
                    System.out.println("Elegiste opción 2");
                    System.out.print("Introduce el importe a recargar: ");
                    int n = teclado.nextInt();
                    telefonos.get(seleccionarTelefono()).recargar(n);
                }
                case 3 -> {
                    System.out.println("Elegiste opción 3");
                    System.out.print("Introduce los segundos de la llamada: ");
                    int seg = teclado.nextInt();
                    MovilPrepago telefono = telefonos.get(seleccionarTelefono());
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
                    MovilPrepago telefono = telefonos.get(seleccionarTelefono());
                    if (telefono instanceof MovilPlus) {
                        ((MovilPlus) telefono).navegar(mb);
                    } else if (telefono instanceof MovilTarifaPlana) {
                        ((MovilTarifaPlana) telefono).navegar();
                    } else {
                        telefono.navegar(mb);
                    }
                }
                case 5 -> {
                    System.out.println("Elegiste opción 5");
                    MovilPrepago telefono = telefonos.get(seleccionarTelefono());
                    if (telefono instanceof MovilPlus) {
                        System.out.print("Introduce los segundos de la videollamada: ");
                        int sg = teclado.nextInt();
                        ((MovilPlus) telefono).videollamada(sg);
                    } else {
                        System.out.print("Opción inválida");
                    }
                }
                case 0 -> salir = true;
                default -> System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opción:");
        System.out.println("1 Consultar saldo");
        System.out.println("2 Recargar saldo");
        System.out.println("3 Hacer llamada");
        System.out.println("4 Navegar");
        System.out.println("5 Hacer videollamada");
        System.out.println("0 Salir del programa");
        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }

    private static int seleccionarTelefono() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige el teléfono con el que desea realizar esta opción:");
        System.out.println("1) Teléfono 1");
        System.out.println("2) Teléfono 2");
        System.out.println("3) Teléfono 3");
        System.out.println("4) Teléfono 4");
        System.out.println("5) Teléfono 5");
        return Integer.parseInt(teclado.nextLine()) - 1;
    }
}