//Cristina Correa
//Ejercicio 7

package com.mycompany.ccst9;

import java.time.LocalDate;


public class Trabajador {

    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private float salarioBase;

    public Trabajador(int i, String n, LocalDate fn, float sb) {
        id = i;
        nombre = n;
        fechaNacimiento = fn;
        salarioBase = sb;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
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

    public void setSalarioBase(float sb) {
        salarioBase = sb;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trabajador other = (Trabajador) obj;
        return id == other.id;
    }

    @Override
    public String toString() {
        return String.format("El trabajador: %s con %d, su fecha de nacimiento es: %s y su salario base es: %f",
                nombre, id, fechaNacimiento.toString(), salarioBase);
    }

    @Override
    public int hashCode() {
        return id;
    }
}