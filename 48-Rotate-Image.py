# Author: @Iresharma
# https://leetcode.com/problems/48-Rotate-Image/

"""
Runtime: 32 ms, faster than 84.31% of Python3 online submissions for Rotate Image.
Memory Usage: 14.1 MB, less than 82.91% of Python3 online submissions for Rotate Image.
"""

class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        tups = []
        n = len(matrix)
        for i in range(n):
            for j in range(i+1, n):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
            matrix[i] = matrix[i][::-1]