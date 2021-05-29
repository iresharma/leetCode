# Author: @iresharma
# 

"""
Runtime: 32 ms, faster than 80.25% of Python3 online submissions for String to Integer (atoi).
Memory Usage: 14.2 MB, less than 54.78% of Python3 online submissions for String to Integer (atoi).
"""

import re

class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.strip()
        regEx = re.compile('^[0-9]*$')
        if s == "":
            print('why')
            return 0
        lim = 2147483648
        ret = 0
        num = s.split(' ')[0]
        if re.fullmatch(regEx, num if num[0] not in '-+' else num[1::]):
            ret = int(float(num)) if num != "-" and num != "+" else 0
        else:
            numFound = ""
            for i in num if num[0] not in '+-' else num[1::]:
                if i not in '1234567890.':
                    break
                numFound += i
            numFound = '-' + numFound if num[0] == '-' else numFound
            ret = int(float(numFound)) if numFound != "" and numFound != "-" else 0
        return ret if abs(ret) < lim else (lim - 1 if ret > 0 else lim * -1)