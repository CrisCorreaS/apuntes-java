package com.mycompany.pruebasjunit01;

/**
 *
 * @author Cristina Correa
 */
public class Coche {

    public String modelo;
    public float precioBase;
    public static float IMPUESTO;

    public Coche(String modelo, float precioBase) {
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public float getPrecioFinal(float descuento) throws Exception {
        float precioConDescuento = this.precioBase;

        if (descuento < 0 || descuento > 100) {
            throw new RuntimeException("Descuento Erróneo");
        }

        if (precioBase >= 5000) {
            precioConDescuento = this.precioBase - (this.precioBase * descuento / 100f);
        }

        return precioConDescuento + precioConDescuento * this.IMPUESTO / 100f;
    }
}
