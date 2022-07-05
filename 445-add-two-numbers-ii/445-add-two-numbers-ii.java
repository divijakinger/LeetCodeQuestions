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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        ListNode curr = new ListNode(0);
        ListNode nH = curr;
        int carry = 0;
        
        while (l1!=null || l2!=null || carry != 0){
            int sum = 0;
            if (l1!=null){
                sum += l1.val;
                l1= l1.next;
            }
            if (l2!=null){
                sum += l2.val;
                l2= l2.next;
            }
            
            sum += carry;
            carry = sum/10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        nH = reverseList(nH.next);
        
        return nH;
    }
    
    private ListNode reverseList(ListNode head) {

            if (head == null){
                return head;
            }
            ListNode prev = null;
            ListNode curr = head;
            ListNode next = curr.next;

            while (curr!=null){
                curr.next = prev;
                prev = curr;
                curr = next;
                if (next!=null){
                    next = next.next;
                }
            }

            head = prev;
            return head;
        }
}