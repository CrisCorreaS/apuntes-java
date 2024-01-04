package com.mycompany.ccst02;
//Cristina Correa Segade

import java.util.Scanner;

    public class CCSt02e15b {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int a, b;
                 System.out.println("Introduce el primer número entero a: ");
                 a = teclado.nextInt();
                 
                 System.out.println("Introduce el segundo número entero b: ");
                 b = teclado.nextInt();
                
                if (a / b == 0 && b != 0) {
                    float r;
                    r = a / (float)b;
                    System.out.println(r);
            }
    }
}
/*Para hacer que funcione tendríamos que definir la variable r.
Si introduzco b igual a 0, aparece un error error.
Da ese resultado porque estamos usando cortocircuito y debido a que lee de izquierda a derecha, 
cuando ve la b siendo 0, primero hace la operación, da error y ya no ve que no se podía usar la b!=0.
*/