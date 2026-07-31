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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        int min, max;
        if (p.val > q.val) {
            min = q.val;
            max = p.val;
        } else {
            min = p.val;
            max = q.val;
        }

        if (max > root.val) { 
            if (root.val > min)
                return root;
            
            return lowestCommonAncestor(root.right, p, q);
        }

        return lowestCommonAncestor(root.left, p, q);
    }
}
