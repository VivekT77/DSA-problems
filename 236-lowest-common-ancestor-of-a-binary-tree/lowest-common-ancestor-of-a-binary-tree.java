/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null || root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);  
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left !=null && right!=null){     //we know that if the p and q are found at a particular 
            return root;               //node then no need to go to their subtrees bcoz it will be LCA
        }                           //and the node can be LCA of itself
        
        return right==null ? left : right;      //if p is found in left but q is not found in right
    }                                       //then it will return null to its root and q will be at 
}                                      //left side only in subtree of p