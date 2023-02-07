package com.mycompany.ccs01;

import java.util.Scanner;

    public class CCSt01e05 {

       public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                //Definición de variables

                float f, p;
                //Entrada de datos
                 System.out.println("Introduce los grados Fahrenheit: ");
                 f = teclado.nextFloat();
                 
                 System.out.println("Introduce la cantidad de agua en pulgadas: ");
                 p = teclado.nextFloat();
                 
                 //calculos
                 double c, cm;
                 c=((f-32)*5)/9;
                 cm=2.55*p;


          //Mostrar datos
          System.out.println("Los grados Celsius equivalentes son: " + c + "ºC");
          System.out.println("Los centímetros equivalesntes son: " + cm + "cm");                  
    }

}
