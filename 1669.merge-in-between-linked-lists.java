/*
 * @lc app=leetcode id=1669 lang=java
 *
 * [1669] Merge In Between Linked Lists
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
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1, temp2 = null;
        int count = 1;
        while(temp != null && count < a) {
            temp = temp.next;
            count++;
        }
        temp2 = temp;
        while(temp2 != null && count <= b + 1) {
            temp2 = temp2.next;
            count++;
        }
        temp.next = list2;
        while(temp.next != null)
            temp = temp.next;
        temp.next = temp2;
        return list1;

        // ListNode temp = list1, temp2 = null;
        // int count = 1;
        // while(temp != null && count <= b + 1) {
        //     if(count < a)
        //         temp = temp.next;
        //     else if (count == a)
        //         temp2 = temp;
        //     else if(count <= b + 1)
        //         temp2 = temp2.next;
        //     count++;
        // }
        // temp.next = list2;
        // while(temp.next != null)
        //     temp = temp.next;
        // temp.next = temp2.next;
        // return list1;
    }
}
// @lc code=end

