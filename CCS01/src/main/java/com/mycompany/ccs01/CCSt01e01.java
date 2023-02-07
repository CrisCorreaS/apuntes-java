package com.mycompany.ccs01;

import java.util.Scanner;

    public class CCSt01e01 {

       public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);

                double dol, eu;
                 System.out.println("Introduce los euros que quieras cambiar: ");
                 eu = teclado.nextDouble();
                 
                 dol= eu*1.14;


          System.out.println("Resultado: " + dol + " dólares");
    }

}
