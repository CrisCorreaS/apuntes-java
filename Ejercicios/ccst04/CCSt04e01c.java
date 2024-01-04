/*Cristina Correa Segade
Programa al que se le introduce una cadena por
teclado y nos dice si la cadena tiene más de 10 posiciones.
*/
import java.util.Scanner;

public class CCSt04e01c {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena;
        int longitud;
        
        System.out.println("Introduce un texto cualquiera: ");
        cadena = teclado.nextLine();
        longitud = cadena.length();
        
        if(longitud > 10) {
            System.out.println("El texto tiene más de 10 posiciones");
        } 
        else {
            System.out.println("El texto no tiene más de 10 posiciones");
        }
    }
}
