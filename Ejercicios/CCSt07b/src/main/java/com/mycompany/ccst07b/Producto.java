//Cristina Correa Segade
//Ejercicio 19

package com.mycompany.ccst07b;

public class Producto {
    public String codigo;
    public String descripcion;
    public double precioUnidad;
    public int cantidad;
    public double precioTotal;
    
    public Producto(String cod, String desc, double precioUnidad, int cant) {
        this.codigo = cod;
        this.descripcion = desc;
        this.precioUnidad = precioUnidad;
        this.cantidad = cant;
        this.precioTotal = precioUnidad * cant;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Producto other = (Producto) obj;
        return codigo.equals(other.codigo);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + codigo.hashCode();
        return result;
    }
    
}