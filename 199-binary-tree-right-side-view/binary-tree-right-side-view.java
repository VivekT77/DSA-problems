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
    public List<Integer> rightSideView(TreeNode root) {
    //2nd appraoch      //recursion is used if the list size is==level value, then add the node in
    List<Integer> ans = new ArrayList<>();  //list, first recursively call to the right node then 
    rightview(root,ans,0);      //for left bcoz the list size for right ==1 and after that for 
    return ans;                 //left==2
    }

    public void rightview(TreeNode currnode,List<Integer> ans, int currlevel ){
        if(currnode==null){
            return;
        }

        if(currlevel==ans.size()){
            ans.add(currnode.val);
        }
        rightview(currnode.right,ans,currlevel+1);
        rightview(currnode.left,ans,currlevel+1);
    }

        // List<Integer> ans = new ArrayList<>(); //same approach as level order traversal(Q) just 
        // if(root==null){         //just return the last element of the the levelwise list
        //     return ans;         //which is same as right view of the tree
        // }

        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(root);
        
        // while(!q.isEmpty()){
        //     int levelsize=q.size();
        //     for(int i=0;i<levelsize;i++){
        //         TreeNode node = q.remove();

        //         if(i==levelsize-1){
        //             ans.add(node.val);
        //         }
        //         if(node.left!=null){
        //             q.add(node.left);
        //         }
        //         if(node.right!=null){
        //             q.add(node.right);
        //         }
        //     }
        // }
        // return ans;

}