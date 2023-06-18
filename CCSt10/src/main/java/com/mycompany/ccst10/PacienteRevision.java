//Cristina Correa Segade
//Ejercicio 4

package com.mycompany.ccst10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class PacienteRevision extends Paciente {
    protected LocalDate fechaUltimaRevision;

    PacienteRevision(String n, LocalDate fn, LocalDate fUR) {
        super(n, fn, "revision");
        fechaUltimaRevision = fUR;
    }

    public void setFechaUltimaRevision(LocalDate fUR) {
        fechaUltimaRevision = fUR;
    }

    public LocalDate getFechaUltimaRevision() {
        return fechaUltimaRevision;
    }

    @Override
    public int facturar() {
        if (ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now()) > 65) {
            return 30;
        }
        return 50;
    }   
}
