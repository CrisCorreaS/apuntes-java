//Cristina Correa Segade
/*
Diseña una clase llamada Ruleta y un programa que la use, con la siguiente funcionalidad.
- El jugador puede apostar lo que quiera a par o a impar .
- En cada juego obtiene un número al azar entre 0 y 36
- Si sale 0 pierde tanto par como impar, y en caso contrario si el jugador acierta (par o impar)
gana tanto como lo apostado.
Define los métodos necesarios para que los usuarios puedan apostar a par o impar. Hacer un
programa en el que un jugador lleve 10.000 euros y juegue 10.000 veces 1 euro cada vez siempre
apostando a par ¿Con cuánto dinero acaba? El resultado final puede ir entre 0 y 20.000 euros.
Ejecútalo varias veces.
*/

package ccst06;

import java.util.Random;


public class CCSt06e15 {

    public static void main(String[] args) {
        int dineroInicial = 10000;
        int dineroApuesta = 1;
        int numeroJuegos = 10000;
        int dineroActual = dineroInicial;
        int contadorFallos = 0;
        int contadorAciertos = 0;
        
        Ruleta ruleta = new Ruleta();
        Random random = new Random();
        
        for(int i = 0; i<numeroJuegos; i++){
            ruleta.girarRuleta();
            
            boolean elegirPar = random.nextBoolean();
            
            if((elegirPar && ruleta.jugarAPar()) || (!elegirPar && !ruleta.jugarAPar())){
                dineroActual += dineroApuesta;
                contadorAciertos ++;
            }
            else{
                dineroActual -= dineroApuesta;
                contadorFallos++;
            }
        }
        
        System.out.println("El dinero inicial era de " + dineroInicial + "€");
        System.out.println("El dinero final fue de " + dineroActual + "€");
        System.out.println("Ganamos: " + contadorAciertos + " veces");
        System.out.println("Perdimos: " + contadorFallos + " veces");
        
    }
    
}
