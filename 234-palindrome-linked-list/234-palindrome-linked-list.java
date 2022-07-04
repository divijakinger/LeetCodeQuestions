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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode headSecond = reverseList(mid);
        ListNode rereverse = headSecond;

        // compare both halves

        while (head != null && headSecond!=null){
            if (head.val != headSecond.val){
                break;
            }

            head = head.next;
            headSecond = headSecond.next;
        }
        return head == null || headSecond == null;
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