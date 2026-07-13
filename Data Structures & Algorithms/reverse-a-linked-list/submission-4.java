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
    public ListNode reverseList(ListNode head) {
        ListNode curl = head;
        ListNode prev = null;

        while(curl != null){
            ListNode temp = curl.next;
            curl.next = prev;
            prev = curl;
            curl = temp;
        }
        return prev;
    }
}
