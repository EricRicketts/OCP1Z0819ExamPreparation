package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    Chicken chicken;
    @BeforeEach
    void setUp() {
        chicken = new Chicken();
    }

    @Test
    void getName() {
        assertEquals("Duke", chicken.getName());
    }

    @Test
    void getNumberOfEggs() {
        assertEquals(12, chicken.getNumberOfEggs());
    }

    @Test
    void setName() {
        chicken.setName("Daisy");
        assertEquals("Daisy", chicken.getName());
    }

    @Test
    void setNumberOfEggs() {
        chicken.setNumberOfEggs(24);
        assertEquals(24, chicken.getNumberOfEggs());
    }
}