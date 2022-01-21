package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;;

public class AppTest {

    Bird bird;
    Stork stork;
    AnotherStork anotherStork;
    Panda panda;
    @BeforeEach
    public void setUp() {
        bird = new Bird("Tweety");
        stork = new Stork("Sam");
        anotherStork = new AnotherStork("Steve");
        panda = new Panda();
    }

    @Test
    public void testOverrideInStork() {
        String[] expected = new String[]{"Tweety", "Sam Stork"};
        String[] results = new String[]{bird.getName(), stork.getName()};

        assertArrayEquals(expected, results);
    }

    @Test
    public void testAbstractClassBird() {
        assertEquals("Steve", anotherStork.returnName());
    }

    @Test
    public void testAbstractBearClassConstructorCalled() {
        String[] expected = new String[]{"medium", "yummy"};
        String[] results = new String[]{panda.getPawSize(), panda.chew()};

        assertArrayEquals(expected, results);
    }
}
