/*Cristina Correa Segade
Programa al que se le introduce una cadena por
teclado y Decir si la cadena es igual a la cadena “hola”.
*/
import java.util.Scanner;

public class CCSt04e01g {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena1, cadena2;
        int comparacion;
       
        cadena1 = "hola";
        System.out.println("Introduce un texto cualquiera: ");
        cadena2 = teclado.nextLine();
        comparacion = cadena1.compareToIgnoreCase(cadena2);
        
        if(comparacion == 0) {
            System.out.println("El texto introducido es hola");
        } 
        else {
            System.out.println("El texto introducido no es hola");
        }
    }
}
