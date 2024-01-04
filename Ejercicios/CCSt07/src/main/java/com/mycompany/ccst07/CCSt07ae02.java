//Cristina Correa Segade
/*
Realiza un programa similar al anterior, con las siguientes tareas:
a. Llenar el Array con valores al azar para todos los meses (entre 0 y 40).
b. Mostrar la temperatura media del año.
c. Mostrar los meses en los que hizo más de 30 grados.
d. Decir si hay algún mes con más de 30 grados, recorriendo lo imprescindible del array, es
decir, en cuanto sepa que sí hay alguno, que pare de recorrer el array. Puedes usar break
o return.
e. Decir si hay algún mes con más de 30 grados, recorriendo lo imprescindible del array pero
ahora sin usar ni break ni return.
f. Decir si hay alguna temperatura repetida en dos o más meses.
 */

package com.mycompany.ccst07;

import java.util.Random;


public class CCSt07ae02 {

    public static void main(String[] args) {
        // a.
        Random r = new Random();
        int temperaturaMeses[] = new int[12];
        for (int i = 0; i < temperaturaMeses.length; i++) {
            temperaturaMeses[i] = r.nextInt(41);
        }
        
        // b.
        int suma = 0;
        for (int temperatura : temperaturaMeses) {
            suma += temperatura;
        }
        System.out.println("La temperatura media es = " + (suma / 12) + "ºC");

        // c. 
        System.out.println("Los meses de más de 30 grados fueron: ");
        int mes = 1;
        for (int temperatura : temperaturaMeses) {
            if (temperatura > 30) {
                System.out.println(mes);
            }
            mes++;
        }

        // d.   
        boolean mayor30 = false;
        for (int temperatura : temperaturaMeses) {
            if (temperatura > 30) {
                mayor30 = true;
                break;
            }
        }
        if (mayor30) {
            System.out.println("Hay algún mes con más de 30 grados");
        } else {
            System.out.println("No hay ningún mes con más de 30 grados");
        }
        
        // e. 
        mayor30 = false;
        int i = 0;
        do {
            if (temperaturaMeses[i] > 30) {
                mayor30 = true;
                break;
            }
            i++;
        } while (i < 12 && !mayor30);
        if (mayor30) {
            System.out.println("Hay algún mes con más de 30 grados");
        } else {
            System.out.println("No hay ningún mes con más de 30 grados");
        }

        // f. 
        boolean repetida = false;
        int cont = 0;

        do {
            //Aquí ponemos cont+1 porque así no se compara con sí mismo
            for (int j = cont + 1; j < temperaturaMeses.length; j++) {
                if (temperaturaMeses[j] == temperaturaMeses[cont]) {
                    repetida = true;
                    break;
                }
            }
            cont++;
        } while (cont < temperaturaMeses.length - 1 && !repetida);

        if (repetida) {
            System.out.println("Hay alguna temperatura repetida en dos o más meses");
        } else {
            System.out.println("No hay alguna temperatura repetida");
        }
    }
}
