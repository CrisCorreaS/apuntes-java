package com.mycompany.ccs01;

import java.util.Scanner;

    public class CCSt01e04 {

       public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                //Definición de variables

                int f, c, b, a;
                //Entrada de datos
                 System.out.println("Introduce el número de suspensos: ");
                 f = teclado.nextInt();
                 
                 System.out.println("Introduce el número de suficientes: ");
                 c = teclado.nextInt();
                 
                 System.out.println("Introduce el número de notables: ");
                 b = teclado.nextInt();
                 
                 System.out.println("Introduce el número de sobresalientes: ");
                 a = teclado.nextInt();
                 
                 //calculos
                 int total;
                 float superado, excelente;
                 
                 total=f+c+b+a;
                 superado=(((float)a+b+c)/total)*100;
                 excelente=(((float)b+a)/total)*100;

          //Mostrar datos
          System.out.println("El porcentaje total de alumnos que han superado la asignatura es del: " + superado + "%");
          System.out.println("El porcentaje de notables y sobresalientes de la asignatura es del: " + excelente + "%");                  
    }

}
