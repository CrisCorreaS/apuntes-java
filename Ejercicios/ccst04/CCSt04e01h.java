/*Cristina Correa Segade
Programa al que se le introduce una cadena por teclado y convierte 
la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
es un número, esto es, contiene solo dígitos decimales (del 0 a 9)
*/
import java.util.Scanner;

public class CCSt04e01h {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena;
        int numero;
        
        System.out.println("Introduce un texto cualquiera: ");
        cadena = teclado.nextLine();
        numero = Integer.parseInt(cadena);
        
        System.out.println(numero);
    }
}
