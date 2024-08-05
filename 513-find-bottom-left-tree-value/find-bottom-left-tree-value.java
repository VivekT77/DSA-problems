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
    
        //2nd approach
        ArrayList<Integer> ans = new ArrayList<>();
        find_value(ans,root,0);
        return ans.get(ans.size()-1);       //return the last element as it will be the iterated at bottom

    }

    public void find_value(ArrayList<Integer> ans , TreeNode root ,int level){
        if(root==null){
            return;
        }

        if(level == ans.size()){     //due to this only left nodes will get as for right the list size will
            ans.add(root.val);         //be not equal to level value
        }

        find_value(ans,root.left,level + 1);
        find_value(ans,root.right,level + 1);

    }


//1st approach
        // if(root==null){
        //     return 0;
        // }

        // Queue<TreeNode> q= new LinkedList<>();
        // q.add(root);

        // int left_bottom_value=0;
        // while(!q.isEmpty()){

        //     int levelsize = q.size();
        //     left_bottom_value = q.peek().val;   //at last the left node of the subtree will be stored in the
        //                                         //queue,hence return the peek 
        //     for(int i=0;i<levelsize;i++){
        //         TreeNode node = q.remove();

        //         if(node.left!=null){
        //             q.add(node.left);
        //         }
        //         if(node.right!=null){
        //             q.add(node.right);
        //         }
        //     }
        // }
        // return left_bottom_value;
}