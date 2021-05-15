# Author: @Iresharma
# https://leetcode.com/problems/two-sum/

"""
Runtime: 36 ms, faster than 98.81% of Python3 online submissions for Two Sum.
Memory Usage: 14.3 MB, less than 90.10% of Python3 online submissions for Two Sum.
"""

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
                        return ret
                else:
                    ret = [nums.index(i), found]
                    return ret
            except ValueError:
                continue