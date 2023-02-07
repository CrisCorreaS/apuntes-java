package com.mycompany.ccst03;
//Cristina Correa Segade
/*Programa al que le introduzcas un número y que garantice que es positivo, es decir si lo
introducimos menor o igual que cero nos obligará a volver a introducirlo las veces que sea necesario
hasta que se introduzca uno positivo.
*/
import java.util.Scanner;

    public class CCSt03e13 {
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
               int num;
               
               System.out.println("Introduce un número positivo");
               num=teclado.nextInt();
               
               while(num<=0) {
                   System.out.println("Este no es un número positivo, introduce un número positivo");
                   num=teclado.nextInt();
                       
               }
               
               if (num>0) {
                System.out.println("Este número es positivo");
               }
               
    }
}
