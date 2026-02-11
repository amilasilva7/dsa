package org.ostech.dsa.chanllanges;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static String removeDuplicateCharacters(String text) {
        if (text.length() == 0) return "";
        StringBuilder stringBuilder = new StringBuilder();

        Set<Character> seen = new LinkedHashSet<>();
        for (char c : text.toCharArray()) {
            if (seen.add(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
