/*Cristina Correa Segade
Programa al que se le introduce una cadena por
teclado y crea una cadena formada por las 5 primeras posiciones de la cadena.
*/
import java.util.Scanner;

public class CCSt04e01n {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        String cadena, inversa;
        int longitudPalabra, i;
        
        System.out.println("Introduce un texto: ");
        cadena = teclado.nextLine();
        inversa = "";
        longitudPalabra = cadena.length();
        
        for (i = longitudPalabra-1 ; i >= 0; i--) {
            inversa = inversa + cadena.charAt(i);
        }
        
        System.out.println("Este es el texto introducido: " + cadena);
        System.out.println("Este es el texto introducido inverso: " + inversa);
    }
}
