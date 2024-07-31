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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList();
        postorder(ans,root); //called function to perform the operation
        return ans;
    }
    public void postorder( List<Integer> ans,TreeNode root){
        if(root==null){     //if the root node is null,return back to its previous node
            return;
        }  
        postorder(ans,root.left);
        postorder(ans,root.right);
        ans.add(root.val); 
    }
}