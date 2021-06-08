# Author: @Iresharma
# https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/submissions/

"""
Runtime: 28 ms, faster than 92.21% of Python3 online submissions for Check if Word Equals Summation of Two Words.
Memory Usage: 14.4 MB, less than 24.23% of Python3 online submissions for Check if Word Equals Summation of Two Words.
"""

class Solution:
    def isSumEqual(self, firstWord: str, secondWord: str, targetWord: str) -> bool:
        strs = {
            'a': '0',
            'b': '1',
            'c': '2',
            'd': '3',
            'e': '4',
            'f': '5',
            'g': '6',
            'h': '7',
            'i': '8',
            'j': '9',
        }
        w1 = int("".join(list(map(lambda x: strs[x], firstWord))))
        w2 = int("".join(list(map(lambda x: strs[x], secondWord))))
        w3 = int("".join(list(map(lambda x: strs[x], targetWord))))
        return w1 + w2 == w3