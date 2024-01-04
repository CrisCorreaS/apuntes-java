/*Cristina Correa Segade
Realiza un programa que muestre una contraseña generada aleatoriamente teniendo
las siguientes limitaciones: Tendrá entre 5 y 10 posiciones que solo pueden 
ser letras entre la ‘a’ y la ‘j’.
*/
import java.util.Random;

public class CCSt04e04 {

    public static void main(String[] args) {
        Random r = new Random();
        
        String plantilla, cadena; 
        int longitudPalabra, i, posicion;
        char letra;
        
        plantilla= "abcdefghij";
        cadena = "";
        longitudPalabra= r.nextInt(5) + 5;

        for(i = 0; i < longitudPalabra; i++) {
            posicion = r.nextInt(8);
            letra = plantilla.charAt(posicion);
            cadena = cadena + letra;
        }
        
        System.out.println("La contraseña generada aleatoriamente es: " + cadena);
    }
}
