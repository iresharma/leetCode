# Author: @Iresharma
# https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

"""
Runtime: 20 ms, faster than 99.01% of Python3 online submissions for Number of Steps to Reduce a Number to Zero.
Memory Usage: 14.2 MB, less than 34.79% of Python3 online submissions for Number of Steps to Reduce a Number to Zero.
"""


class Solution:
    def numberOfSteps(self, num: int) -> int:
        count = 0
        if num%2 == 1:
            num -= 1
            count += 1
        while num != 0:
            count += 1
            num /= 2
            if num%2 == 1:
                num -= 1
                count += 1
        return count