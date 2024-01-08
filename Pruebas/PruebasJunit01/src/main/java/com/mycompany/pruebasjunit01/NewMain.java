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
    }
}
