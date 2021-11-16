/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0, ones = 0, twos = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) zeros++;
            else if (nums[i] == 1) ones++;
            else twos++;
        }
        int key = 0;
        while (zeros > 0) {
            nums[key] = 0;
            zeros--;
            key++;
        }
        while (ones > 0) {
            nums[key] = 1;
            ones--;
            key++;
        }
        while (twos > 0) {
            nums[key] = 2;
            twos--;
            key++;
        }
    }
}
// @lc code=end

