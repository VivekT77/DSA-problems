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
    int ans = Integer.MIN_VALUE;        //to maintain the global variable "ans" which will get update at
    public int maxPathSum(TreeNode root) {      //each step
        helper(root);
        return ans;
    }

    public int helper(TreeNode node){     //we need helper function in order to save the sum at each level
        if(node==null){
            return 0;
        }

        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0,left);        //if negative values ignored it,just by taking 0 as max from it
        right = Math.max(0,right);

        int pathsum = left + right + node.val;      //used to calculate the pathsum at each current node
        ans = Math.max(ans,pathsum);     //compare the ans with the global variable which gets updated

        return Math.max(left,right) + node.val;     //it returns the overall max path sum taking max from 
    }                                               //left and right subtree and current node
}