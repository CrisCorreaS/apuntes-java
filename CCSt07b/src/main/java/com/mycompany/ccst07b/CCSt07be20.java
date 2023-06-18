//Cristina
/**
Diseñar una clase Factura que consta de:
• Número identificador: lo proporciona el usuario en el alta de la factura.
• Fecha de la factura: la toma del sistema en el momento del alta.
• Número de cliente: : lo proporciona el usuario en el alta de la factura.
• Porcentaje de IVA: 21% para todas las facturas.
• Un número indeterminado de lineaFactura que contienen:
 Descripción del producto
 Precio unitario
 Cantidad de unidades
 Porcentaje de descuento: 5% para líneas con más de 10 unidades.
 Importe total de la línea.
• Importe total: inicialmente cero, y se va actualizando siempre que se añadan/eliminen
líneas.

Implementar la clase con su constructor y métodos para añadir línea de factura, eliminar línea de
factura y mostrar la factura por consola. Te hará falta una clase lineaFactura con su constructor.
Para añadir línea de factura, habrá que solicitar al usuario los campos necesarios para añadirlo
(descripción, precio unitario y cantidad de unidades). Para eliminar una línea, solicitaremos el
número de línea.
Hacer también un programa con un menú para gestionar una factura (alta, añadir/eliminar líneas,
mostrar factura) Nota: pensar en método toString() para líneaFactura.
 */
package com.mycompany.ccst07b;

import java.util.Scanner;


public class CCSt07be20 {

    private static Factura factura;
    private static Scanner teclado;
    
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        System.out.println("Nueva factura");
        System.out.println("Escribe el número de factura:");
        int numeroFactura = teclado.nextInt();
        System.out.println("Escribe el número de cliente:");
        int numeroCliente = teclado.nextInt();
        factura = new Factura(numeroFactura, numeroCliente);

        boolean salir = false;
        char opcion;
        do {
            System.out.println("---Gestión factura---");
            System.out.println("1) Mostrar factura");
            System.out.println("2) Añadir línea");
            System.out.println("3) Eliminar línea");
            System.out.println("4) Salir");
            opcion = teclado.next().charAt(0);
            switch (opcion) {
                case '1' -> mostrarFactura();
                case '2' -> añadirLinea();
                case '3' -> eliminarLinea();
                case '4' -> salir = true;
                default -> System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static void mostrarFactura() {
        factura.mostrarFactura();
    }

    private static void añadirLinea() {
        teclado.nextLine();
        System.out.println("Introduce descripción de la línea: ");
        String descripcionLinea = teclado.nextLine();
        System.out.println("Introduce precio por unidad: ");
        double precioUnitario = teclado.nextDouble();
        System.out.println("Introduce la cantidad: ");
        double cantidad = teclado.nextDouble();
        System.out.println("Introduce el porcentaje de descuento: ");
        double descuento = teclado.nextDouble();
        factura.añadirLinea(descripcionLinea, precioUnitario, cantidad, descuento);
    }

    private static void eliminarLinea() {
        boolean resultado;
        System.out.println("Introduce el número de línea (la primera es la 1): ");
        int numeroLinea = teclado.nextInt();
        resultado = factura.eliminarLinea(numeroLinea);
        if (resultado) {
            System.out.println("Borrado realizado");
        } else {
            System.out.println("No se encuentra la línea que has indicado, vuelve a elegir la opción de eliminar para intentarlo");
        }
    }
}
