package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassByValueTest {

    PassByValue obj;
    @BeforeEach
    public void setUp() {
        obj = new PassByValue();
    }

    @Test
    public void testChangeANumber() {
        int num = 4;
        obj.newNumber(num);
        assertEquals(4, num);
    }

    @Test
    public void testChangeAString() {
        String s = "Webby";
        obj.speak(s);
        assertEquals("Webby", s);
    }

    @Test
    public void testAppendStringBuilder() {
        StringBuilder s = new StringBuilder("Foo");
        obj.speakAppend(s);
        assertEquals("FooWebby", s.toString());
    }

    @Test
    public void testTestIncrementNotAssigned() {
        int number = 1;
        obj.increment(number);
        assertEquals(1, number);
    }

    @Test
    public void testTestIncrementAssigned() {
        int number = 1;
        number = obj.increment(number);
        assertEquals(2, number);
    }
}
/*
    Just like Ruby Java is pass by value but when it comes to an object it is pass by value of the reference.
    For primitives Java passes in a copy of the primitive itself.  For objects, java makes a copy of the reference
    and passes that in.  So in the example of the String object a copy of the reference to the String object is made.
    Let's say the s have a value of #0xABC, then in the method speak, the method parameter s is another reference
    with value #0xABC which points to the same String object, "Webby" as the local variable s does.  Now in the method
    body the method parameter s is assigned a reference to a new value, "Sparky", so the method parameter s might
    have a new reference value #0xDEF as it points to a new String object but the local variable s outside the method
    speak is still pointing to #0xABC.

    In the case of the StringBuilder object changing this is because the method parameter s is pointing the same
    object as the local parameter s.  The append() method changes the current StringBuilder object by suffixing
    the current StringBuilder with the given argument.  So both the local parameter s and the method parameter s
    point to this modified object.
*/
