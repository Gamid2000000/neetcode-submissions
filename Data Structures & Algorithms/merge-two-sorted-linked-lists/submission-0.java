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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dammy = new ListNode(0);
        ListNode tali = dammy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tali.next = list1;
                list1 = list1.next;
            }
            else{
                tali.next = list2;
                list2 = list2.next;
            }
            tali = tali.next;
        }

        if(list1 != null){
            tali.next = list1;
        }
        else{
            tali.next = list2;
        }

        return dammy.next;
    }
}