package com.mycompany.ccst02;
//Cristina Correa Segade
/*Para aprobar el curso se valorará la nota del examen, la valoración del trabajo en clase y la
nota de un trabajo práctico. Aprobarán los alumnos que estén en alguna de las siguientes
situaciones:
• Nota examen mayor o igual a 5
• Nota examen entre 4 y 5, trabajo en clase mayor que cinco y trab. práctico mayor que 5.
• Nota examen entre 4 y 5, y una nota mayor que 8 o en el trabajo práctico o en la valoración
del trabajo en clase.
Diseñar un algoritmo al que se le introduzcan por consola la nota del examen, la valoración del
trabajo en clase y la nota del trabajo práctico y saque por pantalla si está aprobado o no, todo en
con una sola sentencia condicional.
*/

import java.util.Scanner;

    public class CCSt02e03 {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                float notaexamen, notaclases, notapractico;
                 System.out.println("Introduce la nota del examen: ");
                 notaexamen = teclado.nextFloat();
                 
                 System.out.println("Intoduce la valoración del trabajo en clase: ");
                 notaclases = teclado.nextFloat();
                 
                 System.out.println("Introduce la nota del trabajo práctico: ");
                 notapractico = teclado.nextFloat();
                 
                
                if (notaexamen>=5) {
                    System.out.println("Aprobó la asignatura");
                }
                      
                else {
                    if (notaexamen<5 && notaexamen>4 && notaclases>5 && notapractico>5) {
                        System.out.println("Aprobó la asignatura");
                    }
                      
                    else {
                    
                        if (notaexamen<5 && notaexamen>4 && (notaclases>8 || notapractico>8)) {
                            System.out.println("Aprobó la asignatura");
                        }
                      
                        else {
                            System.out.println("Suspendió la asignatura");
                        }
                    }
                }
    }
}
