package org.ostech.dsa.chanllanges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverse() {
        assertEquals("alimA", ReverseString.reverse("Amila"));
    }

    @Test
    void reverseCharArray() {
        assertArrayEquals((new char[]{'a', 'l', 'i', 'm', 'A'}), ReverseString.reverseCharArray(new char[]{'A', 'm', 'i', 'l', 'a'}));
    }
}
