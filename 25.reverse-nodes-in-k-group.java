/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
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
import java.util.ArrayList;
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev = head;
        ListNode next = head.next;
        int count = 1;
        while(count < k && next != null && next.next != null) {
            count++;
            next = next.next;
            if(count == k) {
                count = 1;
                ArrayList<ListNode> ret = addFirst(prev, k);
                ListNode temp = ret.get(1);
                temp.next = next;
                if(prev != null) {
                    prev.next = ret.get(0);
                }
                prev = ret.get(0);
            }
        }
        return head;
    }

    public ArrayList<ListNode> addFirst(ListNode node, int k) {
        ListNode tempHead = null, tempTail = null;
        int count = 1;
        while(count <= k) {
            count++;
            if(tempHead == null) {
                tempHead = node;
                tempTail = node;
            }
            else {
                ListNode tempNode = node;
                tempNode.next = tempHead;
                tempHead = tempNode;
            }
            node = node.next;
        }
        ArrayList<ListNode> list = new ArrayList<ListNode>();
        list.add(tempHead);
        list.add(tempTail);
        return list;
    }
}
// @lc code=end

