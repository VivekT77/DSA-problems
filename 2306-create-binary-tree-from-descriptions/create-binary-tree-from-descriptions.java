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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer,TreeNode> m = new HashMap<>();//to store the value of corresponding nodes 
        Set<Integer> childs = new HashSet<>();   //to store the childs bcoz the node which will 
                                                //not be in set means not a child i.e root  
        for(int[] nodes:descriptions){
            int parent = nodes[0];
            int child = nodes[1];
            int isleft = nodes[2];
            childs.add(child);

            //start with initializing the parent 
            TreeNode node = m.getOrDefault(parent,new TreeNode(parent));
            if(isleft==1){  
                node.left = m.getOrDefault(child,new TreeNode(child));
                m.put(child,node.left);
            }
            else{
                node.right = m.getOrDefault(child,new TreeNode(child));
                m.put(child,node.right);
            }
            m.put(parent,node);
        }

        int root = -1;
        for(int[] value: descriptions){
            if(childs.contains(value[0])==false){ //means the node which is not present in set 
                root=value[0];              //will be the root
                break;
            }
        }
        return m.getOrDefault(root,null);   //get value of root from map otherwise null
    }
}