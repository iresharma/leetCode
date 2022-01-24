/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 */

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

// Your runtime beats 100 % of java submissions
// Your memory usage beats 27.34 % of java submissions (39.9 MB)

class Solution {
    public ListNode reverseList(ListNode head) {
        // check if list is empty
        if(head == null) { return head; }
        //  prev node pointer starts at null because this becomes the end of the list
        ListNode prev = null;
        // current starts at head pointer
        ListNode curr = head;
        // next starts at a node after head pointer
        ListNode next = head.next;
        // iterate until next reaches the end
        while(next != null) {
            // link current node to previous
            curr.next = prev;
            // move previous pointer by one
            prev = curr;
            // move current pointer by one
            curr = next;
            // move next pointer by one
            next = next.next;
        }
        // finally connect the current node(now first) back to the previous
        curr.next = prev;
        return curr;
    }
}
// @lc code=end

