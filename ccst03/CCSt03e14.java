package com.mycompany.ccst03;
//Cristina Correa Segade
/*Diseñar un algoritmo que informe de los números perfectos que hay entre 1 y 10000. Un
número perfecto si es igual a la suma de todos los divisores menores que él.
*/
import java.util.Scanner;

    public class CCSt03e14 {
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                System.out.println("Los números perfectos que hay del 1 al 10000 son:");
                
                int num, sumaDivisores=0, divisores, perfecto;
               
                for(num=1; num<=10000; num++) {
                    sumaDivisores=0;
                    for (divisores=1; divisores<num; divisores++) {
                        if (num%divisores==0) {
                            sumaDivisores=sumaDivisores+divisores;
                        }
                    }  
                    if (num==sumaDivisores){
                        System.out.println(num);
                    } 
                   
                }
 
    }
}
