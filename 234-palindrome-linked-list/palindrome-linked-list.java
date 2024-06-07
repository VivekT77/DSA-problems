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
    //fast and slow approach to find mid
    public ListNode findmid(ListNode head){
            ListNode fast = head;
            ListNode slow = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){ //base condition
            return true;
        }
        //find middle
        ListNode mid= findmid(head);
        
        //revere 2nd half
        ListNode prev=null; //as head's prev will be null
        ListNode curr=mid; //we have to reverse the 2nd half
        while(curr!=null){
            ListNode next =curr.next; //4 steps to reverse the LL
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //compare 1st half and 2nd half after reversing
        ListNode right=prev; //after iterating till end,the last node will be prev and null==curr
        ListNode left=head;
        while(right!=null){
            if(right.val!=left.val){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
}