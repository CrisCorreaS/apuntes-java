/*Cristina Correa Segade
Realizar un programa en el que el usuario introduzca un texto y sustituya sus posiciones
impares por asteriscos, por ejemplo: “abcdefg” cambie las posiciones impares pasaría a: “a*c*e*g”
 */
import java.util.Scanner;

public class CCSt04e15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String cadena, resultado;
        int longitudTexto, i;
        char nueva;
        
        System.out.println("Introduce un texto: ");
        cadena = teclado.nextLine();
        longitudTexto = cadena.length();
        resultado = "";
        
        for(i = 0; i < longitudTexto; i++) {
            if(i % 2 == 0) {
                nueva = cadena.charAt(i);
            } 
            else {
                nueva = '*';
            }

            resultado += nueva;
        }

        System.out.println("El texto introducido ahora modificado es: " + resultado);
    }
}