//Cristina Correa Segade
/*
Crea una clase de tipo genérica llamada ListaPequeña que tendrá como atributos privados un
ArrayList de tipo genérico llamado valores y un entero (qué será final, piensa el porqué) con el
tamaño de la lista, llamado tamañoMax.
• Al constructor de esta clase le pasaremos un entero positivo que se asignará a
tamañoMax. El constructor instanciará también el ArrayList valores.
• Tendrá un método llamado añadir que se le pasa un objeto de tipo genérico y si el arraylist
aún tiene un tamaño menor que tamañoMax, lo añadirá, pero si el arraylist ha llegado a
ese tamaño, añadirá objeto pasado en la última posición del ArrayList, sustituyendo el
elemento que allí hubiera (así conseguimos que el ArrayList no crezca por encima del
tamaño máximo)
• Tiene un método llamado clear(), que simplemente hace un clear() del ArrayList valores.
• Tiene un método llamado getValores() que devuelve el ArrayList privado valores.
Haz un programa que cree una ListaPequeña de tipo String de 5 elementos. Añádele 6 ó 7 String
a la lista y muestra su contenido, para ver si ha crecido por encima de esos 5 elementos.
Crea otro programa similar al anterior, pero en vez de trabajar con String trabaje con una clase
que hayas creado previamente, por ejemplo: Persona_v4.
Una forma de abordar los ejercicios de genéricos es hacerlo como si no fuesen genéricos, por
ejemplo, pensando que son String, y luego hacer el paso a genéricos. En este caso podríamos
pensar en una lista pequeña de String y luego hacer la "generalización" sustituyendo todos los
sitios donde aparezca String por "<T>".
*/

package com.mycompany.ccst16;

import java.time.LocalDate;


public class CCSt16e07 {

    public static void main(String[] args) {
        
        ListaPequena<String> listaStr = new ListaPequena<>(5);
        listaStr.annadir("Marta");
        listaStr.annadir("Cris");
        listaStr.annadir("Diana");
        listaStr.annadir("Ruben");
        listaStr.annadir("Catia");
        listaStr.annadir("Andres");

        System.out.println(listaStr.getValores());

        ListaPequena<Persona1v4> listaPers = new ListaPequena<>(5);
        listaPers.annadir(new Persona1v4("Marta", "123456780", "marta@programacion.com", LocalDate.parse("1999-01-30"), Genero.FEMENINO));
        listaPers.annadir(new Persona1v4("Cris", "123456781", "cris@programacion.com", LocalDate.parse("2000-02-29"), Genero.FEMENINO));
        listaPers.annadir(new Persona1v4("Diana", "123456782", "diana@programacion.com", LocalDate.parse("2001-03-28"), Genero.FEMENINO));
        listaPers.annadir(new Persona1v4("Ruben", "123456783", "ruben@programacion.com", LocalDate.parse("2002-04-27"), Genero.MASCULINO));
        listaPers.annadir(new Persona1v4("Catia", "123456784", "catia@programacion.com", LocalDate.parse("2003-05-26"), Genero.FEMENINO));
        listaPers.annadir(new Persona1v4("Andres", "123456785", "andres@programacion.com", LocalDate.parse("2004-06-25"), Genero.MASCULINO));

        System.out.println(listaPers.getValores());
    }
}
