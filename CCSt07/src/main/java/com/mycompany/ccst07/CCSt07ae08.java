//Cristina Correa Segade
/*
Realizar una clase carritoCompra que mantenga las compras realizadas por un cliente en un
Array. Cada posición del Array contendrá el código del producto, la descripción, el precio unitario y
la cantidad de unidades compradas y el precio total de ese producto (cantidad x precio unitario). Se
permite comprar como máximo de 100 artículos diferentes. Además de la lista de productos, la clase
tiene el importe total de la compra, que debe estar siempre actualizado. Necesitamos los métodos:
a. Mostrar por consola el estado actual del carrito.
b. Añadir producto.
Hacer un programa con un menú que permita al usuario operar con el carrito de la compra.
Nota: Pensar en crear un método .toString() para facilitar el mostrar por pantalla cada producto comprado.
 */

package com.mycompany.ccst07;

import java.util.Scanner;


public class CCSt07ae08 {

    public static void main(String[] args) {
        
        CarritoCompra carrito = new CarritoCompra();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("----Carrito de la Compra----");
            System.out.println("a) Mostrar estado del carrito");
            System.out.println("b) Agregar producto al carrito");
            System.out.println("c) Salir");
            System.out.print("Elige una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "a" -> carrito.mostrarEstado();
                case "b" -> {
                    System.out.print("Escriba el código del producto: ");
                    int codigo = Integer.parseInt(scanner.nextLine());
                    System.out.print("Escriba la descripción del producto: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Escriba el precio unitario del producto: ");
                    double precioUnitario = Double.parseDouble(scanner.nextLine());
                    System.out.print("Escriba la cantidad de unidades compradas: ");
                    int cantidad = Integer.parseInt(scanner.nextLine());

                    carrito.agregarProducto(codigo, descripcion, precioUnitario, cantidad);
                }
                case "c" -> salir = true;
                default -> System.out.println("Opción inválida. Escribe la opción otra vez");
            }
        } while (!salir);
    }
}
