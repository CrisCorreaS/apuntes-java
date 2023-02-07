/*Cristina Correa Segade
Programa al que se le introduce una cadena por
teclado y dice si en la cadena aparece el carácter ‘x’ a 
partir de la cuarta posición.
*/
import java.util.Scanner;

public class CCSt04e01d {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena;
        int posicion;
        
        System.out.println("Introduce un texto cualquiera: ");
        cadena = teclado.nextLine();
        posicion = cadena.indexOf('x',4);
        
        if(posicion != -1) {
            System.out.println("En el texto introducido aparece el caracter x a partir de la cuarta posición");
        } 
        else {
            System.out.println("En el texto introducido no aparece el caracter x a partir de la cuarta posición");
        }
    }
}
