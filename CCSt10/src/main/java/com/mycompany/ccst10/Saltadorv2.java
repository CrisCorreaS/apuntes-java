//Cristina Correa Segade
//Ejercicio 11

package com.mycompany.ccst10;


public interface Saltadorv2 {
    float saltarAltura();

    default boolean saltaPertiga(float cm) {
        return false;
    }
}
