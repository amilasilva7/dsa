package org.ostech.dsa.chanllanges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    @Test
    void binarySearch() {
        assertEquals(3, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 4));
        assertEquals(-1, BinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10));
        assertEquals(-1, BinarySearch.binarySearch(new int[]{}, 1));
        assertEquals(9, BinarySearch.binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 9));
        assertEquals(1, BinarySearch.binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 1));
    }
}
