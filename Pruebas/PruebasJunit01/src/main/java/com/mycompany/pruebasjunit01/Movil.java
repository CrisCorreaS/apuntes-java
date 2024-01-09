package com.mycompany.pruebasjunit01;

/**
 *
 * @author Cristina Correa
 */
public class Movil {

    private static float TARIFA_LLAMADAS;
    private float saldo;
    private String modelo;

    public Movil(float saldo, String modelo) {
        this.saldo = saldo;
        this.modelo = modelo;
    }

    public float getTarifa() {
        return this.TARIFA_LLAMADAS;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setTarifa(float tarifa) {
        this.TARIFA_LLAMADAS = tarifa;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean hacerLlamada(int minutos) {
        boolean llamadaPosible = this.saldo > minutos * TARIFA_LLAMADAS;

        if (llamadaPosible) {
            this.saldo -= minutos * TARIFA_LLAMADAS;
        }

        return llamadaPosible;
    }
}
