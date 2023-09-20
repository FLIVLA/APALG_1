package foursum;

import org.junit.Test;
import static org.junit.Assert.*;

public class FourSumTest {

    @Test
    public void testFourSum_Quartic() {
        // No quadruplet summing to zero
        assertNull(FourSum.fourSum_Quartic(new int[] { 1, 2, 3, 4 }));

        // Single quadruplet summing to zero
        assertArrayEquals(new int[] { -1, -2, 2, 1 }, FourSum.fourSum_Quartic(new int[] { -1, -2, 2, 1 }));

        // Multiple quadruplets summing to zero
        assertArrayEquals(new int[] { -1, 0, 2, -1 }, FourSum.fourSum_Quartic(new int[] { -1, 0, 1, 2, -1, -4 }));

        // Fewer than 4 integers in the list
        assertNull(FourSum.fourSum_Quartic(new int[] { 1, 2, 3 }));

        // Empty list
        assertNull(FourSum.fourSum_Quartic(new int[] {}));

        // All integers are distinct
        assertArrayEquals(new int[] { -1, -2, 1, 2 }, FourSum.fourSum_Quartic(new int[] { -1, -2, 1, 2 }));

        // Several equal integers
        assertArrayEquals(new int[] { 0, 0, 0, 0 }, FourSum.fourSum_Quartic(new int[] { 0, 0, 0, 0 }));
    }

    @Test
    public void testFourSum_Cubic() {
        // No quadruplet summing to zero
        assertNull(FourSum.fourSum_Cubic(new int[] { 1, 2, 3, 4 }));

        // Single quadruplet summing to zero
        assertArrayEquals(new int[] { -2, -1, 1, 2 }, FourSum.fourSum_Cubic(new int[] { -1, -2, 2, 1 }));

        // Multiple quadruplets summing to zero
        assertArrayEquals(new int[] { -1, -1, 0, 2 }, FourSum.fourSum_Cubic(new int[] { -1, 0, 1, 2, -1, -4 }));

        // Fewer than 4 integers in the list
        assertNull(FourSum.fourSum_Cubic(new int[] { 1, 2, 3 }));

        // Empty list
        assertNull(FourSum.fourSum_Cubic(new int[] {}));

        // All integers are distinct
        assertArrayEquals(new int[] { -2, -1, 1, 2 }, FourSum.fourSum_Cubic(new int[] { -1, -2, 1, 2 }));

        //  Several equal integers
        assertArrayEquals(new int[] { 0, 0, 0, 0 }, FourSum.fourSum_Cubic(new int[] { 0, 0, 0, 0 }));
    }

    @Test
    public void testFourSum_HashMap() {
        // No quadruplet summing to zeo
        assertNull(FourSum.fourSum_HashMap(new int[] { 1, 2, 3, 4 }));

        // Single quadruplet summing to zero
        assertArrayEquals(new int[] { 1, 2, -2, -1 }, FourSum.fourSum_HashMap(new int[] { 1, 2, -2, -1 }));

        // Multiple quadruplets summing to zero
        assertArrayEquals(new int[] { -1, 0, 2, -1 }, FourSum.fourSum_HashMap(new int[] { -1, 0, 1, 2, -1, -4 }));

        // Fewer than 4 integers in the list
        assertNull(FourSum.fourSum_HashMap(new int[] { 1, 2, 3 }));

        // Empty list
        assertNull(FourSum.fourSum_HashMap(new int[] {}));

        // All integers are distinct
        assertArrayEquals(new int[] { -1, -2, 1, 2 }, FourSum.fourSum_HashMap(new int[] { -1, -2, 1, 2 }));

        // Several equal integers
        assertArrayEquals(new int[] { 0, 0, 0, 0 }, FourSum.fourSum_HashMap(new int[] { 0, 0, 0, 0 }));
    }
}
