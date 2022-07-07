/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        // O(n) solution using map
        // key: random pointer
        // value: original pointer
        Map<Node, Node> pseudoRandomMap = new HashMap<Node, Node>(); // used to deep copy the random nodes
        
        // first, deep copy the next pointers
        Node dummy = new Node(0);
        Node curr = head;
        Node currPrev = new Node(0);
        Node prev = dummy;
        while (curr != null) {
            prev.next = new Node(curr.val);
            prev.next.random = curr;
            
            // we temporarily set the random pointers of the cloned nodes
            // to the original node that is in the same relative position
            pseudoRandomMap.put(curr, prev.next);
            
            prev = prev.next;
            curr = curr.next;
        }
        
        // second, deep copy the randomPointers
        // curr and prev are the in the same relative position, so
        // curr.random and prev.random should be in the same relative position
        curr = head;
        prev = dummy.next;
        while (curr != null) {
            Node rand = curr.random;
            if (rand == null) {
                prev.random = null;
            } else {
                prev.random = pseudoRandomMap.get(rand);
            }
            curr = curr.next;
            prev = prev.next;
        }
        
        return dummy.next;
    }
}