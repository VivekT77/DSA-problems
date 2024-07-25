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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }

        Deque<TreeNode> q = new LinkedList<>(); //we need to add and remove from both sides
        q.add(root);
        Boolean reverse = false;  //initially normal then reverse order for the node insertion

        while(!q.isEmpty()){        //same as level order traversal
            int levelsize = q.size();
            List<Integer> list = new ArrayList<>(levelsize);

            for(int i=0;i<levelsize;i++){
                if(!reverse){               //for reverse order pop from start and add in sublist
                    TreeNode node = q.removeFirst();
                    list.add(node.val);
                    if(node.left!=null){   // add from last bcoz we want 20 to be pop from else
                        q.addLast(node.left);    //condition
                    } 
                    if(node.right!=null){
                        q.addLast(node.right);
                    }
                }else{                   //means normal form 
                    TreeNode node = q.removeLast();   //20 will be poped and one node is left i.e 9
                    list.add(node.val);     //so same else condition will be run
                    if(node.right!=null){
                        q.addFirst(node.right);  //we have called right first bcoz we want 15 to
                    }                           // be at start  15=>7(int queue) and then reverse
                    if(node.left!=null){        //form will be called and 15 get poped
                        q.addFirst(node.left);
                    }
                }
            }
            reverse = !reverse;
            ans.add(list);
        }
    return ans;
    }
}