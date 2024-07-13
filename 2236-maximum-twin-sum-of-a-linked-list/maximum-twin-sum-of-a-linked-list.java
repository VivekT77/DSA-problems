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
        if(head==null){  //BC condition
            return 0;
        }
        int Max=0;
        ListNode mid = getmid(head);  //find mid
        ListNode n_head = reverse(mid);  //reverse the second half and assign the pointers to the head 
        ListNode start=head;        // of both half's LL and add it 

        while(n_head.next!=null){      //till reaches the end of LL
            Max=Math.max(Max,start.val+n_head .val);
            start=start.next;
            n_head =n_head .next;
        }
        return Max;
    }

    public ListNode getmid(ListNode head){
        ListNode slow= head;
        ListNode fast= head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){ //last condition for eg:3
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //it gives the mid of LL
    }

    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}