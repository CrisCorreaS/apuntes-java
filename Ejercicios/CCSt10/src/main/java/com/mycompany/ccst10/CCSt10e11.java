//Cristina Correa
/*
Duplica las interfaces y las clases del ejercicio anterior (añadiéndoles el sufijo _v2) Modifica la
interfaz Saltador_v2 añadiéndole el método saltaPertiga que recibe como parámetro una altura en
centímetros y devuelve true si ha logrado el salto y false si no lo ha logrado ¿Qué ocurre con la clase
TriAtleta_v2? Desarrolla saltaPertiga como método default en la interfaz de forma que por defecto
devuelva false.
• Haz una nueva versión de TriAtleta (sufijo _v2b) que implemente saltaPertiga con este
criterio: para saltos de más de 6 metros devuelve false, entre 5 y 6 metros devuelve true la
mitad de las veces y por debajo de 5 metros devuelve siempre true.
• Haz un programa que cree una instancia de Triatleta_v2 y otra de Triatleta_v2b y que
muestre el resultado de ambos atletas saltando: 100cm, 550cm, 560cm, 580cm, 700cm.
*/


package com.mycompany.ccst10;


public class CCSt10e11 {

    public static void main(String[] args) {
        Triatletav2 triAtleta = new Triatletav2();
        Triatletav2b triAtletab = new Triatletav2b();

        System.out.println("Primer TriAtleta");

        System.out.println("Primer intento: 100cm");
        if (triAtleta.saltaPertiga(100)) {
            System.out.println("Lo ha logrado");
        } else {
            System.out.println("No lo ha logrado");
        }

        System.out.println("Segundo intento: 550cm");
        if (triAtleta.saltaPertiga(550)) {
            System.out.println("Lo ha logrado");
        } else {
            System.out.println("No lo ha logrado");
        }

        System.out.println("Tercer intento: 560cm");
        if (triAtleta.saltaPertiga(560)) {
            System.out.println("Lo ha logrado");
        } else {
            System.out.println("No lo ha logrado");
        }

        System.out.println("Cuarto intento: 580cm");
        if (triAtleta.saltaPertiga(580)) {
            System.out.println("Lo ha logrado");
        } else {
            System.out.println("No lo ha logrado");
        }

        System.out.println("Quinto intento: 700cm");
        if (triAtleta.saltaPertiga(700)) {
            System.out.println("Lo ha logrado");
        } else {
            System.out.println("No lo ha logrado");
        }

        System.out.println("Segundo TriAtleta");
        Triatletav2b.numVeces++;
        System.out.println("Primer intento: 100cm");
        if (triAtletab.saltaPertiga(100)) {
            System.out.println("Lo ha logrado");
        } else {
            System.out.println("No lo ha logrado");
        }
        
        Triatletav2b.numVeces++;
        System.out.println("Segundo intento: 550cm");
        if (triAtletab.saltaPertiga(550)) {
            System.out.println("Lo ha logrado");
        } else {
            System.out.println("No lo ha logrado");
        }
        
        Triatletav2b.numVeces++;
        System.out.println("Tercer intento: 560cm");
        if (triAtletab.saltaPertiga(560)) {
            System.out.println("Lo ha logrado");
        } else {
            System.out.println("No lo ha logrado");
        }
        
        Triatletav2b.numVeces++;
        System.out.println("Cuarto intento: 580cm");
        if (triAtletab.saltaPertiga(580)) {
            System.out.println("Lo ha logrado");
        } else {
            System.out.println("No lo ha logrado");
        }
        
        Triatletav2b.numVeces++;
        System.out.println("Quinto intento: 700cm");
        if (triAtletab.saltaPertiga(700)) {
            System.out.println("Lo ha logrado");
        } else {
            System.out.println("No lo ha logrado");
        }
    }
}