/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcorr
 */
public class AguinaldoTest {
    
    public AguinaldoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of findbonus method, of class Aguinaldo.
     */
    @Test
    //La fecha inicial es posterior a la fecha de fin del cálculo del bono
    public void testFindbonusFechaPosterior() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2023-04-09 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2023-03-09 10:30", formatter);
        float amount = 1000000;
        float expResult = -1;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
        @Test
        // El monto calcular el bono debe ser superior o igual 300 000
    public void testFindbonusMonto() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2022-01-09 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2022-03-09 10:30", formatter);
        float amount = 200000;
        float expResult = -2;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
            @Test
            //La fecha inicio no está rango adecuado porque el mes en previo a diciembre del año anterior de cálculo.
    public void testFindbonusRangoFecha() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2022-01-09 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2023-03-09 10:30", formatter);
        float amount = 1000000;
        float expResult = -3;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
            @Test
        // Prueba de findbonus con los datos correctos
    public void testFindbonusCorrecto() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("findbonus");
        LocalDateTime startDate = LocalDateTime.parse("2022-01-09 10:30", formatter);
        LocalDateTime endDate = LocalDateTime.parse("2022-03-09 10:30", formatter);
        float amount = 300000;
        float expResult = 75000;
        float result = Aguinaldo.findbonus(startDate, endDate, amount);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of bonus method, of class Aguinaldo.
     */
    @Test
    public void testBonus() {
        System.out.println("bonus");
        long moth = 0L;
        float amount = 0.0F;
        float expResult = 0.0F;
        float result = Aguinaldo.bonus(moth, amount);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Aguinaldo.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Aguinaldo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
