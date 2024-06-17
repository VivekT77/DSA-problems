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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy =new ListNode(0);//it is crested to handle edge cases and pointed to head
        dummy.next = head;
        ListNode leftprev = dummy; //it is intialize and further iterate till it reach left's prev node 
        ListNode curr = head;
         
        for(int i=0;i<left-1;i++){
            leftprev=leftprev.next;
            curr=curr.next; //it will point to left node
        }
        //reverse the LL process
        ListNode subhead = curr; 
        ListNode prev = null;
        for(int i=0;i<right-left+1;i++){ 
            ListNode Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        leftprev.next = prev; //to change the linkage of 1->4 and 2->5
        subhead.next = curr;
      return dummy.next; // it is pointing to the head which gives the modified list
    }
}