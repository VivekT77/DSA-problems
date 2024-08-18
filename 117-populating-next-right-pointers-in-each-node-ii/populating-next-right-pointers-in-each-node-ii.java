/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return null;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            int levelsize = q.size();
            Node prev = null;
            for(int i=0;i<levelsize;i++){
                Node curr_node = q.remove();
                if(prev!=null){
                    prev.next = curr_node;
                }
                prev = curr_node;

                if(curr_node.left!=null){
                    q.add(curr_node.left);
                }
                if(curr_node.right!=null){
                    q.add(curr_node.right);
                }
            }
        }
        return root;
    }
}