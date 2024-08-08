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

    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        //2nd approach
        return Helper(root,k).val;
    }

    public TreeNode Helper(TreeNode root, int k){
        if(root==null){
            return null;
        }

        TreeNode left = Helper(root.left,k);    //as we are performing inorder therefore iterate left
        if(left!=null){         //means somewhere in left subtree node is been found return left
            return left;
        }
        
        count++;        //it keeps record of the smallest no. frequency
        if(count==k){       //count=1=>k=1 , count=2,k=2 => count=3,k=3
            return root;
        }
        return Helper(root.right,k);    //if not found in left then find in right
    } 
}