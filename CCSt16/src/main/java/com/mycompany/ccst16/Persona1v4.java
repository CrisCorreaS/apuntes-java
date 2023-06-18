//Cristina Correa Segade


package com.mycompany.ccst16;

import java.time.LocalDate;
import java.util.Objects;


public class Persona1v4 {
    protected String nombre;
    protected String telefono;
    protected String email;
    protected LocalDate fechaNacimiento;
    protected Genero genero;

    Persona1v4(String nombre, String telefono, String email, LocalDate fechaNacimiento, Genero genero) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String tlf) {
        this.telefono = tlf;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setfNacimiento(LocalDate nacimiento) {
        this.fechaNacimiento = nacimiento;
    }

    public LocalDate getfNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona1v4 other = (Persona1v4) obj;
        return Objects.equals(this.nombre.toLowerCase(), other.nombre.toLowerCase());
    }

    @Override
    public String toString() {
        return "Persona_V4{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", genero=" + genero +
                '}';
    }
}

enum Genero {
    MASCULINO,
    FEMENINO
}
