package com.mycompany.ccst03;
//Cristina Correa Segade
/*Hacer cuatro programas que pinten 9 lí­neas según los siguientes gráficos:
a.)        b.) c.)      d.)
0000000000 1 1111111111 9
1111111111 22 222222222 98
2222222222 333 33333333 987
3333333333 4444 4444444 9876
 */
import java.util.Scanner;

public class CCSt03e26 {

    public static void main(String[] args) {
        
        /* 
        Programa a.)
        
        for(int i=0;i<=9;i++){
            for(int j=1;j<=10;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
*/
       /*Programa b.)
        
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
*/
       /*Programa c.)
       
       for(int i=1;i<10;i++){
           for(int j=1;j<12-i;j++){
               System.out.print(i);
           }
           System.out.println("");
       }
*/
       //Programa d.)
       
       for(int i=1;i<=9;i++){
           for(int j=1;j<=i;j++){
               System.out.print(10-j);
           }
           System.out.println("");
       }
    }
}