//Cristina Correa Segade
/*
Un profesor ha desarrollado un examen tipo test de 20 preguntas y cada una de ellas tiene
cuatro opciones: a), b), c) ó d), siendo solo una de ellas la correcta. Cada pregunta correcta suma 0.5
puntos y cada una incorrecta resta 0.2 puntos, no pudiendo llevar un alumno ninguna nota inferior
a cero. Desarrolla una clase llamada Examen que almacene las respuestas correctas de las 20
preguntas. La clase debe disponer de algún mecanismo mediante el que se le pase las respuestas de
un alumno para las 20 preguntas (a,b,c,d o bien z, siendo respuesta en blanco) y nos informe de la
puntuación en el examen. Hacer un programa que permita primero informar de las respuestas
correctas a un examen y después introducir las respuestas de los alumnos, mostrándonos la nota
obtenida por los mismos.

//Estaría bien también utilizar una enum aquí, pero aún no lo habíamos dado
*/

package ccst06;

import java.util.Scanner;


public class CCSt06e16 {
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        Examen examen = new Examen();
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1 -> {
                    for (int i = 1; i <= 20; i++) {
                        System.out.println("Introduce la respuesta de la pregunta " + i + ": ");
                        char res = teclado.nextLine().charAt(0);
                        examen.setRespuestas(i, res);
                    }

                }
                case 2 -> {
                    for (int i = 1; i <= 20; i++) {
                        System.out.println("Introduce la respuesta del alumno de la pregunta " + i + ": ");
                        char res = teclado.nextLine().charAt(0);
                        examen.correcta(i, res);
                    }

                }
                case 3 -> {
                    System.out.println("Las respuestas correctas del examen son: " + examen.getRespuestas());

                }
                case 4 -> {
                    System.out.println("La nota del alumno es: " + examen.puntuacion());
                }
                case 0 ->
                    salir = true;
                default ->
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);

    }

    private static int pintarMenu() {
        System.out.println("\n\n\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Introducir respuestas examen");
        System.out.println("2 Introducir respuestas alumno");
        System.out.println("3 Ver respuestas correctas");
        System.out.println("4 Ver nota alumno");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 999;
        }
    }
}
