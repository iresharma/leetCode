# https://leetcode.com/problems/product-of-array-except-self/

# Runtime: 232 ms, faster than 84.82% of Python3 online submissions for Product of Array Except Self.
# Memory Usage: 21.3 MB, less than 40.80% of Python3 online submissions for Product of Array Except Self.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prods = 1
        for i in nums:
            prods = prods * i if i != 0 else prods
        if 0 in nums:
            if nums.count(0) > 1:
                return [0] * len(nums)
            else:
                answers = [0] * len(nums)
                answers[nums.index(0)] = prods
                return answers
        return list(map(lambda x: int(prods/x), nums))