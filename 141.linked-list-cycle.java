/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
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

// 21/21 cases passed (0 ms)
// Your runtime beats 100 % of java submissions
// Your memory usage beats 5.98 % of java submissions (45.7 MB)

public class Solution {

  public boolean hasCycle(ListNode head) {
    ListNode slow = head, fast = head;
    if (
      head == null || head.next == null || head.next.next == null
    ) return false;
    slow = slow.next;
    fast = fast.next.next;
    while (slow != null && fast != null && fast.next != null) {
      if (slow == fast) {
        return true;
      }
      slow = slow.next;
      fast = fast.next.next;
    }
    return false;
  }
}
// @lc code=end
