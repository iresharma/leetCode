# Author: @Iresharma
# https://leetcode.com/problems/number-of-good-pairs/submissions/

"""
Runtime: 36 ms, faster than 45.71% of Python3 online submissions for Number of Good Pairs.
Memory Usage: 14.2 MB, less than 41.16% of Python3 online submissions for Number of Good Pairs.
"""

class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        pairs = {}
        for n in nums:
            if n not in pairs:
                pairs[n] = 0
            else:
                pairs[n] += 1
        
        tot = 0
        for key, item in pairs.items():
            tot += (item + 1) * item / 2
        return int(tot)