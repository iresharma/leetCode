# Author: @Iresharma
# https://leetcode.com/problems/median-of-two-sorted-arrays/

"""
Runtime: 92 ms, faster than 64.08% of Python3 online submissions for Median of Two Sorted Arrays.
Memory Usage: 14.6 MB, less than 52.23% of Python3 online submissions for Median of Two Sorted Arrays.
"""

class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        final = sorted((nums1 + nums2))
        newLen = len(final)
        if newLen % 2 == 0:
            return (final[newLen//2 - 1] + final[newLen//2])/2
        return final[newLen//2]