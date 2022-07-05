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
        public ListNode rotateRight(ListNode head, int k) {
            if(head == null || head.next == null)
                return head;
            ListNode temp = head;
            int size = 1;
            while (temp.next != null){
                temp = temp.next;
                size++;
            }
            temp.next = head;
            temp = head;
            k = k%size;
            
            for(int i = 0;i<size-k-1;i++){
                temp = temp.next;
            }
            
            head = temp.next;
            temp.next = null;
            
            return head;
            
            

        }
}