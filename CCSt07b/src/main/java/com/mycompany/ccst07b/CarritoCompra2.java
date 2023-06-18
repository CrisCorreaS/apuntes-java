//Cristina Correa Segade
//Ejercicio 19

package com.mycompany.ccst07b;

import java.util.ArrayList;


public class CarritoCompra2 {
    public ArrayList<Producto> listaProductos;
    public static double importeCompra;

    public CarritoCompra2() {
        listaProductos = new ArrayList<>();
        importeCompra = 0;
    }

    public void agregarProducto(Producto prod) {
        listaProductos.add(prod);
    }

    public void mostrarCarrito() {
        if (listaProductos.isEmpty()) {
            System.out.println("El carrito está vacío");
        } else {
            System.out.println("Su carrito es:");

            for (int i = 0; i < listaProductos.size(); i++) {
                int numeroProducto = i + 1;

                System.out.println(numeroProducto + ") Artículo:");
                System.out.println("");
                System.out.println("-> Código: " + this.listaProductos.get(i).codigo);
                System.out.println("-> Descripción: " + this.listaProductos.get(i).descripcion);
                System.out.println("-> Precio: " + this.listaProductos.get(i).precioUnidad);
                System.out.println("-> Cantidad: " + this.listaProductos.get(i).cantidad);
                System.out.println("-> Precio total: " + this.listaProductos.get(i).precioTotal);
                System.out.println("");
            }
        }
    }

    public boolean borrarTodosProductos() {
        if (!listaProductos.isEmpty()) {
            listaProductos.clear();
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarProducto(String codigo) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto producto = listaProductos.get(i);
            if (producto.codigo.equals(codigo)) {
                listaProductos.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CarritoCompra2 other = (CarritoCompra2) obj;
        if (Double.compare(CarritoCompra2.importeCompra, other.importeCompra) != 0) {
            return false;
        }
        return listaProductos.equals(other.listaProductos);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + listaProductos.hashCode();
        return result;
    }
}
