package threesum;

import org.junit.Test;
import static org.junit.Assert.*;
import threesum.ThreeSum;

public class ThreeSumTest {
    
    @Test 
    public void testCubic() {
        assertNull(ThreeSum.threeSum_Cubic(
            new int [] { 1, 2, 3 }
        ));
        assertNotNull(ThreeSum.threeSum_Cubic(
            new int [] { 1, 2, -3 }
        ));
        assertArrayEquals(new int[] { 1, 2, -3 },
           ThreeSum.threeSum_Cubic(new int [] { 
               1, 2, -3 
           })
        );
    }

}
