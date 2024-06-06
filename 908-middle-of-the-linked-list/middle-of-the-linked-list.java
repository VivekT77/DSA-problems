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
    public ListNode middleNode(ListNode head) {
        // fast and slow approach
        ListNode fast = head;
        ListNode slow = head;
        if(head==null || head.next==null ){ //single node
            return head;
        }
        while(fast!=null && fast.next!=null){ //for even and odd nodes respectively
            slow=slow.next; //+1
            fast= fast.next.next; //+2
        }
        return slow; //it will point to middle node when  fast reaches null
    }
}