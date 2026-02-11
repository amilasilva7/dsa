package org.ostech.dsa.chanllanges;

public class FindSecondHighestOfTheArray {

    public static int findSecondHighestOfTheArrayNew(int[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("Array should have at least two items");

        int highest = Integer.MIN_VALUE;
        int secondHeight = Integer.MIN_VALUE;

        for (int element : arr) {
            if (element > highest) {
                secondHeight = highest;
                highest = element;
            } else if (element > secondHeight && highest != element) {
                secondHeight = element;
            }
        }
        if (secondHeight == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second highest number");
        }

        return secondHeight;
    }
}
