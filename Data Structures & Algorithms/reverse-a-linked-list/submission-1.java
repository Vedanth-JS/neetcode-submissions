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
    ListNode rev(ListNode head){
        if(head ==null ||head.next == null)
            return head;
        ListNode ret = rev(head.next);
        head.next.next = head;
        head.next = null;
        return ret;
    }
    public ListNode reverseList(ListNode head) {
        // ListNode tmp, prev = null, node = head;
        // while(node != null){
        //     tmp = node.next;
        //     node.next = prev;
        //     prev = node;
        //     node = tmp;
        // }
        // return prev;
        return rev(head);
    }
}
