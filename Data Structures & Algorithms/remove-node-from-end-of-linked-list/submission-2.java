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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dammy = new ListNode(0);
        dammy.next = head;

        rec(dammy,n);

        return dammy.next;
    }
    private int rec(ListNode node, int n){
        if(node == null){
            return 0;
        }
        int index = rec(node.next, n);
        int idx = index +1;

        if(idx == n+1){
            node.next = node.next.next;
        }
        return idx;
    }
}
