//Cristina Correa Segade
//Ejercicio 8

package com.mycompany.ccst07;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precioUnidad;
    private int cantidad;
    private double precioTotal;

    public Producto(int codigo, String descripcion, double precioUnidad, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioUnidad = precioUnidad;
        this.cantidad = cantidad;
        this.precioTotal = precioUnidad * cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                ", Descripción: " + descripcion +
                ", Precio unidad: " + precioUnidad +
                ", Cantidad: " + cantidad +
                ", Precio total: " + precioTotal;
    }
}
