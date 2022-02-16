/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        TreeMap<Integer, Integer> counter = new TreeMap<>();
        for(int i: nums) {
            int count = 0;
            if(counter.containsKey(i)) {
                count = counter.get(i);
                counter.put(i, count + 1);
            } else {
                counter.put(i, 1);
            }
        }
        int k = 0;
        for(Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            nums[k] = entry.getKey();
            k++;
            if(entry.getValue() >= 2) {
                nums[k] = entry.getKey();
                k++;
            }
        }
        return k;
    }
}
// @lc code=end

