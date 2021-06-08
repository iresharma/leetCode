# Author: @Iresharma
# https://leetcode.com/problems/shuffle-string/

"""
Runtime: 68 ms, faster than 14.43% of Python3 online submissions for Shuffle String.
Memory Usage: 14.3 MB, less than 51.62% of Python3 online submissions for Shuffle String.
"""

class Solution:
    def restoreString(self, s: str, indices: List[int]) -> str:
        ret = list(s)
        for i in range(len(s)):
            ret[indices[i]] = s[i]
        return ''.join(ret)