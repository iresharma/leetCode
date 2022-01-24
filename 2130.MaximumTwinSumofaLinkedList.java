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

// Runtime: 23 ms, faster than 47.78% of Java online submissions for Maximum Twin Sum of a Linked List.
// Memory Usage: 123.5 MB, less than 53.41% of Java online submissions for Maximum Twin Sum of a Linked List.


import java.util.ArrayList;
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> items = new ArrayList<Integer>();
        while(head != null) {
            items.add(head.val);
            head = head.next;
        }
        int max = 0, len = items.size();
        for(int i = 0; i < len/2; i++) {
            int sum = items.get(i) + items.get(len - 1 - i);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
}