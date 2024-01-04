//Cristina Correa Segade
//Ejercicio 12

package com.mycompany.ccst10;


public interface PrePagable {
    void efectuarLlamada(int segundos);
    boolean recargar(int importe);
    float consultarSaldo();
    
    @Override
    String toString();
}