# Author: @Iresharma
# https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

"""
Runtime: 64 ms, faster than 70.60% of Python3 online submissions for How Many Numbers Are Smaller Than the Current Number.
Memory Usage: 14.5 MB, less than 12.28% of Python3 online submissions for How Many Numbers Are Smaller Than the Current Number.
"""

class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        seq = sorted(nums)
        print(seq)
        ret = []
        for i in nums:
            ret.append(seq.index(i))
        return ret