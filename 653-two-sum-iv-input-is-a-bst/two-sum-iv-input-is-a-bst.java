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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> s = new HashSet<>();       //to store the nodes at each level to maintain sum
        return helper(root,k,s);
    }
    
    public Boolean helper(TreeNode node,int k ,HashSet<Integer> s){
        
        if(node==null){
            return false;
        }

        if(s.contains(k-node.val)){         //if the node's value matches the sum return true
            return true;    
        }
        s.add(node.val);        //otherwiseput the node in set and iterate over other nodes

        return helper(node.left,k,s) || helper(node.right,k,s);
    }
}