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
class Solution {            //similar to create BT from inorder and preorder question
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0){
            return null;
        }

        int root = postorder[postorder.length-1];
        int index =0;

        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==root){
                index=i;
                break;
            }
        }

        TreeNode node = new TreeNode(root);

        node.left = buildTree(Arrays.copyOfRange(inorder,0,index) , Arrays.copyOfRange(postorder,0,index));
        node.right = buildTree(Arrays.copyOfRange(inorder,index+1,inorder.length) , Arrays.copyOfRange(postorder,index,postorder.length-1));

        return node;
    }
}