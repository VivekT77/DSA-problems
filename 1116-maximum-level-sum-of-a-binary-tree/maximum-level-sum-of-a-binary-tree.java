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
    public int maxLevelSum(TreeNode root) {
            int needed_level = 1;       //to store the level where sum will be maximal
            int max_sum = Integer.MIN_VALUE;    //to compare the calculated sum  at each level
            Queue<TreeNode> q= new LinkedList<>();
            q.add(root);
            int level = 1;      //to iterate the binary tree
            while(!q.isEmpty()){
                int levelsize = q.size();
                int sum=0;          // to store the suma t each level
                for(int i=0;i<levelsize;i++){
                    TreeNode node = q.remove();
                    sum += node.val;

                    if(node.left!=null){
                        q.add(node.left);
                    }
                    if(node.right!=null){
                        q.add(node.right);
                    }
                }
                if(sum>max_sum){
                    needed_level = level;
                    max_sum=sum;
                }
                level++;
           }
           return needed_level;
    }
}