package com.mycompany.ccst02;
//Cristina Correa Segade

import java.util.Scanner;

    public class CCSt02e15a {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int a, b;
                 System.out.println("Introduce el primer número entero a: ");
                 a = teclado.nextInt();
                 
                 System.out.println("Introduce el segundo número entero b: ");
                 b = teclado.nextInt();
                
                if (b != 0 && a / b == 0) {
                    r = a /b;
                    System.out.println(r);
            }
    }
}
/*Para hacer que funcione tendríamos que definir la variable r.
Si introduzco b igual a 0, no me aparece nada, solo un BUILD SUCCESS en verde pero no da ningún error.
Da ese resultado porque estamos usando cortocircuito y gracias a eso, cuando ve la b siendo 0, ya no continúa,
eso significa que ya no hace la operación y no da un error.
Ahora está el error porque no está definida la r
*/