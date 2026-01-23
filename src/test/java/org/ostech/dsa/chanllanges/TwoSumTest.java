package org.ostech.dsa.chanllanges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        assertEquals(TwoSum.twoSum(new int[] {2,7,11,15}, 9)[0], 0);
        assertEquals(TwoSum.twoSum(new int[] {2,7,11,15}, 9)[1], 1);

        assertEquals(TwoSum.twoSum(new int[] {2,17,11,15}, 26)[0], 2);
        assertEquals(TwoSum.twoSum(new int[] {2,17,11,15}, 26)[1], 3);

        assertEquals(TwoSum.twoSum(new int[] {12,7,11,5}, 18)[0], 1);
        assertEquals(TwoSum.twoSum(new int[] {12,7,11,5}, 18)[1], 2);
    }
}
