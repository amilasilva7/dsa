package org.ostech.dsa.chanllanges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapTwoVariablesTest {

    @Test
    void swapTwoNumberWithoutThirdVariable() {
        assertEquals("20 | 10", SwapTwoVariables.swapTwoNumberWithoutThirdVariable(10, 20));
        assertEquals("7 | 19", SwapTwoVariables.swapTwoNumberWithoutThirdVariable(19, 7));
    }
}
