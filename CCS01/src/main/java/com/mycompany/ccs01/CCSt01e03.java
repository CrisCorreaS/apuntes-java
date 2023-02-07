package com.mycompany.ccs01;

import java.util.Scanner;

    public class CCSt01e03 {

       public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);

                int num1, num2;
                 System.out.println("Introduce el primer número entero: ");
                 num1 = teclado.nextInt();
                 
                 System.out.println("Introduce el segundo número entero: ");
                 num2 = teclado.nextInt();
                 
                 int su, res, mu;
                 float di;
                 
                 su=num1+num2;
                 res=num1-num2;
                 mu=num1*num2;
                 di=num1/(float)num2;


          System.out.println("Resultado de la suma: " + su);
          System.out.println("Resultado de la resta: " + res);          
          System.out.println("Resultado de la multiplicación: " + mu);          
          System.out.println("Resultado de la división: " + di);          
    }

}
