/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
import java.util.HashSet;
class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> zeroesI = new HashSet<Integer>();
        HashSet<Integer> zeroesJ = new HashSet<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    zeroesI.add(i);
                    zeroesJ.add(j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(zeroesJ.contains(j) || zeroesI.contains(i)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
// @lc code=end
