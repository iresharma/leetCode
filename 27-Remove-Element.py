# Author: @Iresharma
# https://leetcode.com/problems/27-Remove-Element/

"""
Runtime: 28 ms, faster than 91.90% of Python3 online submissions for Remove Element.
Memory Usage: 14.3 MB, less than 12.32% of Python3 online submissions for Remove Element.
"""

class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        for i in range(nums.count(val)):
            nums.remove(val)