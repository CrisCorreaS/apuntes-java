/*Cristina Correa Segade
Programa al que se le introduce una cadena por
teclado y decir si la primera posición de la cadena es igual a la última.
*/
import java.util.Scanner;

public class CCSt04e01k {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena;
        int longitudPalabra;
        char letraInicio, letraFinal;
        
        cadena = teclado.nextLine();
        longitudPalabra = cadena.length();
        letraInicio = cadena.charAt(0);
        letraFinal = cadena.charAt(longitudPalabra - 1);
        
        if(Character.compare(letraInicio, letraFinal) == 0) {
            System.out.println("La primera y la última letra son iguales");
        } 
        
        else {
            System.out.println("La primera letra y la última no son iguales");
        }
    }
}
