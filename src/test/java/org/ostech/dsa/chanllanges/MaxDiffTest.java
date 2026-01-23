package org.ostech.dsa.chanllanges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxDiffTest {

    @Test
    void findMaxDifference_success () {
        assertEquals(MaxDiff.findMaxDifference(new int[]{1, 2, 3, 4, 5, 6}), 5);
        assertEquals(MaxDiff.findMaxDifference(new int[]{1, 2, 3, 4, 5, 6, 9}), 8);
        assertEquals(MaxDiff.findMaxDifference(new int[]{9, 2, 3, 4, 5, 6, 1}), 8);
        assertEquals(MaxDiff.findMaxDifference(new int[]{1, 2, 2, 3, 4, 5, 6, 7}), 6);
    }
}
