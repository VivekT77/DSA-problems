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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null){
            return 0;
        }

        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);

        int left_bottom_value=0;
        while(!q.isEmpty()){

            int levelsize = q.size();
            left_bottom_value = q.peek().val;   //at last the left node of the subtree will be stored in the
                                                //queue,hence return the peek 
            for(int i=0;i<levelsize;i++){
                TreeNode node = q.remove();

                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
        }
        return left_bottom_value;
    }
}