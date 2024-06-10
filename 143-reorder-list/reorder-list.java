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
    public void reorderList(ListNode head) {
    //find middle
        ListNode slow = head;
        ListNode fast = head.next; // we want mid of left half
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        ListNode mid = slow;
    //revere the 2nd half
        ListNode curr=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode next;

        while(curr!=null){ //4 steps to reverse the LL
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    // Alternate merging
    ListNode LH = head;
    ListNode RH = prev; //FROM ABOVE LOOP curr will be null and prev wull be the last node
    ListNode temp1,temp2;  // to move forward to assign the elements in new LL
    while(LH!=null && RH!=null){  //LL will be in two half's
        temp1=LH.next;          
        LH.next=RH;
        temp2=RH.next;
        RH.next=temp1;

        LH=temp1; //update pointers to move forward from start and end
        RH=temp2;
    }
    }
}