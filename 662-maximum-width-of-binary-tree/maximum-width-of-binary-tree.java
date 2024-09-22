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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }

        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();   //queue is use to placed the node and its 
        q.add(new Pair<>(root,0));          //value in the form of pair
        int max_width=0;

        while(!q.isEmpty()){            //untill q is empty initialize the left and right pointer to cal.
            int level_size = q.size();          //max_width and maintain levelsize at eachlevl
            int leftmost = q.peek().getValue();
            int index = 0;              // to denote rightmost

            for(int i=0;i<level_size;i++){          //iterate through each level and pop the element and
                Pair<TreeNode,Integer> current = q.poll(); //assigned the current node and its value to it
                TreeNode node = current.getKey();
                index = current.getValue();

                if(node.left !=null){       //now iterate through left and right subbranch of the nodes
                    q.add(new Pair<>(node.left,index*2));
                }
                if(node.right !=null){
                    q.add(new Pair<>(node.right,index*2 + 1));
                }
            }
        max_width = Math.max(max_width , index - leftmost + 1);     //update the width after each level
        }   
        return max_width;
    }
}