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
    public void Inorder(ArrayList<Integer> ans,TreeNode root){
        if(root==null){         //as inorder will give the sorted order of the binary tree
            return;
        }
        Inorder(ans,root.left);
        ans.add(root.val);
        Inorder(ans,root.right);
    }

    public boolean isValidBST(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();     //initialize the new arraylist and called the inorder
        Inorder(ans,root);                      //and assign the values in it and compared for soreted BT
        for(int i=0;i<ans.size()-1;i++){
            if(ans.get(i)>=ans.get(i+1)){
                return false;
            }
        }
        return true;
    }
}