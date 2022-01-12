package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.List.*;
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
        int expected = 11;
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
        double i = Integer.valueOf(1);
        double j = 1.0;
        assertEquals(j, i);
    }

    @Test
    public void testArrayAsListReturnsFixedList() {
        String[] array = new String[]{"foo", "bar"};
        List<String> list = Arrays.asList(array);
        assertThrows(UnsupportedOperationException.class, () -> {
            list.add("fizz");
        });
    }

}
