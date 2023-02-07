package com.mycompany.ccs01;

import java.util.Scanner;

    public class CCSt01e02 {

       public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);

                double dol, eu;
                 System.out.println("Introduce los dólares que quieras cambiar: ");
                 dol = teclado.nextDouble();
                 
                 eu = dol/1.14;


          System.out.println("Resultado: " + eu + " euros");
    }

}
