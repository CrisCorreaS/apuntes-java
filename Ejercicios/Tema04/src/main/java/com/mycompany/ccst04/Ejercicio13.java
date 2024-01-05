package com.mycompany.ccst04;

// Cristina Correa Segade

/*
4.13. (Opcional) Realizar un programa al que se le introduzca un número decimal y lo convierta a 
un String con su representación hexadecimal. Hay que hacerlo codificando el proceso sin usar las 
clases de Java y luego compararlo con el resultado ofrecido por las clases de Java para convertir de 
decimal a hexadecimal. 
Para convertir a hexadecimal hay que hacer divisiones sucesivas entre 16 de los cocientes 
obtenidos hasta que el cociente sea cero. El número será la concatenación de restos, 
convirtiendo los mayores de 9 a la letra correspondiente: 10-> A, 11->B…15->F 
 */
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        int numDecimal = teclado.nextInt();

        String resultadoHexadecimal = convertirHexadecimal(numDecimal);

        System.out.println("Resultado (sin usar clases de Java): " + resultadoHexadecimal);

        String resultadoClasesJava = Integer.toHexString(numDecimal).toUpperCase();
        System.out.println("Resultado usando clases de Java: " + resultadoClasesJava);

        if (resultadoHexadecimal.equals(resultadoClasesJava)) {
            System.out.println("¡Los resultados son iguales!");
        } else {
            System.out.println("¡Los resultados no son iguales!");
        }
    }

    public static String convertirHexadecimal(int numDecimal) {
        if (numDecimal == 0) {
            return "0";
        }

        StringBuilder hexadecimal = new StringBuilder();

        while (numDecimal > 0) {
            int resto = numDecimal % 16;

            if (resto < 10) {
                hexadecimal.insert(0, resto);
            } else {
                hexadecimal.insert(0, (char) ('A' + resto - 10)); // (char) ('A' + resto - 10) devuelve una de las 6 letras (A, B, C, D, E, F)
            }

            numDecimal /= 16;
        }

        return hexadecimal.toString();
    }
}
