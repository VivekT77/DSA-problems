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
        //2nd  approach --- the level should bw the same but of different parents 
        TreeNode x_node = findnode(root,x);
        TreeNode y_node = findnode(root,y);
        return ( (level(root,x_node,0) == level(root,y_node,0)) && (!isSiblings(root,x_node,y_node)) );
    }

    public TreeNode findnode(TreeNode node,int v){
        if(node==null){
            return null;
        }
        if(node.val==v){    //if found then return else search for left and right
            return node;
        }
        TreeNode n = findnode(node.left,v);
        if(n!=null){  //if it is found in left,return it otherwise go for the right part
            return n;
        }else{
            return findnode(node.right,v);
        }
    }

    public int level(TreeNode node,TreeNode x,int lev){
        if(node==null){
            return 0;
        }
        if(node==x){      //if the node and the x's or y's node is same then return the level  
            return lev;
        }
        int l = level(node.left,x,lev+1);
        if(l != 0){     
            return l;
        }else{
            return level(node.right,x,lev+1);
        }
    }

        Boolean isSiblings(TreeNode node,TreeNode x,TreeNode y){
            if(node==null){
                return false;
            }
            return (node.left==x && node.right==y || node.left==y && node.right==x || isSiblings(node.left,x,y) || isSiblings(node.right,x,y) );  
        }   //true && true means found the nodes else one also get false then totall  false
}