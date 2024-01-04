//Cristina Correa Segade
//Ejercicio 20

package com.mycompany.ccst07b;

import java.time.LocalDate;
import java.util.ArrayList;

//Clase pública FacturaS
public class Factura {
    
     private int id;
    private LocalDate fecha;
    private int numCliente;
    private static final double IVA = 0.21d;
    private ArrayList<LineaFactura> lineasFactura;
    private double importeTotalFactura;

    public Factura(int id, int numCliente) {
        this.id = id;
        this.fecha = LocalDate.now();
        this.numCliente = numCliente;
        lineasFactura = new ArrayList<>();
        this.importeTotalFactura = 0;
    }

    public void añadirLinea(String descripcion, double precioUnitario, double cantidadUnidades, double porcentajeDescuento) {
        lineasFactura.add(new LineaFactura(descripcion, precioUnitario, cantidadUnidades, porcentajeDescuento));
        recalcularTotalFactura();
    }

    public boolean eliminarLinea(int numeroLinea) {
        int numLinea = numeroLinea - 1;
        if (numLinea < 0 || numLinea >= lineasFactura.size()) {
            return false;
        }
        lineasFactura.remove(numLinea);
        recalcularTotalFactura();
        return true;
    }

    private void recalcularTotalFactura() {
        this.importeTotalFactura = 0;
        for (LineaFactura lf : this.lineasFactura) {
            this.importeTotalFactura += lf.getImporteTotalLinea();
        }
        this.importeTotalFactura += this.importeTotalFactura * Factura.IVA;
    }

    public void mostrarFactura() {
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Num cliente: " + this.numCliente);
        for (LineaFactura lf : this.lineasFactura) {
            System.out.println(lf.toString());
        }
        System.out.println("Total Factura: " + this.importeTotalFactura);
    }

}



//Clase LineaFactura
class LineaFactura {
    private String descripcion;
    private double precioUnitario;
    private double cantidadUnidades;
    private double porcentajeDescuento;
    private double importeTotalLinea;

    public LineaFactura(String descripcion, double precioUnitario, double cantidadUnidades, double porcentajeDescuento) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidadUnidades = cantidadUnidades;
        this.porcentajeDescuento = porcentajeDescuento;
        this.importeTotalLinea = precioUnitario * cantidadUnidades * (1 - porcentajeDescuento);
    }

    public double getImporteTotalLinea() {
        return importeTotalLinea;
    }

    @Override
    public String toString() {
        return descripcion + "[" + cantidadUnidades + "]-->" + importeTotalLinea;
    }
}