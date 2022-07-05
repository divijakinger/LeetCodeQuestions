/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode nH = head;
        ListNode temp = head;
        for (int i =0;i<k;i++){
            if (i<k && nH==null){
                return head;
            }
            nH = nH.next;
        }
        int n = k;
        ListNode front = reverse(head,n);
        ListNode tail = head;
        tail.next = reverseKGroup(nH,k);
        return front;
        
        
    }
    
    private ListNode reverse(ListNode head,int k){
    ListNode prev = null;
    ListNode curr = head;
    ListNode next = head;  
    while(k--!=0){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}
}