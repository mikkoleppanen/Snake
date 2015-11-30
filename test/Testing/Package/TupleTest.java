/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing.Package;

import Source.Package.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mikko
 */
public class TupleTest {
    
    public TupleTest() {
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
     * Test of ChangeData method, of class Tuple.
     */
    @Test
    public void testChangeData() {
        System.out.println("ChangeData");
        int x = 2;
        int y = 5;
        Tuple instance = new Tuple(0,0);
        instance.ChangeData(x, y);
        assertEquals(x,instance.getX());
        assertEquals(y,instance.getY());
    }

    /**
     * Test of getX method, of class Tuple.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Tuple instance = new Tuple(7,0);
        int expResult = 7;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Tuple.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Tuple instance = new Tuple(0,9);
        int expResult = 9;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of getXf method, of class Tuple.
     */
    @Test
    public void testGetXf() {
        System.out.println("getXf");
        Tuple instance = new Tuple(0,0);
        instance.xf = 20;
        int expResult = 20;
        int result = instance.getXf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYf method, of class Tuple.
     */
    @Test
    public void testGetYf() {
        System.out.println("getYf");
        Tuple instance = new Tuple(0,0);
        instance.yf = 3;
        int expResult = 3;
        int result = instance.getYf();
        assertEquals(expResult, result);
    }
    
}
