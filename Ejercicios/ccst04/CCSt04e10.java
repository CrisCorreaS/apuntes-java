/*Cristina Correa Segade
Realizar un programa que solicite la entrada de 10 cadenas de caracteres y
construya una cadena con el primer carácter de cada cadena. Finalmente mostrará
dicha cadena por pantalla.
*/
import java.util.Scanner;

public class CCSt04e10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String resultado, cadena;
        int i;
        char letra;
        
        resultado = "";

        for(i = 0; i < 10; i++) {
            System.out.println("Introduce un texto: ");
            cadena = teclado.nextLine();
            letra = cadena.charAt(0);

            resultado += letra;
        }
        
        System.out.println("El texto resultante encriptado es: " + resultado); 
    }
}

