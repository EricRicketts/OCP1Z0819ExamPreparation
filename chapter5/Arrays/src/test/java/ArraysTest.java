import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysTest {

    @Test
    public void testInitializeIntArray() {
        int[] arr = new int[3];
        for (int i:arr) {
            assertEquals(0, i);
        }
    }

    @Test
    public void testSortArrays() {
        int[] arr1 = {6, 9, 1};
        char[] arr2 = {'c', 'a', 'b'};
        int[] expectedInts = new int[]{1, 6, 9};
        char[] expectedChars = new char[]{'a', 'b', 'c'};
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        assertArrayEquals(expectedInts, arr1);
        assertArrayEquals(expectedChars, arr2);
    }

    @Test
    public void testCompareNumericArrays() {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {1, 2, 3};

        assertTrue(Arrays.compare(arr1, arr2) == 0);
        assertTrue(Arrays.compare(arr1, arr3) < 0);
        assertTrue(Arrays.compare(arr2, arr4) > 0);
    }

    @Test
    public void testCompareStringsAndCharacters() {
        char[] arr1 = {'a'};
        char[] arr2 = {'A'};
        String[] arr3 = {"a"};
        String[] arr4 = {"aa"};

        assertTrue(Arrays.compare(arr1, arr2) > 0);
        assertTrue(Arrays.compare(arr3, arr4) < 0);
    }

    @Test
    public void testArrayMismatch() {
        int[] arr1 = {1, 3, 4};
        int[] arr2 = {1, 3, 5};

        assertEquals(2, Arrays.mismatch(arr1, arr2));
    }
}
