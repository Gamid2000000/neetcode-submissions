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

    for(ListNode l: lists){
        while(l != null){
            list.add(l.val);
            l = l.next;
        }
    } 

    Collections.sort(list);

    ListNode rec = new ListNode(0);
    ListNode cur = rec;

    for(int node: list){
        cur.next = new ListNode(node);
        cur = cur.next;
    }
    return rec.next;
    }
}
