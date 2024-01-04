/*Cristina Correa Segade
Programa al que se le introduce una cadena por
teclado y si se encuentra con en su interior con “prueva” sustituir por “prueba”.
*/
import java.util.Scanner;

public class CCSt04e01j {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena;
        
        System.out.println("Introduce un texto: ");
        cadena = teclado.nextLine();
        cadena = cadena.replace("prueva", "prueba");
        
        System.out.println(cadena);
    }
}
