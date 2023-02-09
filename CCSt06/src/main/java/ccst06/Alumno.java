//Alumno Cristina Correa
package ccst06;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * 17/11/2022
 *
 * @author marta.lopezyanez Diseña una clase llamada Alumno para gestionar los
 * alumnos de una escuela. Contiene los atributos: nombre completo, DNI, fecha
 * de nacimiento y nombre de la escuela (común para todos los alumnos). Además
 * del constructor, los métodos set y get para cada atributo, tendrá los
 * siguientes métodos: - Método que nos dice si es mayor de edad o no. - Método
 * al que se le pase como parámetro otro alumno y nos devuelva true si el alumno
 * pasado es menor que él mismo. False en caso contrario. - Método al que se le
 * pase como parámetro otro alumno y nos devuelva true si el alumno pasado es
 * exactamente igual en todos los campos (un duplicado). False en caso
 * contrario. Realiza a continuación un programa sencillo que use la clase
 * definida.
 */
public class Alumno {

    private String nombre;
    private String DNI;
    private static String nombreEscuela;
    LocalDate fechaNacimiento;
Alumno(LocalDate nacimiento){
fechaNacimiento=nacimiento;
}  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String d) {
        DNI = d;
    }

    public static String getNombreEscuela() {
        return nombreEscuela;
    }

    public static void setNombreEscuela(String n) {
        nombreEscuela = n;
    }

    public boolean mayoredad() {

        if (LocalDate.now().until(this.fechaNacimiento, ChronoUnit.YEARS) < 18) {
            return false;
        }
        return true;
    }

    public boolean menor(Alumno alumno) {

        return (alumno.fechaNacimiento.isAfter(this.fechaNacimiento));

    }

    public boolean igual(Alumno alumno) {

        if ((alumno.nombre.equals(this.nombre)) && (alumno.DNI.equals(this.DNI)) && (alumno.fechaNacimiento.isEqual(this.fechaNacimiento))) {
            return true;
        }
            return false;
       
    }

}
