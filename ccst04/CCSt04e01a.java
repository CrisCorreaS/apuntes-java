/*Cristina Correa Segade
Programa al que se le introduce una cadena por teclado y muestra por pantalla el
contenido de la cadena pasada a mayúsculas y minúsculas
*/
import java.util.Scanner;

public class CCSt04e01a {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        String cadena, mayus, minus;
        
        System.out.println("Introduce un texto cualquiera: ");
        cadena = teclado.nextLine();
        
        mayus = cadena.toUpperCase();
        System.out.println(mayus);
        minus = cadena.toLowerCase();
        System.out.println(minus);
        
    }
}
