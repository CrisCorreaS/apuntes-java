//Cristina Correa
//Ejercicio 9

package com.mycompany.ccst9;

import java.time.LocalDate;


class PacienteRecetas extends Paciente {
    protected int medicamentos;

    public PacienteRecetas(String nombre, LocalDate fechaNacimiento, int medicamentos) {
        super(nombre, fechaNacimiento, "recetas");
        this.medicamentos = medicamentos;
    }

    public int getMedicamentos() {
        return medicamentos;
    }

    @Override
    public int facturar() {
        return 5 * medicamentos;
    }
}
