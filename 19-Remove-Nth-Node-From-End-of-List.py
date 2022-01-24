# Author: @Iresharma
# https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/

"""
Runtime: 28 ms, faster than 92.00% of Python3 online submissions for Remove Nth Node From End of List.
Memory Usage: 14.2 MB, less than 75.96% of Python3 online submissions for Remove Nth Node From End of List.
"""

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        a=head
        b=head
        c=1
        prev=head   
        while c!=n:
            a=a.next
            c=c+1
        while a.next:
            a=a.next
            prev=b
            
            b=b.next
        if prev==b:
            head=b.next
            return head
        prev.next=b.next
        return head