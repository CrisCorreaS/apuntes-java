//Cristina Correa Segade
//Ejercicio 11

package com.mycompany.ccst08;

import java.time.LocalDate;


public class Asalariado extends Trabajador{
    
    private int horasExtra;
    private float salarioFinal;

    public Asalariado(int id, String nombre, LocalDate fechaNacimiento, float salarioBase) {
        super(id, nombre, fechaNacimiento, salarioBase);
        this.horasExtra = 0;
        this.salarioFinal = salarioBase;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setSalarioFinal(float salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public float getSalarioFinal() {
        return salarioFinal;
    }

    public float calcularSalarioFinal(float precioHE) {
        salarioFinal = getSalarioBase() + (horasExtra * precioHE);
        return salarioFinal;
    }
}
