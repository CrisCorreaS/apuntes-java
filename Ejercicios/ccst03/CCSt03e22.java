package com.mycompany.ccst03;
//Cristina Correa Segade
/*Hacer un programa que permita calcular el sueldo final de los vendedores de un
concesionario de coches. Para cada uno se introducirá: sueldo base, cantidad de horas extras
realizadas y cantidad de ventas. El sueldo final será el sueldo base más las horas extras (se pagan a
100€ la hora) y un plus en función de las ventas: entre 10 y 20 ventas 500€, entre 21 y 30 ventas 
1000€ y si supera las 30 ventas  1300 €. Después de tratar cada vendedor se preguntará al usuario
y hay más vendedores a tratar, finalizando el programa si contesta negativamente. Al final el
programa mostrará el total de ventas y el salario final del que más ventas ha realizado (supón que al
menos introducen los datos de un empleado).
 */
import java.util.Scanner;

public class CCSt03e22 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float sueldoBase, sueldoFinal, sueldoMax = 0;
        int totalVentas, maxVentas=0, horasExtra, plusVentas;
        
        System.out.println("Introduce el sueldo base del primer empleado del concesionario");
        sueldoBase = teclado.nextInt();
        
        while (sueldoBase != 0) {
            System.out.println("Introduce las ventas totales que he hecho el vendedor este mes");
            totalVentas = teclado.nextInt();
            System.out.println("Introduce las horas extra que ha hecho el vendedor");
            horasExtra = teclado.nextInt();
            
            if(totalVentas>=10 && totalVentas<=20){
                plusVentas=500;
            }
            else {
                if(totalVentas>=21 && totalVentas<=30){
                    plusVentas=1000;                    
                }
                else{
                    if(totalVentas>30){
                        plusVentas=1300;
                    }
                    else{
                        plusVentas=0;
                    }
                }
            }
            
            sueldoFinal = sueldoBase + plusVentas + 100*horasExtra;
            
            if (sueldoFinal>=sueldoMax) {
               sueldoMax=sueldoFinal;
               maxVentas=totalVentas;
            }
            
            System.out.println("Introduce el sueldo base del siguiente empleado del concesionario (0 para parar)");
            sueldoBase = teclado.nextInt();
        }
        
        System.out.println("El empleado con más ventas hizo un total de " + maxVentas + " ventas");
        System.out.println("El empleado con mayor sueldo final tuvo un sueldo de " + sueldoMax + " €");
    }
}
