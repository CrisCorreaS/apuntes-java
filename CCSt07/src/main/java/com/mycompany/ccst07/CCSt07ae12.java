//Cristina Correa Segade
/*
Realizar un programa llamado hipotenusa al que se le pasen como parámetros dos valores,
verifique que son enteros positivos y que suponiendo que son los catetos de un ángulo recto, calcule
el valor de la hipotenusa. (se refiere a introducirlos en la llamada al programa, java prog param1
param2, sería algo así: java hipotenusa 4 2.
Para asignar parámetros a programas en Netbeans, clicamos botón derecho sobre el proyecto y, en
Propiedades del Proyecto, en la sección Ejecutar: comprobamos que la entrada ’clase main’ contiene
el nombre del paquete+programa de este ejercicio en concreto, y en ’argumentos’ ponemos separados
por espacios en blanco los argumentos. Para ejecutar pulsamos F6, o bien Ejecutar proyecto, pero
no May+F6 (Ejecutar archivo actual) como sí podemos hacer en otros casos.
 */

package com.mycompany.ccst07;

import java.util.Scanner;


public class CCSt07ae12 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int cateto1 = 0;
        int cateto2 = 0;

        while (cateto1 <= 0 || cateto2 <= 0) {
            System.out.print("Escribe el valor del primer cateto: ");
            cateto1 = scanner.nextInt();

            System.out.print("Escribe el valor del segundo cateto: ");
            cateto2 = scanner.nextInt();

            if (cateto1 <= 0 || cateto2 <= 0) {
                System.out.println("Los catetos tienen que ser enteros positivos. Escríbelos otra vez");
            }
        }
        
        double hipotenusa = Hipotenusa.calcularHipotenusa(cateto1, cateto2);
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
