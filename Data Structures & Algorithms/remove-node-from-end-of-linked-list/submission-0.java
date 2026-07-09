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
        // Создаем фейковый узел перед head, чтобы было удобно удалять первый элемент
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Запускаем рекурсию
        helper(dummy, n);
        
        return dummy.next;
    }

    // Метод возвращает порядковый номер текущего узла С КОНЦА списка
    private int helper(ListNode node, int n) {
        if (node == null) {
            return 0; // За концом списка находится "нулевой" элемент
        }
        
        // Шагаем дальше вперед до самого конца
        int indexFromEnd = helper(node.next, n);
        
        // Когда мы возвращаемся назад, увеличиваем счетчик на 1
        int currentIdx = indexFromEnd + 1;
        
        // Если следующий узел как раз является n-ым с конца,
        // то текущий узел — это узел ПЕРЕД удаляемым!
        if (currentIdx == n + 1) {
            node.next = node.next.next; // Перебрасываем стрелку, удаляя узел
        }
        
        return currentIdx;
    }
}
