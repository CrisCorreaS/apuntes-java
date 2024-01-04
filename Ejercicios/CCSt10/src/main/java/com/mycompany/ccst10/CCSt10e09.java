//Cristina Correa
/*
Desarrolla una interfaz llamada Ciclista con un método llamado recorrer() al que se le pasa un
número de kilómetros y una cadena con tipo de terreno y devuelve los segundos que tarda en
recorrerlo. Una interfaz llamada Nadador con un método llamado nadar a la que se le pasan metros
y devuelve los segundos en recorrerlo, y por último otra interfaz llamada Saltador con un método
saltarAltura que no recibe parámetros y que devuelve los centímetros saltados.
• Desarrolla una clase Delfin que implemente la interfaz Nadador. El tiempo en recorrer una
distancia es aleatorio entre 40km/h y 70km/hora
• Desarrolla una clase BallenaAzul que implemente la interfaz Nadador. El tiempo en recorrer
una distancia es de 10km/h para las mayores de 5 años y 13km/h para las menores.
• Desarrolla una clase TriAtleta que implemente las tres interfaces, con los criterios que tu
consideres (pueden devolver valores aleatorios entre unos mínimos y máximos que tú
decidas o tener en cuenta otros parámetros como edad, sexo, etc.).
• Realiza un programa sencillo que cree instancias de delfines, ballenas azules y triatletas y
use los métodos desarrollados.
*/


package com.mycompany.ccst10;

import java.util.ArrayList;
import java.util.Random;


public class CCSt10e09 {

    public static void main(String[] args) {
        ArrayList<Nadador> nadadores = new ArrayList<>();
        ArrayList<Triatleta> triatletas = new ArrayList<>();

        nadadores.add(new Delfin());
        nadadores.add(new Delfin());
        nadadores.add(new BallenaAzul(5));
        nadadores.add(new BallenaAzul(11));
        triatletas.add(new Triatleta());
        triatletas.add(new Triatleta());
        triatletas.add(new Triatleta());

        for (Nadador nadador : nadadores) {
            Random r = new Random();
            float metros = r.nextFloat() * (1000 - 100) + 100;
            System.out.println("El tiempo que tarda en recorrer " + metros + " metros es: " + nadador.nadar(metros));
        }

        for (Triatleta triatleta : triatletas) {
            Random r = new Random();
            float metros = r.nextFloat() * (1000 - 100) + 100;
            float km = r.nextFloat() * (20 - 5) + 5;
            System.out.println("El tiempo que tarda en recorrer " + metros + " metros es: " + triatleta.nadar(metros));
            System.out.println("Los centímetros que ha saltado son: " + triatleta.saltarAltura() + "cm");
            if (triatleta == triatletas.get(0)) {
                System.out.println("El tiempo que tarda en recorrer " + km + " kilómetros es: " + triatleta.recorrer(km, "montaña"));
            } else {
                System.out.println("El tiempo que tarda en recorrer " + km + " kilómetros es: " + triatleta.recorrer(km, "carretera"));
            }
        }
    }
}