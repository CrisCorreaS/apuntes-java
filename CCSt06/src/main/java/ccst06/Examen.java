//Examen Cristina Correa
package ccst06;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * 23/11/2022
 *
 * @author marta.lopezyanez Un profesor ha desarrollado un examen tipo test de
 * 20 preguntas y cada una de ellas tiene cuatro opciones: a), b), c) ó d),
 * siendo solo una de ellas la correcta. Cada pregunta correcta suma 0.5 puntos
 * y cada una incorrecta resta 0.2 puntos, no pudiendo llevar un alumno ninguna
 * nota inferior a cero. Desarrolla una clase llamada Examen que almacene las
 * respuestas correctas de las 20 preguntas. La clase debe disponer de algún
 * mecanismo mediante el que se le pase las respuestas de un alumno para las 20
 * preguntas (a,b,c,d o bien z, siendo respuesta en blanco) y nos informe de la
 * puntuación en el examen. Hacer un programa que permita primero informar de
 * las respuestas correctas a un examen y después introducir las respuestas de
 * los alumnos, mostrándonos la nota obtenida por los mismos.
 */
public class Examen {

    private static final StringBuilder respuestas = new StringBuilder(20);
    public float nota = 0;
    public int cor = 0;
    public int incor = 0;

    Examen() {

    }

    public void setRespuestas(int num, char res) {

        respuestas.setCharAt(num, res);

    }
     public StringBuilder getRespuestas() {
        return respuestas;
    }
    

    public void correcta(int num, char res) {

        if (respuestas.charAt(num)==res) {
            cor++;
        } else {
            incor++;
        }

    }

    public float puntuacion() {

        nota = (float) (nota + (cor * 0.5) - (incor * 0.2));
        if (nota < 0) {
            nota = 0;
        }
        return nota;
    }

}
