/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
// Memory Usage: 37.2 MB, less than 57.43% of Java online submissions for Remove Nth Node From End of List

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;
        int count = 1;
        // Moving fast pointer ahead of slow by n
        while(count != n ) {
            fast = fast.next;
            count++;
        }
        // Taking fast pointer to the end while slow is trailing behind by n and prev is trailing behind by n - 1
        while(fast.next != null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        // If list has only one item the second while loop doesn't run hence prev = slow, so we remove first element
        if(prev == slow) {
            head = slow.next;
            return head;
        }
        // Else we just link to the successor of slow and return immediately
        prev.next = slow.next;
        return head;
    }
}
// @lc code=end

