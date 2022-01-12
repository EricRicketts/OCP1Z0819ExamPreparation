package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testConvertStringToPrimitive() {
        assertEquals(11, Integer.parseInt("11"));
    }

    @Test
    public void testConvertStringToWrapper() {
        Integer expected = new Integer(11);
        assertEquals(expected, Integer.valueOf("11"));
    }

    @Test
    public void testAutoBoxingInArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        int x = 1, y = 2, z = 3;
        list.add(x);
        list.add(y);
        list.add(z);
        for (Integer i:list) {
            assertEquals("java.lang.Integer", i.getClass().getName());
        }
    }

    @Test
    public void testAutoUnboxing() {
        double i = new Integer(1);
        double j = 1.0;
        assertEquals(j, i);
    }
}
