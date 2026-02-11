package org.ostech.dsa.chanllanges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FindSecondHighestOfTheArrayTest {

    @Test
    void findSecondHighestOfTheArrayNew_SameValues() {
        assertThrows(IllegalArgumentException.class, () -> {
            FindSecondHighestOfTheArray.findSecondHighestOfTheArrayNew(new int[]{2, 2, 2, 2, 2, 2});
        });
    }

    @Test
    void findSecondHighestOfTheArrayNew_LessThanTwoItems() {
        assertThrows(IllegalArgumentException.class, () -> {
            FindSecondHighestOfTheArray.findSecondHighestOfTheArrayNew(new int[]{1});
        });
    }

    @Test
    void findSecondHighestOfTheArrayNew_Success() {
        assertEquals(8, FindSecondHighestOfTheArray.findSecondHighestOfTheArrayNew(new int[]{9, 1, 2, 3, 4, 8, 5, 6, 7}));
        assertEquals(1, FindSecondHighestOfTheArray.findSecondHighestOfTheArrayNew(new int[]{1, 2}));
    }
}
