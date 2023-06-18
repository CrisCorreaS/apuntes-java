//Cristina Correa
/*
Se desea hacer la gestión de las habitaciones de un hotel. Todas las habitaciones tienen un
número de habitación y un proceso de check-in y check-out. En el hotel hay tres tipos de
habitaciones, aunque podría haber más en el futuro:

 3 habitaciones Lowcost (cuesta 50 euros/dia todo el año).
 10 habitaciones dobles. Tienen una tarifa normal de 100 euros/dia y un incremento
del 20% si el día de salida es abril, julio o agosto.
 5 habitaciones Suite. 200 euros/día con 20% de descuento para estancias de 10 o más
días.

• El programa inicialmente meterá las 18 habitaciones en un ArrayList y las marcará como “no
ocupadas”.
• El programa tendrá un menú para hacer check-in entre las habitaciones libres, check-out
entre las ocupadas y listar habitaciones libres y ocupadas.
• El check-in es común para todas las habitaciones, consiste en marcar la habitación como
ocupada. El check-out consiste en marcar la habitación como libre y calcular el importe a
pagar que se calculará en función del tipo de habitación y de los días de estancia (quizás sea
necesario almacenar la fecha de llegada en el momento del check-in)
Cuestión 1: ¿Habitacion debería ser una clase abstracta o una interfaz? ¿Por qué?
Cuestión 2: ¿Es útil que el método toString() en la clase Habitacion?
*/


package com.mycompany.ccst10;

import java.util.ArrayList;
import java.util.Scanner;


public class CCSt10e13 {

    public static ArrayList<Habitacion> habitaciones = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        float importe = 0;
        habitaciones.add(new HabitacionLowcost());
        habitaciones.add(new HabitacionLowcost());
        habitaciones.add(new HabitacionLowcost());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionDoble());
        habitaciones.add(new HabitacionSuite());
        habitaciones.add(new HabitacionSuite());
        habitaciones.add(new HabitacionSuite());
        habitaciones.add(new HabitacionSuite());
        habitaciones.add(new HabitacionSuite());

        do {
            int opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Elegiste la opción 1");
                    System.out.println("Selecciona el número de habitación: del 1 al 18");
                    int numero = Integer.parseInt(teclado.nextLine());
                    habitaciones.get(numero - 1).checkIn();
                }
                case 2 -> {
                    System.out.println("Elegiste la opción 2");
                    System.out.println("Selecciona el número de habitación: del 1 al 18");
                    int numero = Integer.parseInt(teclado.nextLine());
                    importe = habitaciones.get(numero - 1).checkOut();
                    System.out.println("El importe a pagar es: " + importe);
                }
                case 3 -> {
                    System.out.println("Elegiste la opción 3");
                    System.out.println("Las habitaciones son:");
                    for (int i = 0; i < habitaciones.size(); i++) {
                        System.out.println("Habitación " + (i + 1) + ": " + habitaciones.get(i));
                    }
                }
                case 0 -> salir = true;
                default -> System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opción:");
        System.out.println("1- Hacer check-in");
        System.out.println("2- Hacer check-out");
        System.out.println("3- Consultar estado de las habitaciones");
        System.out.println("0- Salir del programa");
        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }
}
