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
    public void reorderList(ListNode head) {
               if (head == null || head.next == null){
            return;
        }

        ListNode mid = middleNode(head);

        ListNode hS = reverseList(mid);
        ListNode hF = head;

        // rearrange

        while (hF != null && hS != null){
            ListNode temp = hF.next;
            hF.next = hS;
            hF = temp;

            temp = hS.next;
            hS.next = hF;
            hS = temp;
        }

        if (hF!=null){
            hF.next = null;
        } 
    }
    
    ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
    
    ListNode reverseList(ListNode head) {

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