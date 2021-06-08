# Author: @Iresharma
# https://leetcode.com/problems/shuffle-the-array/submissions/

"""
Runtime: 60 ms, faster than 66.12% of Python3 online submissions for Shuffle the Array.
Memory Usage: 14.4 MB, less than 48.42% of Python3 online submissions for Shuffle the Array.
"""

class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        x = nums[:n]
        y = nums[n:]
        final = []
        for i in range(n):
            final.append(x[i])
            final.append(y[i])
        return final