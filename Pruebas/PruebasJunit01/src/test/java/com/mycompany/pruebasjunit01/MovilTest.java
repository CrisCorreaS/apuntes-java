
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
public class MovilTest {
    
    static Movil instance;
    
    public MovilTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        instance = new Movil(10, "Samsung Galaxy");
        instance.setTarifa(0.5f);
        
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("--------------------------- ACABAMOS LOS TESTS --------------------------------");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println("--------------------------- Comienzo del test ---------------------------");
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Hora: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss:SS")));
    }

    /**
     * Test of hacerLlamada method, of class Movil.
     */
    @Test
    public void testHacerLlamada_1() {
        System.out.println("hacerLlamada() cuando el saldo es mayor que el coste de la llamada");
        int minutos = 5;
        boolean expResult = true;
        boolean result = instance.hacerLlamada(minutos);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHacerLlamada_2() {
        System.out.println("hacerLlamada() cuando el saldo es igual que el coste de la llamada");
        int minutos = 20;
        boolean expResult = false;
        boolean result = instance.hacerLlamada(minutos);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHacerLlamada_3() {
        System.out.println("hacerLlamada() cuando el saldo es menor que el coste de la llamada");
        int minutos = 30;
        boolean expResult = false;
        boolean result = instance.hacerLlamada(minutos);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHacerLlamada_4(){
        System.out.println("hacerLlamada() cuando los minutos son letras en vez de números");
        String minutos = "10";
        
        assertThrows(Exception.class, new Executable() {
            @Override
            public void execute() throws RuntimeException {
                boolean result = instance.hacerLlamada(minutos); ; // Se hace la llamada del resultado aquí
            }
        });
    }
    
}
