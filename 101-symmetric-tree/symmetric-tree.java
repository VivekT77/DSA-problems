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
    public boolean isSymmetric(TreeNode root) {
    //2nd approach => optimized one,same as 1st but used recursion 

        if(root==null){
            return true;
        }
        return ismirror(root.left,root.right);
    }

    public boolean ismirror(TreeNode Lnode,TreeNode Rnode){

        if(Lnode ==null && Rnode==null){
            return true;
        }
        if(Lnode ==null || Rnode==null){
            return false;
        }
        return (Lnode.val == Rnode.val && ismirror(Lnode.left,Rnode.right) && ismirror(Lnode.right,Rnode.left));
        
    }
}