package org.ostech.dsa.chanllanges.round1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AddBinaryTest {

    @Test
    void addBinary_valid() {
        assertEquals("100", AddBinary.addBinary("11", "1"));
        assertEquals("10101", AddBinary.addBinary("1010", "1011"));
    }

    @Test
    void addBinary_with_zero() {
        assertEquals("0", AddBinary.addBinary("0", "0"));
        assertEquals("1", AddBinary.addBinary("0", "1"));
        assertEquals("1", AddBinary.addBinary("1", "0"));
    }

    @Test
    void addBinary_with_one_param_empty() {
        assertEquals("1", AddBinary.addBinary("", "1"));
        assertEquals("0", AddBinary.addBinary("0", ""));
        assertEquals("101", AddBinary.addBinary("101", ""));
    }

    @Test
    void addBinary_with_all_params_empty() {
        assertThrows(RuntimeException.class, () -> AddBinary.addBinary("", ""));
    }
}