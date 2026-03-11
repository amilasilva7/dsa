package org.ostech.dsa.chanllanges.round1;

public class AddBinary {
    public static String addBinary(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) throw new RuntimeException();
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int total = carry;
            if (i >= 0) total += a.charAt(i--) - '0';
            if (j >= 0) total += b.charAt(j--) - '0';
            carry = total / 2;
            result.append(total % 2);
        }
        return result.reverse().toString();
    }
}