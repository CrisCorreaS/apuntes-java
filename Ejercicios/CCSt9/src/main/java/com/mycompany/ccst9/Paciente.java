//Cristina Correa
//Ejercicio 9

package com.mycompany.ccst9;

import java.time.LocalDate;


public class Paciente {
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected String motivoConsulta;

    public Paciente(String nombre, LocalDate fechaNacimiento, String motivoConsulta) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.motivoConsulta = motivoConsulta;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public int facturar() {
        return 100;
    }

    @Override
    public String toString() {
        return "El paciente: " + nombre + " ha sido llamado para " + motivoConsulta;
    }
}