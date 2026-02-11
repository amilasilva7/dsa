package org.ostech.dsa.chanllanges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IndexOfFirstOccurrenceTest {

    @Test
    void indexOfFirstOccurrence() {
        assertEquals(0, IndexOfFirstOccurrence.indexOfFirstOccurrence("sadbutsad", "sad"));
        assertEquals(-1, IndexOfFirstOccurrence.indexOfFirstOccurrence("leetcode", "leeto"));
        assertEquals(-1, IndexOfFirstOccurrence.indexOfFirstOccurrence("", "sad"));
        assertEquals(-1, IndexOfFirstOccurrence.indexOfFirstOccurrence("leetcode", ""));
        assertEquals(-1, IndexOfFirstOccurrence.indexOfFirstOccurrence("", ""));
        assertEquals(0, IndexOfFirstOccurrence.indexOfFirstOccurrence("a", "a"));
    }

}
