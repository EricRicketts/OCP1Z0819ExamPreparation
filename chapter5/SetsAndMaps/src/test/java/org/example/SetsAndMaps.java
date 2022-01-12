package org.example;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class SetsAndMaps
{
    @Test
    public void testAddToSetNoDuplicates() {
        Set<Integer> set = new HashSet<>();
        boolean[] expected = {true, false};
        boolean[] results = new boolean[]{set.add(66), set.add(66)};

        assertArrayEquals(expected, results);
    }

    @Test
    public void testAddToAMap() {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("ant", "leaf");

        assertEquals(2, map.size());
    }

    @Test
    public void testGetValueFromMap() {
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("ant", "leaf");

        assertEquals("bamboo", map.get("koala"));
    }

}
