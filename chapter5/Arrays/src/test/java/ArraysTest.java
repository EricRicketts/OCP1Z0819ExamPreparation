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

}
