package org.ostech.dsa.chanllanges;


public class Palindrome {
    /*
     *
     * Given a String x, return true if x is a palindrome, and false otherwise.
     *
     * */
    public static boolean isPalindromeString(String text) {
        int length = text.length();
        if (length == 0) return false;
        int left = 0;
        int right = length - 1;

        while (left <= right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /*
     *
     * Given an integer x, return true if x is a palindrome, and false otherwise.
     *
     * */
    public static boolean isPalindromeInteger(int number) {
        if (number < 0 || (number % 10 == 0 && number != 0)) return false;
        int reverseHalf = 0;
        while (number > reverseHalf) {
            reverseHalf = reverseHalf * 10 + number % 10;//123
            number /= 10;
        }
        return reverseHalf == number || reverseHalf / 10 == number;
    }

}
