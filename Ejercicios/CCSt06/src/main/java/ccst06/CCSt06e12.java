//Cristina Correa Segade
/*
Diseña una clase llamada Alumno para gestionar los alumnos de una escuela. Contiene los
atributos: nombre completo, DNI, fecha de nacimiento y nombre de la escuela (común para todos
los alumnos). Además del constructor, los métodos set y get para cada atributo, tendrá los siguientes
métodos:
- Método que nos dice si es mayor de edad o no.
- Método al que se le pase como parámetro otro alumno y nos devuelva true si el alumno
pasado es menor que él mismo. False en caso contrario.
- Método al que se le pase como parámetro otro alumno y nos devuelva true si el alumno
pasado es exactamente igual en todos los campos (un duplicado). False en caso contrario.

Hago una clase un poco diferente también en este package para practicar en comentarios


Realiza a continuación un programa sencillo que use la clase definida.

Hago un programa en donde creo tres alumnos, miro si hay dos repetidos, pido info sobre ellos
y miro si son mayores o menores
*/

package ccst06;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class CCSt06e12 {
/*
    //Atributos privados
    private String nombreCompleto;
    private String dni;
    private LocalDate fechaNacimiento;
    private static String escuela;
    
    //Constructores
    public CCSt06e12(String nombreCompleto, String dni, LocalDate fechaNacimiento){
        this.nombreCompleto=nombreCompleto;
        this.dni=dni;
        this.fechaNacimiento=fechaNacimiento;
        this.escuela="Fernando Wirtz";
    }
    
    public CCSt06e12(LocalDate fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
        this.escuela="Fernando Wirtz";
    }
    
    //Getters y Setters de todos los atributos (El setter de escuela no lo hago por razones obvias)
    public String getNombreCompleto(){
        return this.nombreCompleto;
    }
    
    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto=nombreCompleto;
    }
    
    public String getDni(){
        return this.dni;
    }
    
    public void setDni(String dni){
        this.dni=dni;
    }
    
    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento=fechaNacimiento;
    }
    
    public String getEscuela(){
        return this.escuela;
    }
    
    //Método que nos dice si es mayor de edad o no.
    public boolean mayoredad() {

        if (LocalDate.now().until(this.fechaNacimiento, ChronoUnit.YEARS) < 18) {
            return false;
        }
        return true;
    }
    
    //Método al que se le pase como parámetro otro alumno y nos devuelva true si el alumno pasado es exactamente igual en todos los campos (un duplicado). False en caso contrario.
    public boolean esDuplicado(CCSt06e12 alumno){
        if ((alumno.nombreCompleto.equals(this.nombreCompleto)) && (alumno.dni.equals(this.dni)) && (alumno.fechaNacimiento.isEqual(this.fechaNacimiento))) {
            return true;
        }
        return false;
    }
    
    //Método al que se le pase como parámetro otro alumno y nos devuelva true si el alumno pasado es menor que él mismo. False en caso contrario
    public boolean esMenor(CCSt06e12 alumno){
        return (alumno.fechaNacimiento.isAfter(this.fechaNacimiento));
    }
*/
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(LocalDate.parse("2015-06-03"));
        Alumno alumno2 = new Alumno(LocalDate.parse("2015-06-04"));
        Alumno alumno3 = new Alumno(LocalDate.parse("2014-08-05"));
        
        //Establecemos los nombres y DNIs con los setters
        System.out.println("Hay tres Alumnos");
        alumno1.setNombre("Juan");
        alumno1.setDNI("54831895B");
        alumno2.setNombre("Juan");
        alumno2.setDNI("54831895B");
        alumno3.setNombre("Elisa");
        alumno3.setDNI("32486975H");
        
        
        //Devolvemos los nombres con los getters
        System.out.println("Los alumnos se llaman "+alumno1.getNombre()+", "+alumno2.getNombre()+" y "+alumno3.getNombre());
        
        //Comprobamos si hay menores (de forma simple)
        if(alumno1.mayoredad()&&alumno2.mayoredad()&&alumno3.mayoredad()){
            System.out.println("Los tres alumnos son mayores de edad");
        }
        else{
            if(!alumno1.mayoredad()&&!alumno2.mayoredad()&&!alumno3.mayoredad()){
                System.out.println("Los tres alumnos son menores de edad");
            }
            else{
                System.out.println("Hay algún alumno menor de edad");
            }
        }
        
        //Comprobamos si hay un repetido
        if(!alumno1.igual(alumno2)||!alumno1.igual(alumno3)){
            System.out.println("No hay ningún alumno repetido");
        }
        else{
            System.out.println("Hay un alumno repetido");
            if(alumno1.igual(alumno2)||alumno1.igual(alumno3)){
                System.out.println("El alumno 1 es un repetido");
            }
            else{
                if(alumno2.igual(alumno3)){
                    System.out.println("El alumno2 es un repetido");
                }
            }
        }
        
        
        //Comprobamos cual es el menor
        if(alumno1.menor(alumno3)){
            System.out.println("El alumno1 es el menor");
        }
        else{
            if(alumno3.menor(alumno1)){
                System.out.println("El alumno3 es el menor");
            }
            else{
                System.out.println("Los tres alumos son iguales");
            }
        }
        
        
    }
}
