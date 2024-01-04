/*Cristina Correa Segade
Programa al que se le introduce una cadena por
teclado y decir cuántos dígitos numéricos hay en la cadena.
*/
import java.util.Scanner;

public class CCSt04e01l {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena;
        int longitudPalabra, digitos=0, i;
        char letra;
        
        System.out.println("Introduce un texto: ");
        cadena = teclado.nextLine();
        longitudPalabra = cadena.length();
        
        for(i=longitudPalabra-1 ; i >= 0; i--) {

         letra=cadena.charAt(i);
            if(Character.isDigit(letra)) {
                digitos++;
            }
        }
    
        System.out.println("El número total de digitos introducidos es igual a " + digitos);
        
    }
}
