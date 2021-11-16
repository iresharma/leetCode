/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {\
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
import java.util.HashSet;
class Solution {
    public Node copyRandomList(Node head) {
        HashSet<Node> newList = new HashSet<>();
        Node newHead = new Node(head.val);
        head = head.next;
        while (head.next != null) {
            if(newList.contains(head)) {
                newHead.next = head.next;
            }
        }
    }
}
// @lc code=end

