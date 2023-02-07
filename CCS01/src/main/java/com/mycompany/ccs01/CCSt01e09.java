package com.mycompany.ccs01;

import java.util.Scanner;

    public class CCSt01e09 {

       public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                //Definición de variables

                int var1, var2;
                //Entrada de datos
                 System.out.println("Introduce var1: ");
                 var1 = teclado.nextInt();
                
                 System.out.println("Introduce var2: ");
                 var2 = teclado.nextInt(); 
                 
                 
                 //calculos
                 int aux=var1;
                 
                 var1=var2;
                 var2=aux;
                 
                 //Si quiero hacerlo con solo una variable podría hacerlo así: media= (p1+p2+p3+p4)/4;


          //Mostrar datos
          System.out.println("Ahora var1 es var2: " + var1);
          System.out.println("Ahora var2 es var1: " + var2);
    }

}
