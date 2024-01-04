package com.mycompany.ccst03;
//Cristina Correa Segade

/*
3.12. Diseñar un algoritmo al que se le introduzcan las notas de los exámenes de una clase con 
decimales. Se introducirá –1 para indicar que no hay más notas.  El algoritmo informará del total de 
notas introducidas, calculará la nota mínima, máxima , la media, si hay algún 5.0 exacto, y el 
porcentaje de aprobados. Hay que validar que estén entre 0 y 10. - Hay que pensar primero el bucle: el código ser repite mientras….. Una vez aclarado esto, puedes 
pensar qué es lo que se hace cada vez (en este caso, qué hago con cada nota introducida) - Para calcular la nota máxima hay que tener guardada en una variable la máxima hasta ese 
momento y al leer una nueva nota, compararla la nueva con la guardada,  y si la nueva es mayor 
que la guardada, guardamos la nueva, ya que ahora es la máxima y así para todas las iteraciones 
del bucle (para empezar puedes decir que la máxima nota es -1) - Para calcular la media hay que ir acumulando los valores y la cantidad de elementos, y al final 
dividir lo acumulado entre la cantidad de elementos. 
 */
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float nota, suma = 0, media = 0, notaMax = 0, notaMin = 10;
        int totalAlumnos = 0, aprobados = 0, porcentajeAprobados = 0;
        boolean sacar5 = false;

        System.out.println("Introduce la nota de un alumno (-1 para parar)");
        nota = teclado.nextFloat();

        while (nota != -1) {
            if (nota <= 10 && nota >= 0) {

                totalAlumnos++;
                suma += nota;

                if (notaMax < nota) {
                    notaMax = nota;
                }

                // En vez del if puedes poner un operador ternario así: notaMax = notaMax < nota ? nota : notaMax;
                if (notaMin > nota) {
                    notaMin = nota;
                }

                if (nota >= 5) {
                    aprobados++;
                    
                    if (nota == 5) {
                        sacar5 = true;
                    }
                }

            } else {
                System.out.println("Esta nota no es correcta");
            }

            System.out.println("Introduce la nota de un alumno (-1 para parar)");
            nota = teclado.nextFloat();
        }
        
        media = suma / totalAlumnos;
        porcentajeAprobados = aprobados * 100 / totalAlumnos;

        System.out.println("Las notas totales introducidas son " + totalAlumnos);
        System.out.println("La nota máxima es: " + notaMax + " y la nota mínima es: " + notaMin);
        System.out.println("La media de las notas es igual a: " + media);

        if (sacar5) {
            System.out.println("Hubo algún estudiante que sacó un 5.0 en el examen");
        } else {
            System.out.println("No hubo ningún estudiante que sacase un 5.0 en el examen");
        }
        System.out.println("El porcentaje de aprobados es igual a: " + porcentajeAprobados + "%");

    }
}
