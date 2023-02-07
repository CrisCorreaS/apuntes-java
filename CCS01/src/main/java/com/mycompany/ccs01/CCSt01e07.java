package com.mycompany.ccs01;

import java.util.Scanner;

    public class CCSt01e07 {

       public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                //Definición de variables

                float kmtot, kmnow, lgaspast, lgasnow;
                //Entrada de datos
                 System.out.println("Introduce el kilometraje de la última vez que se repostó: ");
                 kmtot = teclado.nextFloat();
                
                 System.out.println("Introduce el kilometraje actual: ");
                 kmnow = teclado.nextFloat(); 
                
                 System.out.println("Introduce los litros de gasolina que tenías al finalizar la última vez que repostaste: ");
                 lgaspast= teclado.nextFloat();
                 
                 System.out.println("Introduce la cantidad de gasolina actual: ");
                 lgasnow = teclado.nextFloat();
                 
                 
                 //calculos
                 double tot, kms, lgs;
                 
                 kms=kmnow-kmtot;
                 lgs=lgaspast-lgasnow;
                 tot=lgs*100/kms;
                


          //Mostrar datos
          System.out.println("El total del consumo medio del coche es: " + tot + " litros por kilómetro"); 
    }

}
