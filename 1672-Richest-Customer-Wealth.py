# Author: @Iresharma
# https://leetcode.com/problems/1672-Richest-Customer-Wealth/

"""
Runtime: 56 ms, faster than 45.80% of Python3 online submissions for Richest Customer Wealth.
Memory Usage: 14.3 MB, less than 25.87% of Python3 online submissions for Richest Customer Wealth.
"""

class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        return max(map(sum, accounts))