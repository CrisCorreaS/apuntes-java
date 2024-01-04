package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.5. Sumar una cantidad de números que se van introduciendo, siempre que sean positivos hasta 
que se teclee el -1. 
Para sumar valores e ir acumulando esa suma se suele emplear una estructura 
con la siguiente forma. Antes del bucle: acumulador = 0. Y dentro del bucle 
acumulador = acumulador + nuevo valor.
 */
import java.util.Scanner;

public class Ejercicio05b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0, suma = 0;

        while (numero != -1) { //Esta condición introduce el stopper, si el stopper fuera 999, solo tendríamos que poner (numero!=999)
            System.out.println("Introduce un número positivo");
            numero = teclado.nextInt();
            
            if (numero > -1) { //Esta condición introduce el criterio a la hora de usar el número o no en la suma.
                suma += numero;
            }
        }

        System.out.println("La suma total de estos números es: " + suma);
    }
}
/*
Lo he hecho interpretando que querían saber el resultado total una única vez.
Si el stopper fuera 999, pero la condición siguiera siendo (numero>-1), el stopper se sumaría pero acabaría la suma. Los números negativos seguirían siendo evitados.
Como el stopper es -1, no se cuenta para la suma y finaliza la suma.
*/
