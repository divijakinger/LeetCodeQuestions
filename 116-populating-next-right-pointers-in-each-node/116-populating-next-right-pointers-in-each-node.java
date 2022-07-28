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
        if (root==null){
            return null;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node prevNode = null;
            int size = queue.size();
            for (int i =0;i<size;i++){
                
                Node tempNode = queue.poll();
                
                if (prevNode!=null){
                    prevNode.next = tempNode;
                }
                prevNode = tempNode;

                if(tempNode.left!=null){
                    queue.add(tempNode.left);
                }

                if(tempNode.right!=null){
                    queue.add(tempNode.right);
                }
            }

        }
        return root;
    }
}