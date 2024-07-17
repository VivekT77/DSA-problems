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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        } 

        Queue<TreeNode> q = new LinkedList<>();   //initialized queue and add the nodes in it 
        q.add(root);        //till queue gets empty,pop the node from queue and add it in list
                                //levelwise=> level1 =3  level2 =9,20....
        while(!q.isEmpty()){    
            int Size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<Size;i++){
                TreeNode node = q.poll();
                list.add(node.val);

                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}