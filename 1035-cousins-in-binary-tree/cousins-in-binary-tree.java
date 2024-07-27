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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null){
            return false;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            Boolean x_exist =false;
            Boolean y_exist =false;

            for(int i=0;i<size;i++){
                TreeNode current = q.remove();
                if(current.val==x){
                    x_exist=true;
                }
                if(current.val==y){
                    y_exist=true;
                }

                if(current.left!=null && current.right!=null){
                    if(current.left.val==x && current.right.val==y || current.left.val==y && current.right.val==x){
                        return false;
                    }
                }
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
            }
            if(x_exist ==true && y_exist==true){
                return true;
            }
        }
        return false;
    }
}