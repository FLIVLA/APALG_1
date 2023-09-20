package threesum;

import org.junit.Test;
import static org.junit.Assert.*;
public class ThreeSumTest {
    
    @Test
    public void testThreeSum_Cubic() {
        // No triplets summing to zero
        assertNull(ThreeSum.threeSum_Cubic(new int[] { 1, 2, 3 }));
    
        // Single triplet summing to zero
        assertArrayEquals(new int[] { 1, 2, -3 }, ThreeSum.threeSum_Cubic(new int[] { 1, 2, -3 }));
    
        //Multiple triplets summing to zero
        assertArrayEquals(new int[] { -1, 0, 1 }, ThreeSum.threeSum_Cubic(new int[] { -1, 0, 1, 2, -1, -4 }));
    
        // less than 3 integers in the input
        assertNull(ThreeSum.threeSum_Cubic(new int[] { 1 }));
        
        // Empty list
        assertNull(ThreeSum.threeSum_Cubic(new int[] {}));
    
        // All integers are distinct
        assertArrayEquals(new int[] { -1, 0, 1 }, ThreeSum.threeSum_Cubic(new int[] { -1, 0, 1 }));
    
        // Several equal integers
        assertArrayEquals(new int[] { 0, 0, 0 }, ThreeSum.threeSum_Cubic(new int[] { 0, 0, 0 }));
    }

    @Test
    public void testThreeSum_Quadratic() {
        // No triplets summing to zero
        assertNull(ThreeSum.threeSum_Quadratic(new int[] { 1, 2, 3 }));

        // Single triplet summing to zero
        assertArrayEquals(new int[] { -3, 1, 2 }, ThreeSum.threeSum_Quadratic(new int[] { 1, 2, -3 }));

        // Multiple triplets summing to zero
        assertArrayEquals(new int[] { -1, -1, 2 }, ThreeSum.threeSum_Quadratic(new int[] { -1, 0, 1, 2, -1, -4 }));

        // Fewer than 3 integers in the list
        assertNull(ThreeSum.threeSum_Quadratic(new int[] { 1 }));

        // Empty list
        assertNull(ThreeSum.threeSum_Quadratic(new int[] {}));

        // All integers are distinct
        assertArrayEquals(new int[] { -1, 0, 1 }, ThreeSum.threeSum_Quadratic(new int[] { -1, 0, 1 }));

        // Several equal integers
        assertArrayEquals(new int[] { 0, 0, 0 }, ThreeSum.threeSum_Quadratic(new int[] { 0, 0, 0 }));
    }

    @Test
    public void testThreeSum_HashMap() {
        // No triplets summing to zero
        assertNull(ThreeSum.threeSum_HashMap(new int[] { 1, 2, 3 }));
    
        // Single triplet summing to zero
        assertArrayEquals(new int[] { 1, 2, -3 }, ThreeSum.threeSum_HashMap(new int[] { 1, 2, -3 }));
    
        // Multiple triplets summing to zero
        assertArrayEquals(new int[] { -1, 0, 1 }, ThreeSum.threeSum_HashMap(new int[] { -1, 0, 1, 2, -1, -4 }));
    
        // Fewer than 3 integers in the list
        assertNull(ThreeSum.threeSum_HashMap(new int[] { 1 }));
    
        // Empty list
        assertNull(ThreeSum.threeSum_HashMap(new int[] {}));
    
        // All integers are distinct
        assertArrayEquals(new int[] { -1, 0, 1 }, ThreeSum.threeSum_HashMap(new int[] { -1, 0, 1 }));
    
        // Several equal integers
        assertArrayEquals(new int[] { 0, 0, 0 }, ThreeSum.threeSum_HashMap(new int[] { 0, 0, 0 }));
    }


    // @Test
    // public void testThreeSum_HashMap_and_NoCheck() {
    //     int[] input = { 1, 2, -3, 4, 5, -9 };

    //     // original HashMap method (should pass)
    //     int[] resultOriginal = ThreeSum.threeSum_HashMap(input);
    //     assertNotNull(resultOriginal);
    //     assertEquals(3, resultOriginal.length);
    //     assertEquals(1, resultOriginal[0]);
    //     assertEquals(2, resultOriginal[1]);
    //     assertEquals(-3, resultOriginal[2]);

    //     // NoCheck HashMap method (should fail)
    //     int[] resultNoCheck = ThreeSum.threeSum_HashMap_NoCheck(input);
    //     assertNull(resultNoCheck);
    // }
}
