package org.ostech.dsa.chanllanges.round1;

public class SwapTwoVariables {
    public static String swapTwoNumberWithoutThirdVariable(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return a + " | " + b;
    }
}
