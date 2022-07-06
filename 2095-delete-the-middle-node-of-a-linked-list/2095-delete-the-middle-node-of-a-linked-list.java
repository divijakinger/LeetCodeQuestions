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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        ListNode mid = head;
        int size = 0;
        
        while (temp!= null){
            temp = temp.next;
            size ++;
        }
        
        System.out.println(size);
        
        int middle = (size/2)-1;
        
        for (int i=0;i<middle;i++){
            mid = mid.next;
        }
        if (mid.next == null){
            return null;
        }
        mid.next = mid.next.next;
        return head;
    }
}