class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;
        ListNode tracker = head;
        for (int i = 0; i < k; i++) {
            if (tracker == null) return head; 
            tracker = tracker.next;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode nextNode = null;
        for (int i = 0; i < k; i++) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        if (curr != null) {
            head.next = reverseKGroup(curr, k);
        }
        return prev;
    }
}
