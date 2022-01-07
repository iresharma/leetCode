/*
 * @lc app=leetcode id=240 lang=java
 *
 * [240] Search a 2D Matrix II
 */

// @lc code=start
class Solution {
    public boolean binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        int mid = (l+r)/2;
        while(l < r) {
            if(arr[mid] == target)
                return true;
            else if(arr[mid] < target) {
                l = mid;
                mid = (l+r)/2;
            }
            else {
                r = mid;
                mid = (l+r)/2;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int last = matrix[0].length - 1;
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][last] >= target)
                return binarySearch(matrix[i], target);
        }
        return false;
    }
}
// @lc code=end

