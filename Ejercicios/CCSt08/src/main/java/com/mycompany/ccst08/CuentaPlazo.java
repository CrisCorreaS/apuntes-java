//Cristina Correa Segade
//Ejercicio 9

package com.mycompany.ccst08;

import java.time.LocalDate;


public class CuentaPlazo extends CuentaCorriente{
    private LocalDate fechaCreacion;

    public CuentaPlazo(String ib) {
        super(ib);
        fechaCreacion = LocalDate.now();
    }

    @Override
    public boolean retirar(float i) {
        if (i <= saldo) {
            saldo -= i;
            contadorIngresos = 0;
            return true;
        } else {
            return false;
        }
    }
}
