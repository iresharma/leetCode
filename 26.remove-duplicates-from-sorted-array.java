/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
import java.util.LinkedHashSet;
class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int integer = nums.length - 1; integer >= 0; integer--) {
            set.add(nums[integer]);
        }
        int k = 0;
        for (int integer : set) {
            nums[set.size() - 1 - k] = integer;
            k++;
        }
        return set.size();
    }
}
// @lc code=end

