import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> dft = new Stack<>();
        Stack<TreeNode> lca = new Stack<>();
        dft.push(root);
        insert(p, q, lca, dft);

        TreeNode check = null;
        while(! lca.isEmpty()){
            check = lca.pop();
            int counts = find(check, p, q);
            if(counts == 2) return check;
        }
        return null;
    }
    public void insert(TreeNode p, TreeNode q, Stack <TreeNode> lca, Stack <TreeNode> dft){
        while(!dft.isEmpty()){
            TreeNode temp = dft.pop();
            lca.push(temp);

            if(lca.contains(p) && lca.contains(q)){
                return;
            }
            if(temp.right != null){
                dft.push(temp.right);
            }
            if(temp.left != null){
                dft.push(temp.left);
            }
        }
    }
    public int find(TreeNode node, TreeNode p, TreeNode q){
        if(node == null){
            return 0;
        }
        int count = (node==p || node==q) ?1 :0;

        count+=find(node.left, p, q);
        count+=find(node.right, p, q);

        return count;
    }
}