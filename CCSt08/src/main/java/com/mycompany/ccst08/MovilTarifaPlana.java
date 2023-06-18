//Cristina Correa Segade
//Ejercicio 10

package com.mycompany.ccst08;


public class MovilTarifaPlana extends MovilPrepago{
    
    public MovilTarifaPlana(long nM, float cEL, float cML, float s) {
        super(nM, cEL, cML, 0, s);
    }

    @Override
    public void navegar(int mb) {
        // No se reduce el saldo en la tarifa plana
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
