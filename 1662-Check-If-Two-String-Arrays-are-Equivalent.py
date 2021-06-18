# Author: @Iresharma
# https://leetcode.com/problems/1662-Check-If-Two-String-Arrays-are-Equivalent/

"""
Runtime: 32 ms, faster than 66.09% of Python3 online submissions for Check If Two String Arrays are Equivalent.
Memory Usage: 14.3 MB, less than 60.53% of Python3 online submissions for Check If Two String Arrays are Equivalent.
"""

class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        return "".join(word1) == "".join(word2)