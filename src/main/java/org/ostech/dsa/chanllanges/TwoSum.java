package org.ostech.dsa.chanllanges;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 0) return new int[]{};

        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int due = target - nums[i];
            if (map.containsKey(due)) {
                return new int[]{map.get(due), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
