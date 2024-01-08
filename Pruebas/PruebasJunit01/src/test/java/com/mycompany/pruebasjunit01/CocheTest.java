/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pruebasjunit01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

/**
 *
 * @author Cristina Correa
 */
public class CocheTest {

    static Coche instance;

    public CocheTest() {
    }

    // Código que queremos ejecutar antes de hacer todos los tests -> Ej: establecer la conexión a una base de datos
    @BeforeAll
    public static void setUpClass() {
        instance = new Coche("Audi A3", 1);
        Coche.IMPUESTO = 20f;
    }

    // Código que queremos ejecutar después de hacer todos los tests -> Ej: cerrar la conexión a una base de datos
    @AfterAll
    public static void tearDownClass() {
    }

    // Código que queremos ejecutar antes de cada una de las pruebas 
    @BeforeEach
    public void setUp() {
        System.out.println("--------------------------- Comienzo del test ---------------------------");
    }

    // Código que queremos ejecutar después de cada una de las pruebas
    @AfterEach
    public void tearDown() {
        System.out.println("Hora: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss:SS")));
    }

    /**
     * Test of getPrecioFinal method, of class Coche.
     */
    @Test
    public void GetPrecioFinal_1() throws Exception {
        System.out.println("getPrecioFinal coche con descuento (precio mayor de 5000€)");
        float descuento = 10.0F;
/*
    Al crear las instancias de coche arriba, ahora este código que se repetía en todos los tests, ya no es necesario:
        Coche instance = new Coche("Audi A3", 10000);
        Coche.IMPUESTO = 20f;
        
    Pero sí que tenemos que poner:
*/
        instance.precioBase = 10000;

        float expResult = 10800.0F;
        float result = instance.getPrecioFinal(descuento);

        assertEquals(expResult, result, 0.000001);
    }

    @Test
    public void GetPrecioFinal_2() throws Exception {
        System.out.println("getPrecioFinal coche sin descuento (precio menor de 5000€)");
        float descuento = 10.0F;
/*
    Al crear las instancias de coche arriba, ahora este código que se repetía en todos los tests, ya no es necesario:
        Coche instance = new Coche("Audi A3", 1000);
        Coche.IMPUESTO = 20f;
        
    Pero sí que tenemos que poner:
*/
        instance.precioBase = 1000;

        float expResult = 1200.0F;
        float result = instance.getPrecioFinal(descuento);

        assertEquals(expResult, result, 0.000001);
    }

    @Test
    public void GetPrecioFinal_3() throws Exception {
        System.out.println("getPrecioFinal produce exception por el descuento mayor de 100");
        float descuento = 110.0F;
/*
    Al crear las instancias de coche arriba, ahora este código que se repetía en todos los tests, ya no es necesario:
        Coche instance = new Coche("Audi A3", 1000);
        Coche.IMPUESTO = 20f;
        
    Pero sí que tenemos que poner:
*/
        instance.precioBase = 1000;
        // También tenemos que eliminar el resultado esperado y mover el resultado del test dentro de la estructura de assertThrows()
        
        assertThrows(Exception.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                float result = instance.getPrecioFinal(descuento); // Se hace la llamada del resultado aquí
            }
        });
    }
}
