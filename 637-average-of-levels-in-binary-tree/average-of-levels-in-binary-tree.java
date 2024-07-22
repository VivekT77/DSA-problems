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
    public List<Double> averageOfLevels(TreeNode root) {  //its just the copy paste of Q(102)
        List<Double> ans = new ArrayList<>();       //level order traversal question
        if(root==null){
            return ans;
        } 

        Queue<TreeNode> q = new LinkedList<>();   //initialized queue and add the nodes in it 
        q.add(root);        //till queue gets empty,pop the node from queue and add it in list
                                //levelwise=> level1 =3  level2 =9,20....
        while(!q.isEmpty()){    
            int levelSize = q.size();
            double average=0;
            for(int i=0;i<levelSize;i++){
                TreeNode node = q.poll();
                average += node.val;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            average = average / levelSize;
            ans.add(average);
        }
        return ans;
    }
}