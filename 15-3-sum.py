#  Author: @Iresharma
# https://leetcode.com/problems/3sum/submissions/

'''
Runtime: 668 ms, faster than 94.70% of Python3 online submissions for 3Sum.
Memory Usage: 18 MB, less than 31.74% of Python3 online submissions for 3Sum.
'''


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        pos, neg = [], []
        zeros = []
        res = set()
        for i in nums:
            if i < 0:
                neg.append(i)
                
            elif i > 0:
                pos.append(i)
                
            elif i == 0:
                zeros.append(i)
        POS = set(pos)
        NEG = set(neg)
        if len(zeros)>=3:
            res.add((0,0,0))
        
        for i in neg:
            if -i in pos and len(zeros) >= 1:
                res.add((i, 0, -i))
                
        for i in range(len(pos)):
            for j in range(i+1, len(pos)):
                val = (-1*(pos[i]+pos[j]))
                if val in NEG:
                    res.add(tuple(sorted([val, pos[i], pos[j]])))
        
        for i in range(len(neg)):
            for j in range(i+1, len(neg)):
                val = (-1*(neg[i]+neg[j]))
                if val in POS:
                    res.add(tuple(sorted([val, neg[i], neg[j]])))
            
        return res