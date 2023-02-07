package com.mycompany.ccs01;

import java.util.Scanner;

    public class CCSt01e11 {

       public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                //Definición de variables

                int cat1, cat2;
                //Entrada de datos
                 System.out.println("Introduce la longitud el primer cateto en cm: ");
                 cat1 = teclado.nextInt();
                
                 System.out.println("Introduce la longitud del segundo cateto en cm: ");
                 cat2 = teclado.nextInt(); 
                
                 
                 //calculos
                 double hipot, sumcat2;
                 
                 sumcat2= Math.pow(cat1, 2)+Math.pow(cat2, 2);
                 hipot= Math.sqrt(sumcat2);


          //Mostrar datos
          System.out.println("La hipotenusa es igual a: " + hipot + "cm");
    }

}
