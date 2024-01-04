//Cristina Correa Segade
/*
Realiza un programa que tenga definido un Array como variable global llamado
temperaturaMeses, de 12 enteros, con las temperaturas medias de un lugar en cada uno de los
meses del año. Serán valores enteros negativos o positivos. El programa tendrá diferentes funciones
que realicen las siguientes tareas:
a) Llenar el Array con valores al azar para todos los meses (entre 0 y 40).
b) Mostrar por pantalla el contenido del Array.
c) Mostrar por pantalla el contenido del Array en orden inverso.
 */

package com.mycompany.ccst07;

import java.util.Random;


public class CCSt07ae01 {

    public static void main(String[] args) {
        // a)
        Random r = new Random();
        int temperaturaMeses[] = new int[12];
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = r.nextInt(41);
        }
        
        // b)
         System.out.println("La temperatura por orden es de: ");
        for (int temperatura:temperaturaMeses){
            System.out.println(temperatura);
        }   
        
        // c)
          System.out.println("La temperatura por orden inverso es de:");
        for (int i =  (temperaturaMeses.length)-1; i >=0 ; i--) {
             System.out.println(temperaturaMeses[i]);
        }
    }
}
