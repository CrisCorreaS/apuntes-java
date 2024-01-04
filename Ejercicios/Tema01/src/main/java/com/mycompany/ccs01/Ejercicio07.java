/*
1.7. Queremos realizar un pequeño programa para introducirlo en el ordenador de a bordo de 
nuestro coche y que nos informe del consumo medio del coche cada 100 km. Diseña un programa 
al que le introduzcamos el kilometraje de la última vez que se repostó, el kilometraje actual, los litros 
de gasolina que tenía al finalizar la última vez que repostó y la cantidad de gasolina actual.  
*/

package com.mycompany.ccs01;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Definición de variables
        float kmPasado, kmActual, litrosGasolinaPasado, litrosGasolinaActuales;
        
        //Entrada de datos
        System.out.println("Introduce el kilometraje de la última vez que se repostó: ");
        kmPasado = teclado.nextFloat();

        System.out.println("Introduce el kilometraje actual: ");
        kmActual = teclado.nextFloat();

        System.out.println("Introduce los litros de gasolina que tenías al finalizar la última vez que repostaste: ");
        litrosGasolinaPasado = teclado.nextFloat();

        System.out.println("Introduce la cantidad de gasolina actual: ");
        litrosGasolinaActuales = teclado.nextFloat();

        //calculos
        double total, kms, litrosGasolina;

        kms = kmActual - kmPasado;
        litrosGasolina = litrosGasolinaPasado - litrosGasolinaActuales;
        total = litrosGasolina * 100 / kms;

        //Mostrar datos
        System.out.println("El total del consumo medio del coche es de: " + total + " L/km (litros por kilómetro)");
    }

}
