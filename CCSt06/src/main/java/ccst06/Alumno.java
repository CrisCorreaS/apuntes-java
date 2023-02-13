//Alumno Cristina Correa
package ccst06;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Alumno {

    private String nombre;
    private String DNI;
    private static String nombreEscuela;
    LocalDate fechaNacimiento;

    public Alumno(LocalDate nacimiento){
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
        long edad;
        edad = ChronoUnit.YEARS.between(this.fechaNacimiento,LocalDate.now());
        
        if(edad >= 18){
            return true;
        }else{
            return false;
        }
    }

    public boolean menor(Alumno alumno) {
        long edadAlumno;
        edadAlumno = ChronoUnit.YEARS.between(this.fechaNacimiento,LocalDate.now());
        
        long edadOtro;
        edadOtro = ChronoUnit.YEARS.between(alumno.fechaNacimiento,LocalDate.now());
        
        if(edadAlumno > edadOtro){
            return true;
        } else {
            return false;
        }

    }

    public boolean igual(Alumno alumno) {
        if(this.nombre.equals(alumno.nombre) && this.DNI.equals(alumno.DNI) && this.fechaNacimiento.isEqual(alumno.fechaNacimiento)){
            return true;
        } else {
            return false;
        }
    }
}
