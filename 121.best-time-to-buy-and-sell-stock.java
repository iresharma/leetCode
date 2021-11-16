/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
import java.util.Stack;
class Solution {
    public int maxProfit(int[] prices) {
        int[] rightLimits = new int[prices.length];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(prices.length-1);
        
        rightLimits[prices.length-1]=prices.length-1;
        
        for(int i=prices.length-2;i>=0;i--){
            int prev = 0;
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]) {
                if(stack.peek() != i && prices[stack.peek()] > prev) {
                    prev = prices[stack.peek()];
                    rightLimits[i] = stack.pop();
                }
            }
            rightLimits[i] = stack.isEmpty()?prices.length-1:stack.peek()-1;
            stack.push(i);
        }
        for (Integer integer : rightLimits) {
            System.out.println(integer);
        }
        int max = 0;
        for (int integer = 0; integer < prices.length; integer++) {
            max = Math.max(max, prices[rightLimits[integer]] - prices[integer]);
        }
        return max;
    }
}
// @lc code=end

