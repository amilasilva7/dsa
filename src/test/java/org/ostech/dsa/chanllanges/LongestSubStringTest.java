package org.ostech.dsa.chanllanges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubStringTest {

    @Test
    void lengthOfLongestSubstring() {
        assertEquals(3, LongestSubString.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, LongestSubString.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, LongestSubString.lengthOfLongestSubstring("pwwkew"));
        assertEquals(2, LongestSubString.lengthOfLongestSubstring("au"));
        assertEquals(1, LongestSubString.lengthOfLongestSubstring(" "));
    }
}
