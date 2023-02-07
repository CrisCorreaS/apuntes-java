/*Cristina Correa Segade
Programa al que se le introduce una cadena por
teclado y convierte la cadena de entrada a una variable de tipo int,
suponiendo que dicha cadena es un número hexadecimal, esto es, contiene solo
dígitos decimales (del 0 a 9) y letras de la A a F.
*/
import java.util.Scanner;

public class CCSt04e01i {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena;
        int numero;
        
        System.out.println("Introduce un numero en hexadecimal: ");
        cadena = teclado.nextLine();
        numero = Integer.parseInt(cadena, 16);
     
        System.out.println(numero);
    }
}
