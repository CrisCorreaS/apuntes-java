package com.mycompany.pruebasjunit01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Cristina Correa
 */
public class CirculoTest {

    static Circulo instance;

    public CirculoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        instance = new Circulo();
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
     * Test of calcularCircunferencia method, of class Circulo.
     */
    @Test
    public void testCalcularCircunferencia_1() {
        System.out.println("calcularCircunferencia con un radio de número entero positivo");
        instance.setRadio(10);
        double expResult = 62.83185307179586;
        double result = instance.calcularCircunferencia();
        assertEquals(expResult, result, 0.000000001);
    }

    /**
     * Test of calcularSuperficie method, of class Circulo.
     */
    @Test
    public void testCalcularSuperficie_1() {
        System.out.println("calcularSuperficie con un radio de número entero positivo");
        instance.setRadio(10);
        double expResult = 314.1592653589793;
        double result = instance.calcularSuperficie();
        assertEquals(expResult, result, 0.000000001);

    }

    /**
     * Test of calcularDiametro method, of class Circulo.
     */
    @Test
    public void testCalcularDiametro_1() {
        System.out.println("calcularDiametro con un radio de número entero positivo");
        instance.setRadio(10);

        int expResult = 20;
        int result = instance.calcularDiametro();
        assertEquals(expResult, result, 0.000000001);

    }
    
    /**
     * Test of calcularCircunferencia method, of class Circulo.
     */
    @Test
    public void testCalcularCircunferencia_2() {
        System.out.println("calcularCircunferencia con un radio igual a 0");
        instance.setRadio(0);
        double expResult = 0.0;
        double result = instance.calcularCircunferencia();
        assertEquals(expResult, result, 0.000000001);
    }

    /**
     * Test of calcularSuperficie method, of class Circulo.
     */
    @Test
    public void testCalcularSuperficie_2() {
        System.out.println("calcularSuperficie con un radio igual a 0");
        instance.setRadio(0);
        
        double expResult = 0.0;
        double result = instance.calcularSuperficie();
        assertEquals(expResult, result, 0.000000001);

    }

    /**
     * Test of calcularDiametro method, of class Circulo.
     */
    @Test
    public void testCalcularDiametro_2() {
        System.out.println("calcularDiametro con un radio igual a 0");
        instance.setRadio(0);

        int expResult = 0;
        int result = instance.calcularDiametro();
        assertEquals(expResult, result, 0.000000001);

    }
    
    /**
     * Test of calcularCircunferencia method, of class Circulo.
     */
    @Test
    public void testCalcularCircunferencia_3() {
        System.out.println("calcularCircunferencia con un radio de número entero negativo");
        instance.setRadio(-2);
        double expResult = -1.0;
        double result = instance.calcularCircunferencia();
        assertEquals(expResult, result, 0.000000001);
    }

    /**
     * Test of calcularSuperficie method, of class Circulo.
     */
    @Test
    public void testCalcularSuperficie_3() {
        System.out.println("calcularSuperficie con un radio de número entero negativo");
        instance.setRadio(-2);

        double expResult = -1.0;
        double result = instance.calcularSuperficie();
        assertEquals(expResult, result, 0.000000001);

    }

    /**
     * Test of calcularDiametro method, of class Circulo.
     */
    @Test
    public void testCalcularDiametro_3() {
        System.out.println("calcularDiametro con un radio de número entero negativo");
        instance.setRadio(-2);

        int expResult = -1;
        int result = instance.calcularDiametro();
        assertEquals(expResult, result, 0.000000001);

    }
    
    /**
     * Test of calcularCircunferencia method, of class Circulo.
     */
    @Test
    public void testCalcularCircunferencia_4() {
        System.out.println("calcularCircunferencia con un radio de número decimal positivo");
        instance.setRadio(3.333f);
        double expResult = 20.941856281287038;
        double result = instance.calcularCircunferencia();
        assertEquals(expResult, result, 0.000000001);
    }

    /**
     * Test of calcularSuperficie method, of class Circulo.
     */
    @Test
    public void testCalcularSuperficie_4() {
        System.out.println("calcularSuperficie con un radio de número decimal positivo");
        instance.setRadio(3.333f);
        
        double expResult = 34.89960291358525;
        double result = instance.calcularSuperficie();
        assertEquals(expResult, result, 0.000000001);

    }

    /**
     * Test of calcularDiametro method, of class Circulo.
     */
    @Test
    public void testCalcularDiametro_4() {
        System.out.println("calcularDiametro con un radio de número decimal positivo");
        instance.setRadio(3.333f);

        int expResult = 7;
        int result = instance.calcularDiametro();
        assertEquals(expResult, result, 0.000000001);

    }

}
