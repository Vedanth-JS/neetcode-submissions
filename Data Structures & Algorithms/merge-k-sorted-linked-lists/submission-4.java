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
        Queue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);

        if (lists.length == 0) {
            return null;
        }

        for (ListNode node : lists) {
            queue.offer(node);
        }

        ListNode head = new ListNode();
        ListNode pointer = head;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            pointer.next = node;
            pointer = pointer.next;
            if (node.next != null) {
                queue.offer(node.next);
            }
        }

        return head.next;
    }
}
