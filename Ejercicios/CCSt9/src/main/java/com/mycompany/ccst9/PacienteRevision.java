//Cristina Correa
//Ejercicio 9

package com.mycompany.ccst9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


class PacienteRevision extends Paciente {
    protected LocalDate fechaUltimaRevision;

    public PacienteRevision(String nombre, LocalDate fechaNacimiento, LocalDate fechaUltimaRevision) {
        super(nombre, fechaNacimiento, "revisión");
        this.fechaUltimaRevision = fechaUltimaRevision;
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
