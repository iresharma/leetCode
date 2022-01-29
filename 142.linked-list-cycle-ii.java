/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.HashSet;
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<ListNode>();
        int index = 0;
        while(head != null) {
            if(nodes.contains(head)) {
                return head;
            } else nodes.add(head);
            head = head.next;
        }
        return null;
    }
}
// @lc code=end

