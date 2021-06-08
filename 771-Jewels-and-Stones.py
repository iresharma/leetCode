# Author: @Iresharma
# https://leetcode.com/problems/jewels-and-stones/

"""
Runtime: 20 ms, faster than 99.16% of Python3 online submissions for Jewels and Stones.
Memory Usage: 14.3 MB, less than 11.57% of Python3 online submissions for Jewels and Stones.
"""

class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        count = 0
        for i in jewels:
            count += stones.count(i)
        return count