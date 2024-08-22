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
class BalanceBinaryTree {
    public boolean isBalanced(TreeNode root) {
        int rst = check(root);
        if(rst == -1) return false;
        return true;

    }
    public int check(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = check(root.left);
        int r = check(root.right);
        if(l==-1 || r==-1 || Math.abs(l-r)>1) {
            return -1;
        }
        return 1+Math.max(l, r);

    }
}