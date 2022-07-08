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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer, ListNode> sumToFarthestNodeMap = new HashMap<>();
        
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        
        int sum = 0;
        for (ListNode p = preHead; p != null; p = p.next) {
            sum += p.val;
            sumToFarthestNodeMap.put(sum, p);
        }
        

        sum = 0;
        for (ListNode p = preHead; p != null; p = p.next) {
            sum += p.val;
            p.next = sumToFarthestNodeMap.get(sum).next;
        }

        return preHead.next;
    }
}