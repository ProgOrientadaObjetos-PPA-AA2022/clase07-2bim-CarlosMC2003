/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package paquete1;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SALA I
 */
public class EstudiantePresencialTest {
    private EstudiantePresencial instance;
    
    public EstudiantePresencialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new EstudiantePresencial();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEstablecerNumeroCreditos() throws 
            IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException {
        System.out.println("establecerNumeroCreditos");
        int numero = 10;
        instance.establecerNumeroCreditos(numero);
        Field field = instance.getClass().getDeclaredField("numeroCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 10);
        
    }

    @Test
    public void testEstablecerCostoCredito() throws 
            IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException{
        System.out.println("establecerCostoCredito");
        double valor = 1.0;
        instance.establecerCostoCredito(valor);
        Field field = instance.getClass().getDeclaredField("costoCredito");
        field.setAccessible(true);
        assertEquals(field.get(instance), 1.0);
        
    }
    
    @Test
    public void testCalcularMatriculaPresencial() throws 
            IllegalArgumentException, 
            NoSuchFieldException, 
            IllegalAccessException {
        System.out.println("calcularMatriculaPresencial");
        instance.establecerNumeroCreditos(10);
        instance.establecerCostoCredito(1.0);
        instance.calcularMatriculaPresencial();

    }

    @Test
    public void testObtenerNumeroCreditos() {
        System.out.println("obtenerNumeroCreditos");
        instance.establecerNumeroCreditos(10);
        int expResult = 10;
        int result = instance.obtenerNumeroCreditos();
        assertEquals(expResult, result);
    }


    @Test
    public void testObtenerCostoCredito() {
        System.out.println("obtenerCostoCredito");
        instance.establecerCostoCredito(1.0);;
        double expResult = 1.0;
        double result = instance.obtenerCostoCredito();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testObtenerMatriculaPresencial() {
        System.out.println("obtenerMatriculaPresencial");
        instance.establecerNumeroCreditos(10);
        instance.establecerCostoCredito(1.0);
        instance.calcularMatriculaPresencial();
        double expResult = 10;
        double result = instance.obtenerMatriculaPresencial();
        assertEquals(expResult, result, 0.0);
    }
    
}
