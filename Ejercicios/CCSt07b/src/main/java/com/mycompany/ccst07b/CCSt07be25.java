//Cristina
/*
Realizar una clase llamada Parking3 que gestione los coches aparcados en un parking
mediante un ArrayList, que almacene las matrículas y la hora de entrada en el parking. El parking es
un poco raro, mide solo 3 metros de ancho y caben 20 coches, pero uno detrás de otro por lo que el
último en entrar debe ser el primero en salir (esta estructura se llama pila LIFO – Last Input, First
Output). Cada minuto en el parking cuesta 2 céntimos (máx 10 euros). La clase debe tener métodos
siguientes:
• Mostrar el estado del parking, esto es las matrículas/hora de entrada de las plazas
ocupadas.
• Aparcar: se le pasará el número de matrícula. Devuelve número de plaza o cero si lleno.
La plaza del fondo es la número 1 y la que está más cerca de la entrada es la 20.
• Desaparcar: (¿hace falta pasarle algún parámetro?). Al desaparcar se calcula el importe a
pagar según los segundos de estancia. Devuelve el importe a pagar. Si es parking está
vacío devuelve -1.
• Mostrar lo recaudado hasta ese momento.
Hacer un programa con un menú que permita al usuario usar los métodos creados. No hay que
introducir a mano los valores de hora de entrada y salida en el parking, se harán por el reloj del
sistema.
 */
package com.mycompany.ccst07b;

import java.util.Scanner;


public class CCSt07be25 {

    private static Parking3 parking;
    private static Scanner teclado;
        
    public static void main(String[] args) {
  
        parking = new Parking3();
        boolean salir = false;
        char opcion;
        teclado = new Scanner(System.in);

        do {
            System.out.println("----Gestión Parking----");
            System.out.println(
                                "a) Mostrar parking\n"
                                + "b) Aparcar\n"
                                + "c) Desaparcar\n"
                                + "d) Total recaudado\n"
                                + "e) Salir"
                               );
            opcion = teclado.next().charAt(0);

            switch (opcion) {
                case 'a' -> parking.mostrarParking();
                case 'b' -> aparcar();
                case 'c' -> desaparcar();
                case 'd' -> totalRecaudado();
                case 'e' -> salir = true;
                default -> System.out.println("Opción inválida");
            }
        } while (!salir);
    }

    private static void aparcar() {
        System.out.println("Introduce la matrícula: ");
        String mat = teclado.next();
        teclado.nextLine(); 
        int res = parking.aparcar(mat);
        if (res == 0) {
            System.out.println("El parking está lleno");
        } else {
            System.out.println("El coche está aparcado en la plaza: " + res);
        }
    }

    private static void desaparcar() {
        double importe = parking.desaparcar();
        if (importe == -1) {
            System.out.println("El parking está vacío");
        } else {
            System.out.println("El coche está desaparcado. El importe a pagar es de: " + importe + "€");
        }
    }

    private static void totalRecaudado() {
        System.out.printf("%.2f euros recaudados\n", parking.totalRecaudado());
    }
}
