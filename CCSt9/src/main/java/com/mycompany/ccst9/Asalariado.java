//Cristina Correa
//Ejercicio 7

package com.mycompany.ccst9;

import java.time.LocalDate;


public class Asalariado extends Trabajador {

    private int horasExtra;
    private float salarioFinal;

    public Asalariado(int i, String n, LocalDate fn, float sb) {
        super(i, n, fn, sb);
        horasExtra = 0;
        salarioFinal = getSalarioBase();
    }

    public void setHorasExtra(int he) {
        horasExtra = he;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public float getSalarioFinal() {
        return salarioFinal;
    }

    public float calcularSalarioFinal(float precioHE) {
        salarioFinal = getSalarioBase() + (horasExtra * precioHE);
        return salarioFinal;
    }
}