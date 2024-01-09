//Circulo Cristina Correa
package com.mycompany.pruebasjunit01;

public class Circulo {

    private static float RADIO;
    

    public static float getRadio() {
        return RADIO;
    }

    public static void setRadio(float rad) {
        RADIO = rad;
    }

    public double calcularCircunferencia() {
        double circunferencia = -1;

        if (RADIO >= 0) {
            circunferencia = Math.PI * RADIO * 2;
        }

        return circunferencia;
    }

    public double calcularSuperficie() {
        double superficie = -1;

        if (RADIO >= 0) {
            superficie = Math.PI * Math.pow(RADIO, 2);
        }

        return superficie;
    }

    public int calcularDiametro() {
        int diametro = -1;
        
        if (RADIO >= 0) {
            float resultado = 2 * RADIO;
            diametro = Math.round(resultado);
        }
        
        return diametro;
    }
}
