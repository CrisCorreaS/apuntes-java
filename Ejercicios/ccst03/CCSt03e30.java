package com.mycompany.ccst03;
//Cristina Correa Segade
/*Modificar el programa anterior para que si un cliente introduce un número negativo o mayor
que 10 le informe de su error y le obligue a meter correctamente las entradas que desea, las veces
que sea necesario hasta que lo haga bien.
 */
import java.util.Scanner;

public class CCSt03e30 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int entradas, compra, maximo = 0;
        System.out.println("Introduce el número total de entradas que se pondrán a la venta");
        entradas = teclado.nextInt();
        
            while (entradas > 0) {
                System.out.println("Quedan " + entradas + " entradas");
                System.out.println("¿Cuántas entradas vas a comprar?");
                compra = teclado.nextInt();
            
                while(compra<0 && compra>10){
                    System.out.println("Has introducido un valor incorrecto, por favor vuelve a introducir otro valor. Recuerda que solo puedes comprar entre 0 y 10 entradas");
                    compra = teclado.nextInt();
                }
                
                System.out.println("Vas a comprar: " + compra + " entradas");

                if (entradas >= compra) {
                    entradas -= compra;
                } 
                
                else {
                    System.out.println("Solo quedan " + entradas + " entradas a la venta");
                }
            
                if (maximo < compra) {
                    maximo = compra;
                }
            }
        System.out.println("Se han agotado la entradas");
        System.out.println("La persona que más etradas ha comprado, compró: " + maximo + " entradas");

    }
}