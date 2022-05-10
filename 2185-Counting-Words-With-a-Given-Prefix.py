# author: @iresharma


# Runtime: 36 ms, faster than 95.69% of Python3 online submissions for Counting Words With a Given Prefix.
# Memory Usage: 13.9 MB, less than 68.97% of Python3 online submissions for Counting Words With a Given Prefix.

class Solution:
    
    def check(self, x: str, pref: str) -> bool:
        try:
            return x.index(pref) == 0
        except Exception as e:
            return False
    
    def prefixCount(self, words: List[str], pref: str) -> int:
        return list(map(lambda x: self.check(x, pref), words)).count(True)
