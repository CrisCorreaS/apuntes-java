package com.mycompany.ccs01;

import java.util.Scanner;

    public class CCSt01e06 {

       public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                //Definición de variables

                float costetotal;
                //Entrada de datos
                 System.out.println("Introduce el coste total del vehículo: ");
                 costetotal = teclado.nextFloat();
                 
                 //calculos
                 double costefab, ganancia, impuestos;
                 impuestos=costetotal/100*20;
                 costefab=costetotal-impuestos;
                 ganancia=costefab/100*10;


          //Mostrar datos
          System.out.println("El coste de fábrica es: " + costefab + "€");
          System.out.println("El total de los impuestos es: " + impuestos + "€");  
          System.out.println("El total de la ganancia de la tienda es: " + ganancia + "€");  
    }

}
