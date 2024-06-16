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
    public ListNode reverseList(ListNode head) {
        //iterative approach

        // ListNode prev = null;
        // ListNode curr = head;
        // while(curr!=null){
        //     ListNode next=curr.next;
        //     curr.next=prev;
        //     prev=curr;
        //     curr=next;
        // }
        // return prev;
        
        //recursive approach
        if(head==null || head.next==null){
            return head;
        }

        ListNode newhead = reverseList(head.next); //to start from 2nd node=>2345,345,45,5 like this
        ListNode front = head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
}