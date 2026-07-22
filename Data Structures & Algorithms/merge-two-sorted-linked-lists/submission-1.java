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
        ListNode dummy  = new ListNode(-1);
        ListNode X = dummy;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val)
            {
                X.next=list1;
                list1=list1.next;
            }
            else{
                X.next=list2;
                list2=list2.next;
            }
            X = X.next;
            
        }
        if(list1==null)
            X.next=list2;
            if(list2==null)
            X.next=list1;
        return dummy.next;
    }
}