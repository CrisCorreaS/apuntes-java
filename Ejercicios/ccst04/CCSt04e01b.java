/*Cristina Correa Segade
Programa al que se le introduce una cadena por
teclado y dice si en la cadena aparece el carácter ‘x’.
*/
import java.util.Scanner;

public class CCSt04e01b {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena;
        int posicion;
        
        System.out.println("Introduce un texto: ");
        cadena = teclado.nextLine();
        posicion = cadena.indexOf('x');
        
        if(posicion != -1) {
            System.out.println("En el texto introducido aparece el carácter x");
        } 
        else {
            System.out.println("En el texto introducido no aparece el carácter x");
        }
    }
}
