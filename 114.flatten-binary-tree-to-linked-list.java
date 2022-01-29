/*
 * @lc app=leetcode id=114 lang=java
 *
 * [114] Flatten Binary Tree to Linked List
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode head = new TreeNode();
        TreeNode temp = head;
        temp = recPreorder(root, temp);
        root = head.right;
    }

    public TreeNode recPreorder(TreeNode node, TreeNode head) {
        head.right = new TreeNode(node.val);
        // System.out.println(node.val);
        head = head.right;
        if(node.left != null)
            head = recPreorder(node.left, head);
        if (node.right != null)
            head = recPreorder(node.right, head);
        return head;
    }
}
// @lc code=end

