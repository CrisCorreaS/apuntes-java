//Cristina Correa Segade
/*
A partir de la clase Ahorcado que te proporcionará el profesor, crea un programa que permita
al usuario jugar al ahorcado. Desconocemos los atributos de la clase Ahorcado ya que son privados,
pero sus métodos públicos son:
- Constructor(String txtAdivinar, String txtPista). Crea el juego con la frase a adivinar y con un texto de
pista para el jugador.
- Constructor(String txtAdivinar). Crea el juego con la frase a adivinar, sin pistas.
- boolean probarLetra (char x). Comprueba si la letra pasada como parámetro está en la frase a adivinar,
en caso afirmativo, devuelve true ̧ sino false.
- boolean adivinada(). Devuelve true si se ha adivinado la frase, false en caso contrario.
- boolean perdio(). Devuelve true si se ha llegado al número máximo de intentos sin adivinar la frase,
false en caso contrario.
- char leerLetra (). Pide al usuario por consola una letra y devuelve dicha letra.
- void pintar (). Dibuja un “tablero” en la consola, con el estado del juego.
*/

package ccst06;

import java.util.Scanner;


public class CCSt06e05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Creación del ahorcado
        Ahorcado juego = new Ahorcado("Volleyball","Deporte");
        
        //Inicialización de variables
        boolean perdio=false;
        boolean adivinada=false;
        boolean probarLetra=false;
        
        System.out.println("Vamos a empezar a jugar al ahorcado");
        
        //Comienzo del bucle do while
        do{       
            System.out.println("Escribe una letra");
            String input = teclado.nextLine();
            char letra = input.charAt(0);
                        
            probarLetra=juego.probarLetra(letra);
                    
            if(probarLetra){
                System.out.println("Has acertado, la "+letra+" está en la palabra");
            }
            else{
                System.out.println("Te has equivocado, la "+letra+" no está en la palabra");
            }
            
            if(juego.adivinada()){
                System.out.println("¡Has acertado!");
                adivinada=true;
            }
            
            if(juego.perdio()){
                System.out.println("Has perdido, lo siento mucho");
                perdio=true;
            }    
            
            if(!perdio || !adivinada){
                juego.pintar(); 
            }
                        
        }while(!perdio && !adivinada);
        
        
    }
    
}
