# Author: Iresharma
# https://leetcode.com/problems/count-items-matching-a-rule/

"""
Runtime: 244 ms, faster than 52.67% of Python3 online submissions for Count Items Matching a Rule.
Memory Usage: 20.7 MB, less than 19.11% of Python3 online submissions for Count Items Matching a Rule.
"""

# ! For some reason all the solution map, filter and for loop all gave bad result even after bein O(n)

# * I do not consider this a bad a solution even though its slower compared to others
# I a real dev environment this is the method you'd use to solve such a problem and hence i'd keep this

class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        ruleIndex = {
            'type': 0,
            'color': 1,
            'name': 2
        }
        index = ruleIndex[ruleKey]
        return len(list(filter(lambda x: x[index] == ruleValue, items)))
        # return list(map(lambda x: x[index] == ruleValue, items)).count(True)
        # return [x[index] for x in items].count(ruleValue)
        c = 0
        # for i in items:
        #     if i[index] == ruleValue:
        #         c += 1
        # return c