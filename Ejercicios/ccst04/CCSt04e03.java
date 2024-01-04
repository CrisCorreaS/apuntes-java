/*Cristina Correa Segade
Realiza un programa que solicite que se le introduzcan una cadena y un carácter
y nos muestre cuantas veces está contenido el carácter en la cadena.
*/
import java.util.Scanner;

public class CCSt04e03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        String cadena;
        int longitudPalabra, cont=0, i;
        char letra, auxiliar;
        
        System.out.println("Introduce un texto: ");
        cadena = teclado.nextLine();
        longitudPalabra = cadena.length();
        System.out.println("Introduce la letra que quieras saber cuantas veces se repite en el anterior texto: ");
        letra = teclado.nextLine().charAt(0);

        for(i = 0; i < longitudPalabra; i++) {
            auxiliar = cadena.charAt(i);
            if((Character.compare(letra, auxiliar)) == 0) {
                cont++;
            }
        }

        System.out.println("La letra " + letra + " aparece un total de " + cont + " veces");
    }
}
