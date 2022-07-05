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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode dummyHead = new ListNode(0, temp);
        ListNode pre = dummyHead;
        
        while (temp!=null){
            if (temp.next!= null && temp.val == temp.next.val){
                while (temp.next!= null && temp.val == temp.next.val){
                    temp = temp.next;
                }
                pre.next = temp.next;
            } else {
                pre = pre.next;
            }
            
            temp = temp.next;
        }
        
        return dummyHead.next;
    }
}