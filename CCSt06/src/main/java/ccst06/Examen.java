//Examen Cristina Correa
package ccst06;

import java.time.*;
import java.time.temporal.ChronoUnit;

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
