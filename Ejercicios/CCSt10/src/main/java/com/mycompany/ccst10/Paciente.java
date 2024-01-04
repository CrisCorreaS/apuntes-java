//Cristina Correa Segade
//Ejercicio 4

package com.mycompany.ccst10;

import java.time.LocalDate;


public abstract class Paciente {
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected String motivoConsulta;

    Paciente(String n, LocalDate fn, String mC) {
        nombre = n;
        fechaNacimiento = fn;
        motivoConsulta = mC;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFechaNacimiento(LocalDate fn) {
        fechaNacimiento = fn;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setMotivoConsulta(String mC) {
        motivoConsulta = mC;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public abstract int facturar();

    @Override
    public String toString() {
        return String.format("El paciente: %s ha sido llamado para %s", nombre, motivoConsulta);
    }
}
