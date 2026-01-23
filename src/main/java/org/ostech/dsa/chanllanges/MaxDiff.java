package org.ostech.dsa.chanllanges;

public class MaxDiff {
    public static int findMaxDifference(int[] ints) {
        //1,2,3,4,5,6
        int max = 0;
        int min = ints[0];

        for (int i = 0; i < ints.length; i++) {
            min = Math.min(min, ints[i]);
            max = Math.max(max, ints[i]);
        }
        return max - min;
    }
}
