/*Cristina Correa Segade
Escribe un programa que solicite que se introduzca por teclado un nombre completo y una
edad y muestre el siguiente mensaje. Hacer una versión utilizando la clase Format.
*/
import java.util.Scanner;

public class CCSt04e09a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nombre, numero, resultado;
        int edad;
        
        System.out.println("Introduce el nombre completo de una persona: ");
        nombre = teclado.nextLine();
    
        System.out.println("Introduce la edad de esa misma persona: ");
        numero = teclado.nextLine();
        edad = Integer.parseInt(numero);
        
        resultado = String.format("Hola, me llamo %s y tengo %d años", nombre, edad);
        System.out.println(resultado);
    }
}

