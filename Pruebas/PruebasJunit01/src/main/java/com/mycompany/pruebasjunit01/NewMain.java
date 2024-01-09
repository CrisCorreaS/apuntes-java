/**
 *
 * @author Cristina Correa
 */
package com.mycompany.pruebasjunit01;

public class NewMain {

    public static void main(String[] args) throws Exception {
        Coche coche = new Coche("Audi A3", 10000);
        Coche.IMPUESTO = 20f;

        System.out.println("Precio final: " + coche.getPrecioFinal(10f));

        Movil movil = new Movil(100, "Samsung Galaxy");
        movil.setTarifa(0.5f);

        System.out.println("El saldo del " + movil.getModelo() + " es " + movil.getSaldo());

        movil.hacerLlamada(10);
        System.out.println("El saldo del móvil después de hacer una llamada de 10 minutos es " + movil.getSaldo());
        
        Circulo circulo = new Circulo();
        circulo.setRadio(3.333f);
        
        System.out.println("El círculo tiene una circunferencia de: " + circulo.calcularCircunferencia());                
        System.out.println("El círculo tiene una superficie de: " + circulo.calcularSuperficie());
        System.out.println("El círculo tiene un diámetro de: " + circulo.calcularDiametro());

    }
}
