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
    public boolean isBalanced(TreeNode root) {

       if(root==null){
        return true;
       }
       if(Height(root)==-1){  //-1 means the tree is unbalanced ,not the actual height
        return false;
       }else{
        return true;
       }
    }

    public int Height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = Height(root.left);
        int right = Height(root.right);

        int difference = Math.abs(left-right); //to get the absolute value of the difference
        if(difference>1){       //as the diff can't be more than 1 for balanced
            return -1;  
        }else if(left==-1 || right ==-1){  //for [1,2,2,3,null,null,3,4,null,null,4] ,right==-1
            return -1;
        }
       int height = Math.max(left,right)+1; //otherwise just calculate the height
        return height;

        
    }
}