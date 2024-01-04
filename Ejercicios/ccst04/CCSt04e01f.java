/*Cristina Correa Segade
Programa al que se le introduce una cadena por
teclado y crea una cadena formada por las 5 ultimas posiciones de la cadena.
*/
import java.util.Scanner;

public class CCSt04e01f {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena, subcadena;
        int i;
        
        System.out.println("Introduce un texto cualquiera: ");
        cadena = teclado.nextLine();
        i = cadena.length();
        i=i-5;
        subcadena = cadena.substring(i);
        System.out.println(subcadena);
    }
}
