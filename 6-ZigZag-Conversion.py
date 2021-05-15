# Author: @Iresharma
# https://leetcode.com/problems/zigzag-conversion/


"""
Runtime: 56 ms, faster than 76.58% of Python3 online submissions for ZigZag Conversion.
Memory Usage: 14.4 MB, less than 69.12% of Python3 online submissions for ZigZag Conversion.
"""

class Solution:
    def convert(self, s: str, numRows: int) -> str:
        finalMat = [[] for x in range(min(len(s), numRows))]
        curRow = 0
        down = False
        for i in s:
            finalMat[curRow].append(i)
            if curRow == 0 or curRow == numRows - 1:
                down = not down
            curRow += 1 if down else -1
        return "".join(list(map(lambda x: "".join(x), finalMat)))