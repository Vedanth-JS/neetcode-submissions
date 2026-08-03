class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean valid(TreeNode node, long left, long right) {
        if (node == null) {
            return true;
        }
        
        // The current node's value must strictly lie between (left, right)
        if (!(left < node.val && node.val < right)) {
            return false;
        }

        // Left child's upper bound becomes node.val
        // Right child's lower bound becomes node.val
        return valid(node.left, left, node.val) && valid(node.right, node.val, right);
    }
}