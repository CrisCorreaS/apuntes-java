//Cristina Correa Segade

//Ejercicio 8

package com.mycompany.ccst07;


public class CarritoCompra {
    private static final int MAX_PRODUCTOS = 100;
    private Producto[] productos;
    private int cantidadProductos;
    private double importeTotal;

    public CarritoCompra() {
        productos = new Producto[MAX_PRODUCTOS];
        cantidadProductos = 0;
        importeTotal = 0.0;
    }

    public void mostrarEstado() {
        if (cantidadProductos == 0) {
            System.out.println("Carrito de compra vacío.");
        } else {
            System.out.println("El carrito de compra está: ");
            for (int i = 0; i < cantidadProductos; i++) {
                System.out.println(productos[i]);
            }
        }
        System.out.println("Importe total: " + importeTotal);
    }

    public void agregarProducto(int codigo, String descripcion, double precioUnidad, int cantidad) {
        if (cantidadProductos < MAX_PRODUCTOS) {
            Producto producto = new Producto(codigo, descripcion, precioUnidad, cantidad);
            productos[cantidadProductos] = producto;
            cantidadProductos++;
            importeTotal += producto.getPrecioTotal();
            System.out.println("Producto agregado al carrito.");
        } else {
            System.out.println("No se pueden agregar más productos, el carrito está lleno.");
        }
    }
}
