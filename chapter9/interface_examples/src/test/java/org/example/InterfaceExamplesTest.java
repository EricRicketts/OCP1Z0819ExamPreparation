package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterfaceExamplesTest
{

    UsingSoar usingSoar;
    @BeforeEach
    public void setUp() {
        usingSoar = new UsingSoar();
    }

    @Test
    public void testFlyInUsingSoar() {
        assertEquals(5, usingSoar.fly(5));
    }

    @Test
    public void testSoarConstantMaxHeight() {
        assertEquals(10, Soar.MAX_HEIGHT);
    }
}
