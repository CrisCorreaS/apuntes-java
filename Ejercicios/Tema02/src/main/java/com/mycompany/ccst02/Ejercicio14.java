package com.mycompany.ccst02;
//Cristina Correa Segade

/*
2.14. Diseña un algoritmo capaz de obtener la letra del DNI a partir del número de DNI. Consiste
en dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente
según la siguiente tabla (Hacer con switch, no empleando ni arrays ni String)

RESTO 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 
LETRA T R W A G M Y F P D  X  B  N  J  Z  S  Q  V  H  L  C  K  E
 */
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int dni, numero;

        System.out.println("Introduce tu número de DNI: ");
        dni = teclado.nextInt();

        numero = dni % 23;

        switch (numero) {
            case 0 ->
                System.out.println("Tu letra del DNI es la T");
            case 1 ->
                System.out.println("Tu letra del DNI es la R");
            case 2 ->
                System.out.println("Tu letra del DNI es la W");
            case 3 ->
                System.out.println("Tu letra del DNI es la A");
            case 4 ->
                System.out.println("Tu letra del DNI es la G");
            case 5 ->
                System.out.println("Tu letra del DNI es la M");
            case 6 ->
                System.out.println("Tu letra del DNI es la Y");
            case 7 ->
                System.out.println("Tu letra del DNI es la F");
            case 8 ->
                System.out.println("Tu letra del DNI es la P");
            case 9 ->
                System.out.println("Tu letra del DNI es la D");
            case 10 ->
                System.out.println("Tu letra del DNI es la X");
            case 11 ->
                System.out.println("Tu letra del DNI es la B");
            case 12 ->
                System.out.println("Tu letra del DNI es la N");
            case 13 ->
                System.out.println("Tu letra del DNI es la J");
            case 14 ->
                System.out.println("Tu letra del DNI es la Z");
            case 15 ->
                System.out.println("Tu letra del DNI es la S");
            case 16 ->
                System.out.println("Tu letra del DNI es la Q");
            case 17 ->
                System.out.println("Tu letra del DNI es la V");
            case 18 ->
                System.out.println("Tu letra del DNI es la H");
            case 19 ->
                System.out.println("Tu letra del DNI es la L");
            case 20 ->
                System.out.println("Tu letra del DNI es la C");
            case 21 ->
                System.out.println("Tu letra del DNI es la K");
            case 22 ->
                System.out.println("Tu letra del DNI es la E");
            default ->
                System.out.println("No es válida ese número");
        }
    }
}
