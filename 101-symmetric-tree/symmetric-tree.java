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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root.left);       //initially add  the root's left and right
        q.add(root.right);

        while(!q.isEmpty()){

            TreeNode left = q.poll();   //remove the nodes from the queue and assign them as 
            TreeNode right = q.poll();  //left and right,compare them and move to the subtrees

            if(left==null && right==null){  
                continue;
            }
            if(left==null || right==null){  
                return false;
            }
            if(left.val!=right.val){
                return false;
            }
            q.add(left.left);       //we need to compare the end nodes of the tree and then the
            q.add(right.right);     //inner end nodes eg=> queue will be 2,2,3,3,4,4
            q.add(left.right);
            q.add(right.left);
        }
        return true;
    }
}