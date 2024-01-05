package com.mycompany.ccst04;

// Cristina Correa Segade

/*
4.2. 
Diseña un algoritmo capaz de obtener la letra del NIF a partir del número de DNI. Consiste en 
dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente 
según la siguiente tabla. Almacena las letras del NIF en una cadena. 
RESTO 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 
LETRA T R W A G M Y F P D  X  B  N  J  Z  S  Q  V  H  L  C  K  E 
 */
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni, num;
        char letra;
  
        System.out.println("Introduzca los números de su DNI: ");
        dni = teclado.nextInt();
        
        num = dni % 23;

        letra = cadena.charAt(num);
        System.out.println("La letra su DNI es la letra " + letra);
    }
}
