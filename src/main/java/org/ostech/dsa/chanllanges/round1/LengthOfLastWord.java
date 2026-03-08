package org.ostech.dsa.chanllanges.round1;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String text) {
        int length = 0;
        int i = text.length() - 1;

        while (i >= 0 && text.charAt(i) == ' ') {
            i--;
        }

        while (i > 0 && text.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
