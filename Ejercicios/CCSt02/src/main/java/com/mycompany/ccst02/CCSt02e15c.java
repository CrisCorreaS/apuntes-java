package com.mycompany.ccst02;
//Cristina Correa Segade

import java.util.Scanner;

    public class CCSt02e15c {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int a, b;
                 System.out.println("Introduce el primer número entero a: ");
                 a = teclado.nextInt();
                 
                 System.out.println("Introduce el segundo número entero b: ");
                 b = teclado.nextInt();
                
                if (b != 0 & a / b == 0) {
                    float r;
                    r = a / (float)b;
                    System.out.println(r);
            
                }
    }
}
/*Para hacer que funcione tendríamos que definir la variable r.
Si introduzco b igual a 0, aparece un error error.
Da ese resultado porque estamos no usando cortocircuito y debido a que aunque lee la primera condición de b!=0 pero intenta también cumplir la segunda, 
y da un error porque hace la operación cuando b es igual a 0.
*/