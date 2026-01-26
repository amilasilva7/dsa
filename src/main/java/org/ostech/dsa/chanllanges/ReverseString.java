package org.ostech.dsa.chanllanges;

public class ReverseString {
    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char temp = s.charAt(left);
            arr[left++] = s.charAt(right);
            arr[right--] = temp;
        }
        return new String(arr);
    }

    public static char[] reverseCharArray(char[] s) {
        char[] arr = s;
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            arr[left++] = s[right];
            arr[right--] = temp;
        }
        return arr;
    }
}
