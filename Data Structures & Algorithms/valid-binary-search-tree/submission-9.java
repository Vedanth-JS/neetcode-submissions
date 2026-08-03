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
    public boolean helper(TreeNode root,Integer maxValue,Integer minValue){
        if(root==null) return true;

        if(root.val<=minValue || root.val>=maxValue) return false;


        return helper(root.left,root.val,minValue) && helper(root.right,maxValue,root.val);
    }
    public boolean isValidBST(TreeNode root) {

        if(root==null) return true;

        return helper(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
        
    }
}
