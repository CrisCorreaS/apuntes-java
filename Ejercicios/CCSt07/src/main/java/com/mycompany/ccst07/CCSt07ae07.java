//Cristina Correa Segade
/*
Realizar una clase llamada Parking2 que gestione los coches aparcados en un parking
mediante un Array, que almacene las matrículas y la hora de entrada en el parking. El parking es un
poco raro, mide solo 3 metros de ancho y caben 20 coches, pero uno detrás de otro por lo que el
último en entrar debe ser el primero en salir (esta estructura se llama pila LIFO – Last Input, First
Output). Cada minuto en el parking cuesta 2 céntimos (máx 10 euros). La clase debe tener métodos
siguientes:
• Mostrar el estado del parking, esto es las matrículas/hora de entrada de las plazas
ocupadas.
• Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno.
La plaza del fondo es la número 1 y la que está más cerca de la entrada es la 20.
• Desaparcar: (¿hace falta pasarle algún parámetro?). Al desaparcar se calcula el importe a
pagar según los segundos de estancia. Devuelve la matrícula del coche y el importe a
pagar. Si es parking está vacío devuelve cadena vacía y cero euros.
• Mostrar lo recaudado hasta ese momento.
Hacer un programa con un menú que permita al usuario usar los métodos creados. No hay que
introducir a mano los valores de hora de entrada y salida en el parking, se harán por el reloj del
sistema.
 */

package com.mycompany.ccst07;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class CCSt07ae07 {

    private static Parking2 parking;
    private static Scanner teclado;
    
    public static void main(String[] args) {
        parking = new Parking2();
        teclado = new Scanner(System.in);
        boolean salir = false;
        char opcion;

        do {
            System.out.println("\n\n----Gestión Parking----");
            System.out.println(
                                "a)Mostrar parking\n "
                                + "b)Aparcar\n "
                                + "c)Desaparcar\n "
                                + "d)Total recaudado\n "
                                + "e)Salir");
            opcion = teclado.next().charAt(0);

            switch(opcion) {
                case 'a' -> mostrarParking();
                case 'b' -> aparcar();
                case 'c' -> desaparcar();
                case 'd' -> totalRecaudado();
                case 'e' -> salir = true;
                default -> System.out.println("Opción inválida");
            }
        } while (!salir);
    }

    private static void mostrarParking() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm:ss");
        Coche[] arr = parking.mostrarParking();
        System.out.println("Estado del parking");

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + " :: " + arr[i].matricula + " :: " + formato.format(arr[i].horaLlegada));
        }
    }

    private static void aparcar() {
        System.out.println("Introduce la matrícula: ");
        String matricula = teclado.next();
        int resultado = parking.aparcar(matricula);

        if (resultado == 0) {
            System.out.println("El parking está lleno");
        } else {
            System.out.println("Coche aparcado en la plaza: " + resultado);
        }
    }

    private static void desaparcar() {
        Coche coche = parking.desaparcar();

        if (coche == null) {
            System.out.println("El parking está vacío");
        } else {
            System.out.println("Coche " + coche.matricula + " desaparcado. Importe a pagar: " + coche.importePagar + " euros");
        }
    }

    private static void totalRecaudado() {
        System.out.printf("Total recaudado: %.2f euros\n", parking.totalRecaudado());
    }
}
