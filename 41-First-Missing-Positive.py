# Author: @Iresharma
# https://leetcode.com/problems/First-Missing-Positive/

"""
Runtime: 756 ms, faster than 49.05% of Python3 online submissions for First Missing Positive.
Memory Usage: 69.2 MB, less than 10.77% of Python3 online submissions for First Missing Positive.
"""

from bisect import bisect_left

class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        nums = sorted(list(set(nums)))
        currMin = 1
        size = len(nums)
        index1 = bisect_left(nums, 1)
        if index1 == size or nums[index1] != 1:
            return 1
        maxVal = nums[size - 1]
        if maxVal == size - index1:
            return maxVal + 1
        for i in range(index1, size):
            if nums[i] > currMin:
                return currMin
            currMin += 1
        return currMin