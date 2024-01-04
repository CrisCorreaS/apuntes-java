//Cristina
/**
Realizar una clase carritoCompra2 que mantenga las compras realizadas por un cliente en un
ArrayList. Cada posición del ArrayList contendrá el código del producto, la descripción, el precio
unitario y la cantidad de unidades compradas y el precio total de ese producto (cantidad x precio
unitario). Se permite comprar un número indeterminado de artículos. Además de la lista de
productos, la clase tiene el importe total de la compra, que debe estar siempre actualizado.
Necesitamos los métodos:
a) Mostrar por consola el estado actual del carrito.
b) Vaciar carrito.
c) Añadir producto.
d) Eliminar producto (se le pasa el código de producto) y lo elimina físicamente del ArrayList.
Hacer un programa con un menú que permita al usuario operar con el carrito de la compra.
 */
package com.mycompany.ccst07b;

import java.util.Scanner;


public class CCSt07be19 {

    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        CarritoCompra2 carrito = new CarritoCompra2();
       
        boolean salir = false;
        int opcion;
       
        do {
            menu();
            opcion = Integer.parseInt(teclado.nextLine());
           
            switch (opcion) {
                case 1 -> carrito.mostrarCarrito();
                case 2 -> vaciarCarrito(carrito);
                case 3 -> agregarArticulo(carrito);
                case 4 -> borrarArticulo(carrito);
                case 5 -> salir = true;
                default -> System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }
    
    public static void menu() {
        System.out.println("Elige una opción: ");
        System.out.println("1) Mostrar el estado del carrito");
        System.out.println("2) Vaciar el carrito");
        System.out.println("3) Añadir un producto al carrito");
        System.out.println("4) Eliminar un producto");
        System.out.println("5) Salir.");
    }
    
    public static void vaciarCarrito(CarritoCompra2 c) {
        if (c.borrarTodosProductos()) {
            System.out.println("-> Todos sus productos han sido eliminados.");
        } else {
            System.out.println("-> Su carrito ya está vacío.");
        }
    }
    
    public static void agregarArticulo(CarritoCompra2 carrito) {
        System.out.println("Introduce el código del producto");
        String codigo = teclado.nextLine();
        
        System.out.println("Introduce la descripción del producto");
        String descripcion = teclado.nextLine();

        System.out.println("Introduce el precio");
        double precio = Double.parseDouble(teclado.nextLine());

        System.out.println("Introduce la cantidad");
        int cantidad = Integer.parseInt(teclado.nextLine());

        Producto producto = new Producto(codigo, descripcion, precio, cantidad);
        
        carrito.agregarProducto(producto);
        
        System.out.println("El producto ha sido agregado correctamente");
    }
    
    public static void borrarArticulo(CarritoCompra2 carrito) {
        if (carrito.listaProductos.isEmpty()) {
            System.out.println("El carrito está vacío");
        } else {
            System.out.println("Escribe el código del producto para borrarlo");
            String codigo = teclado.nextLine();

            if (carrito.eliminarProducto(codigo)) {
                System.out.println("El producto indicado ha sido borrado correctamente"); 
            } else {
                System.out.println("No hay ningún artículo con ese código en su carrito");
            }
        }
    }
}
