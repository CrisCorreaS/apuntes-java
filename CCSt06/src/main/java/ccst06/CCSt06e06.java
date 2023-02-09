//Cristina Correa Segade

//ESTÁ MAL
/*
A partir de las clases Nim y Consola, crea un programa que juegue al NIM contra la máquina.
Se trata de un tablero con 3 filas de palillos, con 3, 5 y 7 palillos respectivamente. Dos jugadores por
turnos alternos (el usuario y la máquina) han de retirar palillos del tablero perdiendo el que se quede
el último palillo. En cada turno se pueden retirar uno o más palillos, pero solo de una misma fila.
Por lo tanto, la estructura del programa será la siguiente: primero se crea el juego. Luego habrá un
bucle mientras no gane ninguno de los dos y, dentro del bucle, primero piensa la máquina, luego
hace su jugada, y se comprueba si ha ganado. Si no ha ganado, introduces los valores de tu jugada
(fila y cantidad de palillos) y juegas. Se comprueba si has ganado y así sucesivamente hasta que gane
uno de los dos.
Desconocemos los atributos de la clase Nim ya que son privados, pero sus métodos públicos son:
- Constructor () por defecto. Se crea una instancia del juego.
- boolean juega (int fila, int cant). Valida los datos y retira la cantidad de palillos indicada de la
fila indicada devolviendo true. Devuelve false si los parámetros no son válidos. Las filas van
de 0 a 2.
- boolean fin() devuelve true si se alcanzó el final del juego (un solo palillo en el tablero).
- int piensa (). Se invoca para que la máquina piensa su jugada y devuelve un entero cuyas
decenas son la fila (0,1,2) y las unidades son los palillos que retira (entre 1 y 7), pero no implica
que haga dicha jugada. Lo normal será llamar luego al método juega con los parámetros
obtenidos con piensa().
La clase Consola, tiene los siguientes métodos públicos estáticos:
- pintarTablero (Nim tablero). Se le pasa un tablero de Nim y lo pinta por consola.
- Int leerEntero(texto). Pide un valor por consola y valida que sea un entero de forma que si
mete letras o valores incorrectos no “casca” y vuelve a pedir que se introduzcan
correctamente. El texto que se pasa como parámetro es el que le dice al usuario lo que tiene
que introducir, así no hace falta meter antes un System.out.println. Ejemplo:
x=leerEntero(“introduzca fila”); hará internamente ya System.out.println (“introduzca fila”)
Hay que tener en cuenta que los usuarios hablamos de filas 1,2 y 3 mientras que la clase Nim habla
de filas 0,1 y 2.
Haz un programa que empiece siempre la máquina (ganará siempre) y, si quieres, haz otro en que
empieces tú, a ver si eres capaz de ganarle.
Por último, si no quieres, no es necesario usar el método leerEntero(), puedes usar la lectura de
teclado habitual: nextInt(), nextLine(), etc.
*/

package ccst06;

import java.util.Scanner;


public class CCSt06e06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Vamos a jugar al Nim");
        
        //Creación de los objetos
        Nim nim = new Nim();
        Consola consola = new Consola();
        
        //Inicialización de las variables
        boolean fin = false;
        
        //Bucle do while
        do{
            consola.pintarTablero(nim);
        
            int jugadaMaquina = nim.piensa();
            String unidadYDecimal = Integer.toString(jugadaMaquina);
            char unidad = unidadYDecimal.charAt(0);
            char decimal = unidadYDecimal.charAt(1);
            int fila = Character.getNumericValue(unidad);
            int cantidad = Character.getNumericValue(decimal);
        
            nim.juega(fila, cantidad);
        
            System.out.println("La máquina ya ha jugado");
            consola.pintarTablero(nim);
        
            System.out.println("Ahora es tu turno");
            
            System.out.println("Elige la fila del 1 al 3");
            int filaUsuario = teclado.nextInt();
            if(filaUsuario == 1){
                filaUsuario=0;
            }
            else{
                if(filaUsuario == 2){
                    filaUsuario=1;
                }
                else{
                    if(filaUsuario == 3){
                        filaUsuario=2;
                    }
                    else{
                        String filaUsarioString = Integer.toString(filaUsuario);
                        int comprobar = consola.leerEntero(filaUsarioString);
                        System.out.println("El valor introducido de la fila es incorrecto, pierdes el turno");
                    }
                }
            }
            
            System.out.println("Elige la cantidad que quieras sacar");
            int cantidadUsuario = teclado.nextInt();
            if(cantidadUsuario<=7&&cantidadUsuario>0){
                nim.juega(filaUsuario, cantidadUsuario);
            }
            else{
                System.out.println("Has perdido tu turno por haber introducido un valor incorrecto");
            }
            
            if(nim.fin()){
                System.out.println("El juego ha finalizado");
            }
        }while(!fin);
        
    }
    
}
