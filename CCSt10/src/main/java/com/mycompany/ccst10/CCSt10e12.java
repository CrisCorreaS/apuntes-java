//Cristina Correa
/*
Añade el sufijo _v2 a las clases de capítulos previos: movilPrepago, movilTarifaPlana,
movilPlus y crea una interfaz llamada PrePagable que estas clases deberían implementar. Incluye en
la interfaz todos los métodos que creas oportuno y, si es necesario, alguno puede ser método por
defecto.
*/


package com.mycompany.ccst10;

import java.util.ArrayList;
import java.util.Scanner;


public class CCSt10e12 {

    public static void main(String[] args) {
        ArrayList<PrePagable> telefonos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;

        do {
            if (telefonos.size() >= 5) {
                break;
            }

            System.out.println("Elige una tarifa:");
            System.out.println("1- Movil Prepago");
            System.out.println("2- Movil Plus");
            System.out.println("3- Movil Tarifa Plana");
            System.out.println("0- Salir");
            int opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 0 -> salir = true;
                
                case 1 -> {
                    System.out.println("Introduce el número de móvil:");
                    long numeroMovil = Long.parseLong(teclado.nextLine());
                    System.out.println("Introduce el coste de establecimiento de llamada:");
                    float costeEstablecLlamada = Float.parseFloat(teclado.nextLine());
                    System.out.println("Introduce el coste por minuto de llamada:");
                    float costeMinutoLlamada = Float.parseFloat(teclado.nextLine());
                    System.out.println("Introduce el coste de consumo por MB:");
                    float costeConsumoMB = Float.parseFloat(teclado.nextLine());
                    System.out.println("Introduce el saldo inicial:");
                    float saldo = Float.parseFloat(teclado.nextLine());

                    MovilPrepagov2 movilPrepago = new MovilPrepagov2(
                            numeroMovil, costeEstablecLlamada, costeMinutoLlamada,
                            costeConsumoMB, saldo);
                    
                    telefonos.add(movilPrepago);
                }
                
                case 2 -> {
                    System.out.println("Introduce el número de móvil:");
                    long numeroMovil = Long.parseLong(teclado.nextLine());
                    System.out.println("Introduce el coste de establecimiento de llamada:");
                    float costeEstablecLlamada = Float.parseFloat(teclado.nextLine());
                    System.out.println("Introduce el coste por minuto de llamada:");
                    float costeMinutoLlamada = Float.parseFloat(teclado.nextLine());
                    System.out.println("Introduce el coste de consumo por MB:");
                    float costeConsumoMB = Float.parseFloat(teclado.nextLine());
                    System.out.println("Introduce el saldo inicial:");
                    float saldo = Float.parseFloat(teclado.nextLine());
                    MovilPlusv2 movilPlus = new MovilPlusv2(
                            numeroMovil, costeEstablecLlamada, costeMinutoLlamada,
                            costeConsumoMB, saldo);
                    telefonos.add(movilPlus);
                }
                case 3 -> {
                    System.out.println("Introduce el número de móvil:");
                    long numeroMovil = Long.parseLong(teclado.nextLine());
                    System.out.println("Introduce el coste de establecimiento de llamada:");
                    float costeEstablecLlamada = Float.parseFloat(teclado.nextLine());
                    System.out.println("Introduce el coste por minuto de llamada:");
                    float costeMinutoLlamada = Float.parseFloat(teclado.nextLine());
                    System.out.println("Introduce el saldo inicial:");
                    float saldo = Float.parseFloat(teclado.nextLine());
                    MovilTarifaPlanav2 movilTarifaPlana = new MovilTarifaPlanav2(
                            numeroMovil, costeEstablecLlamada, costeMinutoLlamada, saldo);
                    telefonos.add(movilTarifaPlana);
                }
                default -> System.out.println("Opción inválida");
            }
        } while (!salir);

        for (PrePagable telefono : telefonos) {
            System.out.println(telefono.toString());
        }
    }
}