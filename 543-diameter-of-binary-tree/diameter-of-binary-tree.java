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
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left_dia = diameterOfBinaryTree(root.left);
        int right_dia = diameterOfBinaryTree(root.right);
        int lh = Height(root.left);
        int rh = Height(root.right);

        int self_diameter = lh + rh ;
        return Math.max(self_diameter , Math.max(left_dia,right_dia));
    }

    public int Height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left_h = Height(root.left);
        int right_h = Height(root.right);
        return Math.max(left_h,right_h)+1;
    }
}