package com.mycompany.ccst03;
//Cristina Correa Segade
/*Programa al que se le introduzcan 30 números y si la suma de los mismos es par nos muestre
los 3 primeros que introducimos, y si es impar nos muestre los tres últimos que introducimos. Hay
que garantizar que cada uno de dichos números está comprendido entre 0 y 1000.
 */
import java.util.Scanner;

public class CCSt03e31 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numTot = 30, num, num1 = 0, num2 = 0, num3 = 0, num28 = 0, num29 = 0, num30 = 0, suma = 0, numResto = numTot;

        for (int cont = 1; cont <= 30; cont++) {
            System.out.println("Introduce números que se irán sumando. Aún quedan " + numResto + " números");
            num = teclado.nextInt();

            if (num >= 0 && num<=1000) {
                numResto=numTot-cont;
                
                if (cont == 1) {
                    num1 = num;
                } 
                else {
                    if (cont == 2) {
                        num2 = num;
                    } 
                    else {
                        if (cont == 3) {
                            num3 = num;
                        } 
                        else {
                            if (cont == 28) {
                                num28 = num;
                            } 
                            else {
                                if (cont == 29) {
                                    num29 = num;
                                } 
                                else {
                                    if (cont == 30) {
                                        num30 = num;
                                    }
                                }
                            }
                        }
                    }
                }

                suma += num;
            }

            else{
                System.out.println("El número es inválido, tiene que ser entre 0 y 1000");
            }
        }
        
        if(suma%2==0){
            System.out.println("El resultado de la suma es " + suma + ". Los tres primeros números son: primero: " + num1 + ", segundo: " + num2 + " y tercero: " + num3);
        }
        else{
            System.out.println("El resultado de la suma es " + suma + ". Los tres últimos números son: último: " + num30 + ", penúltimo: " + num29 + " y antepenúltimo: " + num28);
        }
    }
}
