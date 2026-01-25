package org.ostech.dsa.chanllanges;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        if (arr.length == 0) return -1;
        //0123456789
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println(mid);
            if (target == arr[mid]) {
                return mid;
            }
            if (arr[mid] > target) {
                right = mid - 1;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }
}

