/*
 * @lc app=leetcode id=84 lang=java
 *
 * [84] Largest Rectangle in Histogram
 */

// @lc code=start
import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] leftLimits = new int[heights.length];
        int[] rightLimits = new int[heights.length];
        
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        leftLimits[0]=0;
        
        for(int i=1;i<heights.length;i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                leftLimits[i] = stack.pop();
            }
            leftLimits[i]= stack.isEmpty()?0:stack.peek()+1;
            stack.push(i);
        }
        
        stack.clear();
        stack.push(heights.length-1);
        
        rightLimits[heights.length-1]=heights.length-1;
        
        for(int i=heights.length-2;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                rightLimits[i] = stack.pop();
            }
            rightLimits[i] = stack.isEmpty()?heights.length-1:stack.peek()-1;
            stack.push(i);
        }
        
        int maxArea = 0;
        for(int i=0;i<heights.length;i++){
            int area = heights[i] * (rightLimits[i] - leftLimits[i] + 1);
            maxArea = Math.max(maxArea,area);
        }
        
        return maxArea;
    }
}
// @lc code=end

