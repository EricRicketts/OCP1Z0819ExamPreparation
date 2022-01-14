package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class LambdaApis {

    List<String> bunnies;
    @BeforeEach
    public void setUp() {
        bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
    }

    @Test
    public void testRemoveIf()        {
        int[] expected = {3, 2};
        int[] results = new int[2];
        results[0] = bunnies.size();
        bunnies.removeIf(s -> s.substring(0, 2).equals("lo"));
        results[1] = bunnies.size();
        assertArrayEquals(expected, results);
    }

    @Test
    public void testSort() {
        String[] expected = {"floppy", "hoppy", "long ear"};
        bunnies.sort((b1, b2) -> b1.compareTo(b2));
        assertArrayEquals(expected, bunnies.toArray());
    }

    @Test
    public void testForEach() {
         List<String> results = new ArrayList<>();
         bunnies.forEach( b -> results.add(b));
         assertEquals(bunnies, results);
    }

}
