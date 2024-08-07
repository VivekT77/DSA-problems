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
    public void flatten(TreeNode root) {
        
        TreeNode current = root;
        while(current!=null){           //till current is not null traverse right side
            if(current.left!=null){         //we need to go left to assign right to left first
               TreeNode temp = current.left;    
               while(temp.right!=null){     //As ans is needed as right skewed so go left-right 
                    temp = temp.right;      //till right gets null
               }
               temp.right = current.right;     //as left's right gets null assign the right to left's
               current.right = current.left;    //right and right is equal to current's left 
               current.left=null;           //and make current's left null and iterate the current to
            }                               //to its right
            current = current.right;
        }
    }
}