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
    
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        Height(root);
        return diameter-1;
    }

    public int Height(TreeNode root){

        if(root==null){
            return 0;
        }

        int L_h = Height(root.left);
        int R_h = Height(root.right);

        int self_diameter = L_h + R_h + 1;
        diameter = Math.max(self_diameter,diameter);
        return Math.max(L_h , R_h) + 1;
    }
}