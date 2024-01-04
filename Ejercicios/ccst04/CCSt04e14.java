/*Cristina Correa Segade
Realizar un programa al que se le introduzca una cadena por teclado, que la 
convierta a StringBuilder, y aplicando métodos de esa clase, haga lo siguiente:
a. Borrar el carácter que haya en la posición 3.
b. Insertar una ‘x’ en la posición 5.
c. Sustituir el carácter de la posición 1 por una ‘z’.
d. Borrar los caracteres entre la posición 5 y 10.
e. Darles la vuelta a todos los caracteres del StringBuilder.
f. Convertir el StringBuilder en cadena.
 */
import java.util.Scanner; 

public class CCSt04e14 { 

    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in); 
        
        String cadena1;
        System.out.println("Introduce una cadena");
        cadena1 = teclado.nextLine();
        
        //a. Borrar el carácter que haya en la posición 3.
        
        StringBuilder cadenaA = new StringBuilder(cadena1);
        cadenaA.deleteCharAt(3);
        System.out.println("La cadena con el caracter borrado en la posicion 3 es: " + cadenaA);
        
        
        //b. Insertar una ‘x’ en la posición 5.
        
        StringBuilder cadenaB = new StringBuilder(cadena1);
        cadenaB.insert(5, 'x');
        System.out.println("La cadena con una 'x' en la posición 5 es: "+ cadenaB);
        
        
        //c. Sustituir el carácter de la posición 1 por una ‘z’.
        
        StringBuilder cadenaC = new StringBuilder(cadena1);
        cadenaC.setCharAt(1, 'z');
        System.out.println("La cadena en donde sustituimos el caracter de la posición 1 por una 'z' es: " + cadenaC);
        
        
        //d. Borrar los caracteres entre la posición 5 y 10.
        
        StringBuilder cadenaD = new StringBuilder(cadena1);
        cadenaD.delete(5, 10);
        System.out.println("La cadena en la que se borran los caracteres entre la posición 5 y 10 es: " + cadenaD);
        
        
        //e. Darles la vuelta a todos los caracteres del StringBuilder.
        
        StringBuilder cadenaE = new StringBuilder(cadena1);
        cadenaE.reverse();
        System.out.println("La cadena con todos los caracteres dados de vuelta es: " + cadenaE);
        
        
        //f. Convertir el StringBuilder en cadena.
        StringBuilder cadenaF = new StringBuilder(cadena1);
        cadenaF.toString();
        System.out.println("El StringBuilder convertido en cadena es: " + cadenaF);
    }
}