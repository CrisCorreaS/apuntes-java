//Cristina Correa Segade
/*
Sobre el siguiente código, modifica la clase Contacto para que funcione el main() mostrado:
import java.time.*;
public class ejercicio {
public static void main(String[] args) {
Contacto contacto;
contacto = new Contacto ("Marta", 6661111222L, LocalDate.parse("2019-11-25"));
contacto = new Contacto ("Miguel", 1111111L, LocalDate.now());
contacto = new Contacto ("Ana", 3333333L,"2019-11-20");
contacto = new Contacto ("Daniel", 444444L);
}}
class Contacto {
public String nombre;
public long numero;
public LocalDate fechaAltaAgenda;
Contacto (String no, long nu,LocalDate fe){
this.nombre = no;
this.numero = nu;
this.fechaAltaAgenda = fe;
}
}

//Tuve que hacer la clase contacto, hacer dos constructores y corregir una cosa en el main
que está explicada con comentarios.
*/

package ccst06;

import java.time.LocalDate;


public class CCSt06e13 {

    public static void main(String[] args) {
        Contacto contacto;
        contacto = new Contacto ("Marta", 6661111222L, LocalDate.parse("2019-11-25"));
        contacto = new Contacto ("Miguel", 1111111L, LocalDate.now());
        //Aquí no puedo dejarlo sin LocalDate.parse()
        contacto = new Contacto ("Ana", 3333333L, LocalDate.parse("2019-11-20"));
        contacto = new Contacto ("Daniel", 444444L);
    }
}
