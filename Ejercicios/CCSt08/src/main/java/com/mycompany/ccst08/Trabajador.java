//Cristina Correa Segade
//Ejercicio 11

package com.mycompany.ccst08;

import java.time.LocalDate;


public class Trabajador {
    
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private float salarioBase;

    public Trabajador(int id, String nombre, LocalDate fechaNacimiento, float salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.salarioBase = salarioBase;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
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
        String linea = String.format("El trabajador: %s con %d, su fecha de nacimiento es: %s y su salario base es: %f", nombre, id, fechaNacimiento, salarioBase);
        return linea;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

}
