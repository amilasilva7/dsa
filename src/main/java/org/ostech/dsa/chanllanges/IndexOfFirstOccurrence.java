package org.ostech.dsa.chanllanges;

public class IndexOfFirstOccurrence {
    public static int indexOfFirstOccurrence(String haystack, String needle) {
        if(haystack.length()==0 || needle.length()==0) return -1;
        //sadbutsad -> sad
        int right = needle.length();

        for(int left = 0; left<=haystack.length()-needle.length();left++) {
            if(haystack.substring(left, right).equals(needle)) {
                return left;
            }
            right++;
        }
        return -1;
    }
}
