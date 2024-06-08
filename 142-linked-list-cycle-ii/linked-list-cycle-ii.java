/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast){      //for this the node is not pointing to the starting node of cycle
                fast=head;       //therefore assign fast or slow to head to again iterate over the LL
            while(fast!=slow){  //if again while iterating fast==slow then it will be start node of cycle
                slow=slow.next;
                fast=fast.next;
            }
            return fast;
          }
        }
        return null;    
    }
}