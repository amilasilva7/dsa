package org.ostech.dsa.chanllanges;

import org.junit.jupiter.api.Test;
import org.ostech.dsa.chanllanges.round1.RemoveDuplicates;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicateCharacters() {
        assertEquals("amil", RemoveDuplicates.removeDuplicateCharacters("amilamli"));
        assertEquals("", RemoveDuplicates.removeDuplicateCharacters(""));
    }
}
