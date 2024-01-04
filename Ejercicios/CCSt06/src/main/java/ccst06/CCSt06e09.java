//Cristina Correa Segade
/*
Ejercicios de fechas. Usando las clases de Java para el manejo de fechas, realiza programas
con la siguiente funcionalidad:
a) Introducir tu fecha de nacimiento y muestre cuantos días han pasado hasta ahora mismo.
b) Introducir una fecha y un número de días y calcule la fecha que se obtiene al incrementar
dichos días a la fecha.
c) Introducir dos horas de reloj y nos dé la diferencia entre ambas en segundos.
d) ¿Cuántos años bisiestos ha habido desde el año 1 dC?
e) Introducir una fecha y mostrar el día de la semana que le corresponde.
f) Introducir un tipo de producto (1- perecedero, 2-electrónica, 3-ropa) y la fecha de compra, y
que informe si se puede devolver a día de hoy o no (los plazos de devolución, son
respectivamente 5 horas, 6 meses, 15 días)
g) Introducir un año y decir cuántos domingos tiene.
h) Indica el día de la semana (en texto, en gallego) del 31 de diciembre de los últimos 5 años.
*/

package ccst06;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;
import java.util.Locale;
import java.util.Scanner;


public class CCSt06e09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //a) Introducir tu fecha de nacimiento y muestre cuantos días han pasado hasta ahora mismo.
        System.out.println("Introduce la fecha de cumpleaños(formato:AAAA-MM-DD): ");
        String f = teclado.nextLine();
        LocalDate miFecha = LocalDate.parse(f);
        System.out.println(DAYS.between(LocalDate.now(), miFecha));

        //b)Introducir una fecha y un número de días y calcule la fecha que se obtiene al incrementar dichos días a la fecha.
        System.out.println("Introduce una fecha(formato:AAAA-MM-DD): ");
        f = teclado.nextLine();
        LocalDate fecha = LocalDate.parse(f);
        System.out.println("Introduce el número de dias: ");
        int d = teclado.nextInt();
        System.out.println(fecha.plus(d, DAYS));

        // c) Introducir dos horas de reloj y nos dé la diferencia entre ambas en segundos.
        System.out.println("Introduce la primera hora: ");
        String h = teclado.nextLine();
        LocalTime hora1 = LocalTime.parse(h);
        System.out.println("Introduce la segunda hora: ");
        h = teclado.nextLine();
        LocalTime hora2 = LocalTime.parse(h);
        System.out.println(ChronoUnit.SECONDS.between(hora1, hora2));

        //d) ¿Cuántos años bisiestos ha habido desde el año 1 dC? 
        int bis = 0;
        for (int i = LocalDate.of(1, 1, 1).getYear(); i <= LocalDate.now().getYear(); i++) {
            if (LocalDate.of(i, 1, 1).isLeapYear()) {
                bis++;
            }
        }
        System.out.println("Desde el año 1 dC ha habido: " + bis + " años bisiestos");

        //e) Introducir una fecha y mostrar el día de la semana que le corresponde.
        System.out.println("Introduce una fecha(formato:AAAA-MM-DD): ");
        f = teclado.nextLine();
        fecha = LocalDate.parse(f);
        System.out.println(fecha.getDayOfWeek());

        /*f) Introducir un tipo de producto (1-perecedero, 2-electrónica, 3-ropa) y la fecha de compra, y que informe si se
             puede devolver a día de hoy o no (los plazos de devolución, son respectivamente 5 horas, 6 meses, 15 días)*/
        System.out.println("Introduce el tipo de producto (1-perecedero, 2-electrónica, 3-ropa: ");
        int tipo = teclado.nextInt();
        System.out.println("Introduce la fecha y hora de compra(formato:AAAA-MM-DDTHH:MM): ");
        f = teclado.nextLine();
        LocalDateTime fec = LocalDateTime.parse(f);

        boolean devolucion = true;
        if (tipo == 1 && (ChronoUnit.HOURS.between(fec, LocalDateTime.now())) > 5) {
            devolucion = false;
        }
        if (tipo == 2 && ChronoUnit.MONTHS.between(fec, LocalDate.now()) > 6) {
            devolucion = false;
        }
        if (tipo == 3 && ChronoUnit.DAYS.between(fec, LocalDate.now()) > 15) {
            devolucion = false;
        }
        if (devolucion) {
            System.out.println("Se puede devolver");
        } else {
            System.out.println("No se puede devolver");
        }

        // g) Introducir un año y decir cuántos domingos tiene.
        System.out.println("Introduce el año: ");
        int a = teclado.nextInt();
        int dom = 0;
        LocalDate i = LocalDate.of(a, 1, 1);
        LocalDate fin = LocalDate.of(a, 12, 31);
        do {
            if (i.getDayOfWeek().getValue() == 7) {
                dom++;
            }
            i = i.plus(1, DAYS);

        } while (i.isEqual(fin) == false);
        
        System.out.println("El año tiene: " + dom + " domingos");

        // h) Indica el día de la semana (en texto, en gallego) del 31 de diciembre de los últimos 5 años
        a = LocalDate.now().getYear();
        fecha = LocalDate.of(a, 12, 31);
        for (int j = 0; j < 5; j++) {
            DayOfWeek dia = fecha.getDayOfWeek();
            Locale locale = new Locale("gl", "ES");
            System.out.println(dia.getDisplayName(TextStyle.FULL, locale));
            fecha.minus(1, YEARS);
        }
    }
}
