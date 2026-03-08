package org.ostech.dsa.chanllanges.round1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthOfLastWordTest {

    @Test
    void lengthOfLastWord() {
        assertEquals(5, LengthOfLastWord.lengthOfLastWord("Amila Silva"));
    }

    @Test
    void lengthOfLastWord_with_multiple_spaces() {
        assertEquals(2, LengthOfLastWord.lengthOfLastWord("Amila   Silva     os"));
    }

    @Test
    void lengthOfLastWord_with_spaces_at_the_end() {
        assertEquals(5, LengthOfLastWord.lengthOfLastWord("Amila   Silva     "));
    }

    @Test
    void lengthOfLastWord_with_only_spaces() {
        assertEquals(0, LengthOfLastWord.lengthOfLastWord("     "));
    }

    @Test
    void lengthOfLastWord_with_empty_literals() {
        assertEquals(0, LengthOfLastWord.lengthOfLastWord(""));
    }
}
