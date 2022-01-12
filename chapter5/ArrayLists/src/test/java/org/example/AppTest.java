package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    ArrayList<String> list;
    @BeforeEach
    public void setUp() {
        String[] temp = new String[]{"blue jay", "cardinal", "hawk", "robin"};
        list = new ArrayList<>(Arrays.asList(temp));
    }

    @Test
    public void testObjectArrayListsCanHaveDifferentTypes() {
        List tempList = Arrays.asList(new Object[]{"foo", Boolean.TRUE});
        ArrayList expected = new ArrayList(tempList);
        ArrayList list = new ArrayList<>();
        list.add("foo");
        list.add(Boolean.TRUE);

        assertEquals(expected, list);
    }

    @Test
    public void testAddElementsToArrayList() {
        ArrayList<String> results = new ArrayList<>();
        results.add("hawk");
        results.add(1, "robin");
        results.add(0, "blue jay");
        results.add(1, "cardinal");

        assertEquals(list, results);
    }

    @Test
    public void testArrayListRemoveByIndex() {
        String[] expected = new String[]{"blue jay", "hawk"};
        String[] results = new String[2];
        results[0] = list.remove(0);
        results[1] = list.remove(1);

        assertArrayEquals(expected, results);
    }

    @Test
    public void testArrayListRemoveByObject() {
        Boolean results = list.remove("hawk");
        assertEquals(true, (boolean) results);
    }

    @Test
    public void testArrayListGet() {
        assertEquals("cardinal", list.get(1));
    }

    @Test
    public void testArrayListSet() {
        String[] expected = new String[]{"blue jay", "eagle", "hawk", "robin"};
        list.set(1, "eagle");
        assertArrayEquals(expected, list.toArray());
    }

    @Test
    public void testArrayListContains() {
        assertEquals(true, (boolean)list.contains("hawk"));
    }

    @Test
    public void testArrayListEquals() {
        ArrayList<String> results = new ArrayList<>();
        results.add("blue jay");
        results.add("cardinal");
        results.add("hawk");
        results.add("robin");

        assertEquals(true, (boolean)list.equals(results));
    }
}
