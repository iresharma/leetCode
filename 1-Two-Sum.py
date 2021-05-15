# Author: @Iresharma
# https://leetcode.com/problems/two-sum/

"""
Runtime: 136 ms, faster than 5.08% of Python3 online submissions for Two Sum.
Memory Usage: 14.4 MB, less than 42.26% of Python3 online submissions for Two Sum.
"""

from itertools import combinations
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in nums:
            find = target - i
            try:
                found = nums.index(find)
                if i == find:
                    if nums.count(i) > 1:
                        ret = [found]
                        nums.remove(find)
                        ret.append(nums.index(i) + 1)
                else:
                    ret = [nums.index(i), found]
            except ValueError:
                continue
        return ret