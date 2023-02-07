package com.mycompany.ccs01;

import java.util.Scanner;

    public class CCSt01e10 {

       public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                //Definición de variables

                int x, y;
                //Entrada de datos
                 System.out.println("Introduce la coordenada x: ");
                 x = teclado.nextInt();
                
                 System.out.println("Introduce la coordenada y: ");
                 y = teclado.nextInt(); 
                 
                 
                 //calculos
                 double area1, area2;
                 
                 area1=x*y;
                 area2= Math.abs(area1);


          //Mostrar datos
          System.out.println("El área del rectángulo es: " + area2);
    }

}
