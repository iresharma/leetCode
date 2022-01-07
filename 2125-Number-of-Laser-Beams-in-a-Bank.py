# Author: @Iresharma
# https://leetcode.com/problems/number-of-laser-beams-in-a-bank/

'''
Runtime: 80 ms, faster than 94.33% of Python3 online submissions for Number of Laser Beams in a Bank.
Memory Usage: 16.2 MB, less than 65.43% of Python3 online submissions for Number of Laser Beams in a Bank.
'''

class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        lasers = 0
        noLaser = "0" * len(bank[0])
        ones = []
        for i in bank:
            if i != noLaser:
                ones.append(i.count("1"))
        
        for i in range(len(ones) - 1):
            lasers += ones[i] * ones[i+1]
        
        return lasers