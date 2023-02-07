package com.mycompany.ccs01;

import java.util.Scanner;

    public class CCSt01e08 {

       public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                //Definición de variables

                int p1, p2, p3, p4;
                //Entrada de datos
                 System.out.println("Introduce la edad de la primera persona: ");
                 p1 = teclado.nextInt();
                
                 System.out.println("Introduce la edad de la segunda persona: ");
                 p2 = teclado.nextInt(); 
                
                 System.out.println("Introduce la edad de la tercera persona: ");
                 p3= teclado.nextInt();
                 
                 System.out.println("Introduce la edad de la cuarta persona: ");
                 p4 = teclado.nextInt();
                 
                 
                 //calculos
                 double media, edtot;
                 
                 edtot= p1+p2+p3+p4;
                 media= edtot/4;
                 
                 //Si quiero hacerlo más simple podría hacerlo así: media= (p1+p2+p3+p4)/4;
                 //Si quiero hacerlo con solo dos variables


          //Mostrar datos
          System.out.println("La edad media de las cuatro personas son: " + media + " años");
    }

}
