//Cristina Correa Segade
/*
Realiza un juego de la ruleta rusa para dos jugadores. La pistola tiene 6 huecos en la recámara
pero solo una bala. Al empezar la partida se genera una posición al azar de la recámara para la bala
de forma que puede salir en el primer disparo, en el segundo, etc. hasta el sexto. Los jugadores irán
disparando sucesivamente hasta que uno de los dos se muera. Crea una clase Pistola con los
atributos y métodos que la definen.
*/

package ccst06;

import java.util.Scanner;


public class CCSt06e14 {
    
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Objeto
        Pistola pistola1 = new Pistola();
        
        //Variables
        char confirmacion;
        boolean salir = false;
        boolean ganaJugador1 = false;
        boolean ganaJugador2 = false;
        
        System.out.println("Bienvenida al juego de la ruleta rusa");
        
        //Bucle do while
        do{
            jugar(1);
            
            boolean pierdeJugador1 = pistola1.disparar();
            
            if(pierdeJugador1){
                salir = true;
                ganaJugador2 = true;
            } else {
                System.out.println("No ha salido ninguna bala de la recámara, sigue el juego");
                
                jugar(2);
                
                boolean pierdeJugador2 = pistola1.disparar();
                
                if(pierdeJugador2){
                    salir = true;
                    ganaJugador1 = true;
                } else {
                    System.out.println("No ha salido ninguna bala de la recámara, sigue el juego");
                }
            }
        
        } while (!salir);
        
        if(ganaJugador1){
            System.out.println("Ganó el jugador 1");
        } else {
            System.out.println("Ganó el jugador 2");
        }
        
    }
    
    //Método de inicio de juego
    public static void jugar(int numeroJugador){
        char confirmacion;
        
        do{
            System.out.println("Es el turno del jugador "+numeroJugador+": ¿Quieres disparar? Pulsa 'S' o 'N' para decir que si o no");
            confirmacion = teclado.next().charAt(0);
            
            if(confirmacion != 'N' && confirmacion != 'S'){
                System.out.println("Pulsa 'C' o 'S' para continuar o salir"); 
            }
        } while (confirmacion != 'C' && confirmacion != 'S');
    }
}
    
