package org.ostech.dsa.chanllanges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindromeString() {
        assertEquals(true, Palindrome.isPalindromeString("121"));
        assertEquals(true, Palindrome.isPalindromeString("12221"));
        assertEquals(false, Palindrome.isPalindromeString("121221"));
        assertEquals(false, Palindrome.isPalindromeString("werwe"));
        assertEquals(false, Palindrome.isPalindromeString("-121"));
        assertEquals(false, Palindrome.isPalindromeString("10"));
    }

    @Test
    void isPalindromeInteger() {
        assertEquals(true, Palindrome.isPalindromeInteger(121));
        assertEquals(true, Palindrome.isPalindromeInteger(12221));
        assertEquals(false, Palindrome.isPalindromeInteger(121221));
        assertEquals(true, Palindrome.isPalindromeInteger(11111));
        assertEquals(false, Palindrome.isPalindromeInteger(-121));
        assertEquals(false, Palindrome.isPalindromeInteger(10));
    }
}
