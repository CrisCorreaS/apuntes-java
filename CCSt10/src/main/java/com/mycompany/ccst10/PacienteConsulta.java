//Cristina Correa Segade
//Ejercicio 4

package com.mycompany.ccst10;

import java.time.LocalDate;


public class PacienteConsulta extends Paciente {
    PacienteConsulta(String n, LocalDate fn) {
        super(n, fn, "Consulta");
    }

    @Override
    public int facturar() {
        return 100;
    }
}