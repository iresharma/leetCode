# Author: @Iresharma
# https://leetcode.com/problems/decompress-run-length-encoded-list/submissions/

"""
Runtime: 52 ms, faster than 98.68% of Python3 online submissions for Decompress Run-Length Encoded List.
Memory Usage: 14.9 MB, less than 23.83% of Python3 online submissions for Decompress Run-Length Encoded List.
"""

class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        out = []
        for i in range(0, len(nums), 2):
            out += [nums[i + 1]] * nums[i]
        return out