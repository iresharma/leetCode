/*
 * @lc app=leetcode id=239 lang=java
 *
 * [239] Sliding Window Maximum
 */

// @lc code=start
import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque
            = new LinkedList<Integer>();
            int count = k;
        ArrayList<Integer> ret = new ArrayList<Integer>();
        deque.addFirst(nums[0]);
        for(int i = 1; i < k; i++) {
            deque.addLast(nums[i]);
        }
        int max = Integer.MIN_VALUE;
        while(count != nums.length) {
            for(int i: deque) {
                if(i >= max) {
                    max = i;
                }
            }
            ret.add(max);
            max = Integer.MIN_VALUE;
            deque.removeFirst();
            deque.addLast(nums[count]);
            count++;
        }
        for(int i: deque) {
            if(i >= max) {
                max = i;
            }
        }
        ret.add(max);
        return ret.stream().mapToInt(i -> i).toArray();
    }
}
// @lc code=end

