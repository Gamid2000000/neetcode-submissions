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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();

        for(ListNode ls : lists){
            while(ls != null){
            list.add(ls.val);
            ls = ls.next;
            }
        }

        Collections.sort(list);

        ListNode res = new ListNode(0);
        ListNode les = res;

        for(int node: list){
            les.next = new ListNode(node);
            les = les.next;
        }
        return res.next;
    }
}
