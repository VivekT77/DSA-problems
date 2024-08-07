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
    public boolean isValidBST(TreeNode root){
        //2nd appraoch
        return helper(root,null,null);
    }

    public Boolean helper(TreeNode node,Integer low_value, Integer high_value){

        if(node==null){
            return true;
        }
        if( low_value!=null && node.val<=low_value){
            return false;
        }
        if( high_value!=null && node.val>=high_value){
            return false;
        }
     // for left,node's low can be anything but high will not be > node's value. for right ,high can be anything but lowest value needs to be node's value otherwise it will be not be a BST
        Boolean left = helper(node.left, low_value, node.val);
        Boolean right = helper(node.right, node.val, high_value);   

        return left && right;
    }
}