/*Cristina Correa Segade
Diseña un algoritmo capaz de obtener la letra del NIF a partir del número de DNI. Consiste en
dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente
según la siguiente tabla. Almacena las letras del NIF en una cadena.
*/
import java.util.Scanner;

public class CCSt04e02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        String cadena;
        int dni, num;
        char letra;
        
        cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        System.out.println("Introduzca los números de su DNI: ");
        dni = teclado.nextInt();
        num = dni % 23;
        
        letra = cadena.charAt(num);
        System.out.println("La letra su DN es la letra " + letra);
    }
}
