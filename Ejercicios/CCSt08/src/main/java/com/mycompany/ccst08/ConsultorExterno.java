//Cristina Correa Segade
//Ejercicio 11

package com.mycompany.ccst08;

import java.time.LocalDate;


public class ConsultorExterno extends Trabajador {
    private int horasTrabajadas;
    private float salarioFinal;

    public ConsultorExterno(int id, String nombre, LocalDate fechaNacimiento) {
        super(id, nombre, fechaNacimiento, 0);
        this.horasTrabajadas = 0;
        this.salarioFinal = 0;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setSalarioFinal(float salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public float getSalarioFinal() {
        return salarioFinal;
    }

    public float calcularSalarioFinal(float precioHT) {
        salarioFinal = horasTrabajadas * precioHT;
        return salarioFinal;
    }
}
