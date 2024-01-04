//Cristina Correa
//Ejercicio 7

package com.mycompany.ccst9;

import java.time.LocalDate;


public class ConsultorExterno extends Trabajador {

    private int horasTrabajadas;
    private float salarioFinal;

    public ConsultorExterno(int i, String n, LocalDate fn) {
        super(i, n, fn, 0);
        horasTrabajadas = 0;
        salarioFinal = 0;
    }

    public void setHorasTrabajadas(int ht) {
        horasTrabajadas = ht;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public float getSalarioFinal() {
        return salarioFinal;
    }

    public float calcularSalarioFinal(float precioHT) {
        salarioFinal = horasTrabajadas * precioHT;
        return salarioFinal;
    }
}