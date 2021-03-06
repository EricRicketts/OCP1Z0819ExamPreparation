package org.example;

import java.util.Locale;
import java.util.function.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple App.
 */
public class AppTest {

    String str, str1, str2, str3;
    StringBuilder strBuilder;
    @BeforeEach
    public void setUp() {
        str = "animals";
        strBuilder = new StringBuilder("animals");
        str1 = "rat" + 1;
        str2 = "r" + "a" + "t" + "1";
        str3 = "r" + "a" + "t" + new String("1");
    }

    @Test
    public void testStringLength() {
        assertEquals(7, str.length());
    }

    @Test
    public void testCharAt() {
        assertEquals('i', str.charAt(2));
    }

    @Test
    public void testStringIndexOutOfBounds() {
        Exception thrown = Assertions.assertThrows(StringIndexOutOfBoundsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                str.charAt(7);
            }
        });
    }

    @Test
    public void testStringIndexOutOfBoundsLambda() {
        StringIndexOutOfBoundsException thrown = Assertions.assertThrows(StringIndexOutOfBoundsException.class, () -> {
            str.charAt(7);
        });
    }

    @Test
    public void testIndexOf() {
        int[] expected = new int[]{0, 4, 4};
        int[] results = new int[]{str.indexOf('a'), str.indexOf('a', 3),
                str.indexOf("al", 3)};

        assertArrayEquals(expected, results);
    }

    @Test
    public void voidIndexOfNotFound() {
        assertEquals(str.indexOf('z'), -1);
    }

    @Test
    public void testBasicSubStringOperations() {
        String[] expected = new String[]{"mals", "m", "mals", ""};
        String[] results = new String[]{str.substring(3), str.substring(3, 4),
                str.substring(3, 7), str.substring(3,3)};

        assertArrayEquals(expected, results);
    }

    @Test
    public void testUpperAndLowerCase() {
        String[] expected = new String[]{"ABC", "abc"};
        String[] results = new String[]{"abc".toUpperCase(), "ABC".toLowerCase()};

        assertArrayEquals(expected, results);
    }

    @Test
    public void testEqualsAndEqualsIgnoreCase() {
        boolean[] expected = new boolean[]{true, false, true};
        boolean[] results = new boolean[]{"abc".equals("abc"), "ABC".equals("abc"),
                "ABC".equalsIgnoreCase("abc")};

        assertArrayEquals(expected, results);
    }

    @Test
    public void testStartsWithAndEndsWith() {
        boolean[] expected = new boolean[]{true, true};
        boolean[] results = new boolean[]{"FooBar".startsWith("Foo"), "FooBar".endsWith("r")};

        assertArrayEquals(expected, results);
    }

    @Test
    public void testReplace() {
        assertEquals("FbcBar", "FooBar".replace("oo", "bc"));
    }

    @Test
    public void testContains() {
        assertTrue("FooBarFizzBuzz".contains("iz"));
    }

    @Test
    public void stripWhiteSpace() {
        String str = "\t abc \n";
        int[] expected = new int[]{3, 5, 5};
        String str1 = str.strip(), str2 = str.stripLeading(), str3 = str.stripTrailing();
        int[] results = new int[]{str1.length(), str2.length(), str3.length()};

        assertArrayEquals(expected, results);
    }

    @Test
    public void testStringBuilderMutableObjects() {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b.append("f").append("g");
        assertEquals(a, b);
        assertEquals("abcdefg", b.toString());
    }

    @Test
    public void testInsert() {
        strBuilder.insert(4, "-");

        assertEquals("anim-als", strBuilder.toString());
    }

    @Test
    public void testDeleteDeleteCharAtForStringBuilder() {
        String[] expected = new String[]{"anals", "anas"};
        String[] results = new String[]{strBuilder.delete(2, 4).toString(), strBuilder.deleteCharAt(3).toString()};

        assertArrayEquals(expected, results);
    }

    @Test
    public void testReplaceForStringBuilder() {
        String expected = "pigsty dirty";
        StringBuilder strB = new StringBuilder("pigeon dirty");
        strB.replace(3, 6, "sty");

        assertEquals(expected, strB.toString());
    }

    @Test
    public void testDoubleEqualsForString() {
        boolean[] expected = new boolean[]{true, true};
        String x = "foo";
        String y = "foo";
        // they are equal (==) here because x and y point to the same object in the String pool
        boolean[] results = new boolean[]{x == y, x.equals(y)};

        assertArrayEquals(expected, results);
    }

    @Test
    public void testEqualityForStringBuilder() {
        boolean[] expected = new boolean[]{false, true};
        StringBuilder x = new StringBuilder("foo");
        StringBuilder y = new StringBuilder("foo");
        boolean[] results = new boolean[]{x == y, x.toString().equals(y.toString())};

        assertArrayEquals(expected, results);
    }

    @Test
    public void testStringPool() {
        boolean[] expected = new boolean[]{true, true, false, true};
        boolean[] results = new boolean[]{str1 == str2, str1 == str2.intern(), str2 == str3, str2 == str3.intern()};

        assertArrayEquals(expected, results);
    }
}
