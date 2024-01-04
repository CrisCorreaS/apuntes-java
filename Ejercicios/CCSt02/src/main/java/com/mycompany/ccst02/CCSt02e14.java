package com.mycompany.ccst02;
//Cristina Correa Segade
/*Diseña un algoritmo capaz de obtener la letra del DNI a partir del número de DNI. Consiste
en dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente
según la siguiente tabla (Hacer con switch, no empleando ni arrays ni String)
*/

import java.util.Scanner;

    public class CCSt02e14 {
        
        public static void main(String[] args) {
                Scanner teclado = new Scanner (System.in);
                
                int dni;
                 System.out.println("Introduce tu número de DNI: ");
                 dni = teclado.nextInt();
                 
                 int numero;
                 numero = dni%23;
                 
                switch (numero){
                    
                    case 0 -> System.out.println("Tu letra del DNI es la T");
                    case 1 -> System.out.println("Tu letra del DNI es la R");
                    case 2 -> System.out.println("Tu letra del DNI es la W");
                    case 3 -> System.out.println("Tu letra del DNI es la A");
                    case 4 -> System.out.println("Tu letra del DNI es la G");
                    case 5 -> System.out.println("Tu letra del DNI es la M"); 
                    case 6 -> System.out.println("Tu letra del DNI es la Y"); 
                    case 7 -> System.out.println("Tu letra del DNI es la F");
                    case 8 -> System.out.println("Tu letra del DNI es la P");
                    case 9 -> System.out.println("Tu letra del DNI es la D");
                    case 10 -> System.out.println("Tu letra del DNI es la X");
                    case 11 -> System.out.println("Tu letra del DNI es la B");
                    case 12 -> System.out.println("Tu letra del DNI es la N");
                    case 13 -> System.out.println("Tu letra del DNI es la J");
                    case 14 -> System.out.println("Tu letra del DNI es la Z");
                    case 15 -> System.out.println("Tu letra del DNI es la S");
                    case 16 -> System.out.println("Tu letra del DNI es la Q"); 
                    case 17 -> System.out.println("Tu letra del DNI es la V"); 
                    case 18 -> System.out.println("Tu letra del DNI es la H");
                    case 19 -> System.out.println("Tu letra del DNI es la L");
                    case 20 -> System.out.println("Tu letra del DNI es la C");
                    case 21 -> System.out.println("Tu letra del DNI es la K");
                    case 22 -> System.out.println("Tu letra del DNI es la E");
                    default -> System.out.println("No es válida ese número");
                }
    }
}
