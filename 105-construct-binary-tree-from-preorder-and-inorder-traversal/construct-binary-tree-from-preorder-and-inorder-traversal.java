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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        if(preorder.length==0){
            return null;
        }
        int root = preorder[0];     //in preorder first is root node
        int index=0;        //to keep track of the left and right in the array

        for(int i=0;i<inorder.length;i++){    //in order to find root in inorder array and mark it as index
            if(inorder[i] == root){
                index=i;
            }
        }

        TreeNode node = new TreeNode(root);     

        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index+1) , Arrays.copyOfRange(inorder,0,index));          //copy of the preoder and inorder is made for the left and right part with help of index
        node.right = buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length), Arrays.copyOfRange(inorder,index+1,inorder.length));

        return node;
    }
}