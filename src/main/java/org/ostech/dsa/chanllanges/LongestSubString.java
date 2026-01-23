package org.ostech.dsa.chanllanges;

import java.util.HashMap;

public class LongestSubString {
    /*
     * Given a string s, find the length of the longest substring without duplicate characters.
     * */
    public static int lengthOfLongestSubstring(String text) {
        int longest = 0;
        if (text.length() == 0) return longest;
        //pwwkew
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < text.length(); right++) {
            char c = text.charAt(right);
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, right);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
