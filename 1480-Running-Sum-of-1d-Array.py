# Author: @Iresharma
# https://leetcode.com/problems/running-sum-of-1d-array/submissions/

"""
Runtime: 52 ms, faster than 16.33% of Python3 online submissions for Running Sum of 1d Array.
Memory Usage: 14.5 MB, less than 10.33% of Python3 online submissions for Running Sum of 1d Array.
"""

class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        final = [nums[0]]
        for i in range(1, len(nums)):
            final.append(final[i-1] + nums[i])
        return final