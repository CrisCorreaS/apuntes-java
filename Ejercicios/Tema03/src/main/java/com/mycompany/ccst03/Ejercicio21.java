package com.mycompany.ccst03;
//Cristina Correa Segade
/*
3.21. La serie de Fibonacci se compone a partir de números naturales, empezando por 0 y 1, y 
construyendo cada nuevo número de la serie como la suma de los dos anteriores elementos de la 
serie, así pues, el tercero sería 1 (es 0 +1), el siguiente 2 (1+1), luego 3 (2+1), luego 5 (3+2), 8 (5+3) y 
así sucesivamente. El siguiente programa pretende mostrar 12 primeros números de esta serie 
¿Funciona correctamente?  Es decir, muestra: 0,1,1,2,3,5,8,13,21,34,55,89. Si no es así, corrígelo. 
public class Ejercicios { 
    public static void main(String[] args) { 
 int ant=1, ant2=0, num;  
      for (int i=1; i<=12; i++){    
           num = ant + ant2;  
           System.out.println(num); 
           ant = num; ant2 = ant;   
      } 
    } 
} 
 */
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int fib1 = 0, fib2 = 1, fibAuxiliar = 0;

        for (int i = 1; i <= 12; i++) {
            if (i == 1) {
                System.out.print(fib1 + ", ");
            } else {
                if (i == 2) {
                    System.out.print(fib2 + ", ");
                } else {
                    System.out.print((fib1 + fib2) + ", ");
                    fibAuxiliar = fib2;
                    fib2 += fib1;
                    fib1 = fibAuxiliar;
                }
            }
        }
    }
}
