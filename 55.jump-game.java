/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length-1;
        
        for(int i = nums.length-2 ; i >=0 ; i--){
            
            if(i+nums[i] >= n ) n = i;
        }
        
        return n == 0;
    }
}
// @lc code=end


