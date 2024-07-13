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
    public int pairSum(ListNode head) {  //use hints
                                        // solved using combining all the functions into one
        int Max = 0;
        //find mid to reverse
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }

        //pass that slow which is mid as the head to reverse the second half
        ListNode prev=null;
        while(slow!=null){
           ListNode next = slow.next;
            slow.next=prev;
            prev = slow;
            slow=next;
        }
        //now the prev got from reversing 2nd half LL will be head and act as the 2nd part of the twins
        while(prev !=null){
            Max = Math.max(Max,head.val+prev.val);
            head = head.next;
            prev = prev.next;
        }
        return Max;
    }
}