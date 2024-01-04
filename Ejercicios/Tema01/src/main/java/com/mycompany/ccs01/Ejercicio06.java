/*
1.6. El coste de un automóvil nuevo para un comprador es la suma total del coste de fábrica del 
vehículo, más el porcentaje de la ganancia de la tienda (que se aplica sobre el coste de fábrica) y 
añadiéndole finalmente los impuestos estatales aplicables (sobre el precio de venta calculado ya con 
beneficio de la tienda).  
Suponiendo una ganancia de tienda de 10% y un impuesto del 20%, realiza un programa que lea por 
consola el coste inicial del automóvil y calcule el coste para el consumidor.  
 */
package com.mycompany.ccs01;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definición de variables
        float costeTotal;

        //Entrada de datos
        System.out.println("Introduce el coste total del vehículo: ");
        costeTotal = teclado.nextFloat();

        //calculos
        double costeFabrica, ganancia, impuestos;
        impuestos = costeTotal / 100 * 20;
        costeFabrica = costeTotal - impuestos;
        ganancia = costeFabrica / 100 * 10;

        //Mostrar datos
        System.out.println("El coste de fábrica es: " + costeFabrica + "€");
        System.out.println("El total de los impuestos es: " + impuestos + "€");
        System.out.println("El total de la ganancia de la tienda es: " + ganancia + "€");
    }

}
