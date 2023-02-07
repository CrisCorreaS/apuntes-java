/*Cristina Correa Segade
Escribe un programa que solicite que se introduzca por teclado un nombre completo y una
edad y muestre el siguiente mensaje. Hacer una versión utilizando el método System.out.printf.
*/
import java.util.Scanner;

public class CCSt04e09b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nombre, numero;
        int edad;
        
        System.out.println("Introduce el nombre completo de una persona: ");
        nombre = teclado.nextLine();
    
        System.out.println("Introduce la edad de esa misma persona: ");
        numero = teclado.nextLine();
        edad = Integer.parseInt(numero);
        
        System.out.printf("Hola, me llamo " + nombre + " y tengo " + edad + " años");
    }
}

