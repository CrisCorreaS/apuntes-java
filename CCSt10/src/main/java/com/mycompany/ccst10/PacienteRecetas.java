//Cristina Correa Segade
//Ejercicio 4

package com.mycompany.ccst10;

import java.time.LocalDate;


public class PacienteRecetas extends Paciente {
    protected int medicamentos;

    PacienteRecetas(String n, LocalDate fn, int med) {
        super(n, fn, "recetas");
        medicamentos = med;
    }

    public void setMedicamentos(int med) {
        medicamentos = med;
    }

    public int getMedicamentos() {
        return medicamentos;
    }

    @Override
    public int facturar() {
        return 5 * medicamentos;
    }
}