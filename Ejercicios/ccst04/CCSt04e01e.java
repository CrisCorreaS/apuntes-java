/*Cristina Correa Segade
Programa al que se le introduce una cadena por
teclado y crea una cadena formada por las 5 primeras posiciones de la cadena.
*/
import java.util.Scanner;

public class CCSt04e01e {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena, subcadena;
        
        System.out.println("Introduce un texto cualquiera: ");
        cadena = teclado.nextLine();
        subcadena = cadena.substring(0, 5);
        System.out.println(subcadena);
    }
}
