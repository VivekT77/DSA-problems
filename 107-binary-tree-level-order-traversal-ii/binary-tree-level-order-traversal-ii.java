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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();  //similar to the level order traversal(1) 
        if(root==null){       //question Q no.(102),just we need to print the list in bottom up 
            return ans;    //approach so at last when we append the list into ans just 
        }                   // assign the 0th index so which ever list will come be at first
                            //15,7 =>9,20=>3
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int levelsize = q.size();
            for(int i=0;i<levelsize;i++){
                TreeNode node = q.remove();
                list.add(node.val);

                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            ans.add(0,list);
        }
        return ans;
    }
}