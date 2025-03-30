/**
<----------------------------------------------------Two Sum IV - Input is a BST------------------------------------------------------>
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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hs=new HashSet<>();
        return findsum(root,hs,k);

    }
    private boolean findsum(TreeNode root,HashSet<Integer> hs,int k){
        if(root==null) return false;
        if(hs.contains(k-root.val)) return true;
        hs.add(root.val);

        return findsum(root.left,hs,k)||findsum(root.right,hs,k);

    }
}
