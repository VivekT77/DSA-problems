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
    public ListNode deleteMiddle(ListNode head) {
    
    if(head==null || head.next==null){ //base condition
        return null;
    }
    ListNode fast=head; 
//for case1,till the fast reaches null the slow has reach the deleting node and to delete the node we must iterate till previous of the deleting node and if fast=head.next is done then case1 gets fail as it will delete '1'
    fast=head.next.next; 
    ListNode slow = head;
    
    while(fast!=null && fast.next!=null){ //for even and odd nodes respectively
        slow =slow.next;
        fast = fast.next.next;
    }
    slow.next = slow.next.next; // to delete the linkage of the node from its previous
    return head;
    }
}