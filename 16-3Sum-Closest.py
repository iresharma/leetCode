# Author: @Iresharma
# https://leetcode.com/problems/16-3Sum-Closest/

"""
Runtime: 116 ms, faster than 83.53% of Python3 online submissions for 3Sum Closest.
Memory Usage: 14.4 MB, less than 40.48% of Python3 online submissions for 3Sum Closest.
"""

class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        diff = float('inf')
        lNums = len(nums)
        nums.sort()
        for i in range(lNums):
            lo, hi = i + 1, lNums - 1
            while lo < hi:
                sum = nums[i] + nums[lo] + nums[hi]
                if abs(target - sum) < abs(diff):
                    diff = target - sum
                if sum < target:
                    lo += 1
                else:
                    hi -= 1
            if diff == 0:
                break
        return target - diff