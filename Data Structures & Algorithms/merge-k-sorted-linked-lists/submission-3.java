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

        PriorityQueue<ListNode> min = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode head:lists){
            if(head!=null)
                min.offer(head);
        }
            ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while(!min.isEmpty()){
             ListNode smallestNode = min.poll();
              if (smallestNode.next != null) {
                min.offer(smallestNode.next);
            }
          
            // Append the smallest node to our result list
            cur.next = smallestNode;
            cur = cur.next;
        }
      
        // Return the merged list, skipping the dummy head
        return dummy.next;

        }
    }
