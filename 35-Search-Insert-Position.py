# Author: @Iresharma
# https://leetcode.com/problems/35-Search-Insert-Position/

"""
Runtime: 44 ms, faster than 91.10% of Python3 online submissions for Search Insert Position.
Memory Usage: 15.2 MB, less than 20.47% of Python3 online submissions for Search Insert Position.
"""

class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        lenN = len(nums)
        l, u = 0, lenN
        found = False
        while l < u and not found:
            mid = int((l + u)/2)
            if nums[mid] == target:
                found = True
            if nums[mid] > target:
                u = mid - 1
            else:
                l = mid + 1
        print(mid)
        if found:
            return mid
        elif target < nums[0]:
            return 0
        elif target > nums[-1]:
            return lenN
        else:
            if nums[mid] < target and len(nums) - 1 > mid and nums[mid + 1] >= target:
                return mid + 1
            else:
                for i in range(lenN):
                    if nums[i] >= target:
                        print('ret')
                        return i