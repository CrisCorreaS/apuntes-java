package com.mycompany.ccst04;

// Cristina Correa Segade

/*
4.11. Describe que realiza el código siguiente e indica si contiene algún error. 
        java.util.Scanner teclado = new java.util.Scanner(System.in); 
        System.out.println("Introduce una cadena:"); 
        String cadena = teclado.nextLine();  
        StringBuilder cadenaSB = new StringBuilder(cadena); 
        int pos; 
        do { 
            pos = cadenaSB.indexOf(" "); 
            if (pos!=-1) cadenaSB.deleteCharAt(pos);  
        } while (pos != -1); 
        System.out.println(cadenaSB); 
 */
import java.util.Scanner; //Aquí faltaba ponerle en import

public class Ejercicio11 { //Faltaba también esta línea

    public static void main(String[] args) { //Faltaba también esta línea
        Scanner teclado = new Scanner(System.in); //Faltaba también esta línea

        System.out.println("Introduce una cadena:");//Pedimos por teclado una cadena
        String cadena = teclado.nextLine();//Le damos el valor introducido al String cadena
        
        StringBuilder cadenaSB = new StringBuilder(cadena);//Se crea una variable de clase StringBuilder que es igual a la cadena y ahora se puede modificar
        
        int pos;//Creamos la variable pos
        
        do { //Por lo menos una vez se entra a este bucle
            pos = cadenaSB.indexOf(" ");//Se establece que pos es un espacio dentro de la cadena
        
            if (pos != -1) {//Si se encuentra algún espacio en la cadena
                cadenaSB.deleteCharAt(pos);//Se borra un espacio de la cadena detectado
            }
        } while (pos != -1);//El bucle se repite mientras haya almenos un espacio
        
        System.out.println(cadenaSB);//Pegamos la cadena
    }
}
//Este código quita todos los espacios del texto de la cadena
