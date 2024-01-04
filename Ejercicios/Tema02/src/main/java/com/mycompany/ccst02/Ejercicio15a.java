package com.mycompany.ccst02;
//Cristina Correa Segade

/*
2.15. Haz 3 versiones de un mismo programa, que pida que se introduzcan por teclado 2 números 
int sobre sendas variables llamadas ‘a’ y ‘b’ y que incluyan las instrucciones que se muestran abajo. 
Para cada una de las versiones, ejecútalo varias veces, introduciendo cero para alguno de los valores 
y finalmente explica la diferencia de comportamiento entre cada una de las versiones: 
• Versión a)  if (b !=0 && a/b==0) {r = a/b; System.out.println(r);}  
• Versión b) if (a/b==0 && b !=0) {r = a/b; System.out.println(r);} 
• Versión c) if (b !=0 & a/b==0) {r = a/b; System.out.println(r);} 
Puede ser el mismo código con las tres sentencias junta, teniendo una sola vigente y las otras 
dos como comentarios. Comentando unas y descomentando otra vas probando c
 */

import java.util.Scanner;

public class Ejercicio15a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b;
        
        System.out.println("Introduce el primer número entero a: ");
        a = teclado.nextInt();

        System.out.println("Introduce el segundo número entero b: ");
        b = teclado.nextInt();

        if (b != 0 && a / b == 0) {
            r = a / b;
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
