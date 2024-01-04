//Cristina Correa Segade
//Ejercicio 12

package com.mycompany.ccst10;


public class MovilPrepagov2 implements PrePagable {
    public long numeroMovil;
    protected float costeEstablecLlamada;
    protected float costeMinutoLlamada;
    protected float costeConsumoMB;
    protected float saldo;

    MovilPrepagov2(long nM, float cEL, float cML, float cMB, float s) {
        numeroMovil = nM;
        costeEstablecLlamada = cEL;
        costeMinutoLlamada = cML;
        costeConsumoMB = cMB;
        saldo = s;
    }

    @Override
    public void efectuarLlamada(int segundos) {
        saldo -= Math.round(
            (costeEstablecLlamada + costeMinutoLlamada / 60f * segundos) * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    public void navegar(int mb) {
        saldo -= Math.round(costeConsumoMB * mb * 100f) / 100f;
        if (saldo < 0) {
            saldo = 0;
        }
    }

    @Override
    public boolean recargar(int importe) {
        if (importe % 5 == 0) {
            saldo += importe;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public float consultarSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return String.format("El número de móvil es: %d y el saldo actual: %f", numeroMovil, saldo);
    }
}
