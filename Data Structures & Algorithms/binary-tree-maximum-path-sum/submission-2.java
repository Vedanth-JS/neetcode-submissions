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
    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;

        int lVal = Math.max(0, dfs(root.left));
        int rVal = Math.max(0, dfs(root.right));
        int currPathSum = root.val + lVal + rVal;
        this.max = Math.max(max, currPathSum);
        return root.val + Math.max(lVal, rVal);
    }
}
