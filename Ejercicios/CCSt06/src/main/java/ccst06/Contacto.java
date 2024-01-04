//Contacto Cristina Correa
package ccst06;

import java.time.LocalDate;


public class Contacto {
    
    public String nombre;
    public long numero;
    public LocalDate altaAgenda;
    
    public Contacto(String nombre, long numero, LocalDate altaAgenda){
        this.nombre=nombre;
        this.numero=numero;
        this.altaAgenda=altaAgenda;
    }
    
    public Contacto(String nombre, long numero){
        this.nombre=nombre;
        this.numero=numero;
        this.altaAgenda=LocalDate.parse("2023-01-01");
    }
}
