# Author: @Iresharma
# https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/submissions/

"""
Runtime: 28 ms, faster than 80.14% of Python3 online submissions for Subtract the Product and Sum of Digits of an Integer.
Memory Usage: 14.4 MB, less than 9.83% of Python3 online submissions for Subtract the Product and Sum of Digits of an Integer.
"""

class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        seq = list(map(int, str(n)))
        return reduce(lambda x, y: x*y, seq) - sum(seq)