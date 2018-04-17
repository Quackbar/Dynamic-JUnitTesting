/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointhing;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 *
 * @author samluther
 */
public class CoinThingTest {
    
    public CoinThingTest() {
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
     * Test of main method, of class CoinThing.
     */
    @Test
    public void emptyArray() {
        int[] a = null;
        System.out.println("Empty Array Test");
        CoinThing c = new CoinThing();
        String[] res = c.changeMaker(a, 0);
        int [] exp = null;
        assertEquals(exp,res);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void test1() {
        int[] a = {1,5,10,25};
        System.out.println("Test 1");
        CoinThing c = new CoinThing();
        String[] res = c.changeMaker(a, 25);
        String [] exp = {"25"};
        assertEquals(exp,res);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void test2() {
        int[] a = {1,5,10,25};
        System.out.println("Test 2");
        CoinThing c = new CoinThing();
        String[] res = c.changeMaker(a, 64);
        String [] exp = {"25","25","10","1","1","1","1"};
        assertEquals(exp,res);
        // TODO review the generated test code and remove the default call to fail.

    }
    @Test
    public void test3() {
        int[] a = {1,5,10,25};
        System.out.println("Test 3");
        CoinThing c = new CoinThing();
        String[] res = c.changeMaker(a, 15);
        String [] exp = {"10","5"};
        assertEquals(exp,res);

        // TODO review the generated test code and remove the default call to fail.

    }
    
}
