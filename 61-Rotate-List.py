# Author: @Iresharma
# https://leetcode.com/problems/61-Rotate-List/

"""
"""

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

        
class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        if head == None or head.next == None:
            return head
        def lastSecondLast(head: ListNode) -> tuple:
            temp = head
            length = 0
            last, secondLast = temp, None
            while temp.next != None:
                secondLast = temp
                last = temp.next
                temp = temp.next
                length += 1
            return (last, secondLast, length + 1)
        ret = lastSecondLast(head)
        last, secondLast, size = ret[0], ret[1], ret[2]
        if k >= size:
            k %= size
        print(k)
        for i in range(k):
            temp = head
            head = last
            head.next = temp
            secondLast.next = None
            ret = lastSecondLast(temp)
            last, secondLast = ret[0], ret[1]
        return head
            