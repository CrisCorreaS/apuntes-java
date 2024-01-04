/*
1.9. El siguiente programa pretende intercambiar dos variables enteras introducidas previamente, 
y luego mostrarlas por pantalla. Corrige los errores que encuentres en el código:

package ejercicios; 
import java.util.Scanner; 
public class Ejercicios { 
    public static void main(String[] args) { 
         
        int var1, var2; 
         
        System.out.print("Introduce var1: "); 
        var1 = teclado.nextInt(); 
        System.out.print("Introduce var2: "); 
        var2 = teclado.nextInt(); 
        var1 = var2; 
        var2 = var1; 
        System.out.println("Ahora var1 es igual a var1");     
        System.out.println("Ahora var2 es igual a var2"); 
  }} 
 
¿Sería posible intercambiar los valores de dos variables sin usar ninguna variable 
adicional? Piensa como hacerlo o busca en internet una solución.
 */
package com.mycompany.ccs01;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Definición de variables
        int variable1, variable2;
        
        //Entrada de datos
        System.out.println("Introduce la primera variable: ");
        variable1 = teclado.nextInt();

        System.out.println("Introduce la seguna variable: ");
        variable2 = teclado.nextInt();

        //calculos
        int auxiliar = variable1;

        variable1 = variable2;
        variable2 = auxiliar;

        //Si quiero hacerlo con solo una variable podría hacerlo así: media= (p1+p2+p3+p4)/4;
        //Mostrar datos
        System.out.println("Ahora la variable 1 es la variable 2: " + variable1);
        System.out.println("Y la variable 2 es la variable 1: " + variable2);
    }

}
