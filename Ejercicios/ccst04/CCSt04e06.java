/*Cristina Correa Segade
Realiza un programa al que se le introduzca un email y nos devuelva el nombre del dominio
es decir, lo que está entre la arroba y el punto (Ejemplo: info@mundo-r.com mostraría mundo-r ).
Opcionalmente, hacer una segunda versión que contemple que pueda haber varios puntos en el
dominio (Ejemplo: info@clientes.mundo-r.com mostraría clientes.mundo-r )
*/
import java.util.Scanner;

public class CCSt04e06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String cadena, dominio;
        int posicion1, posicion2;
        
        System.out.println("Introduce tu mail: ");
        cadena = teclado.nextLine();
        
        posicion1= cadena.indexOf('@');
        posicion2= cadena.indexOf('.');
        dominio = cadena.substring(posicion1+1, posicion2);
        
        System.out.println("El nombre del dominio de tu mail es: " + dominio);
    }
}
