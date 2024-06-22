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
    public ListNode oddEvenList(ListNode head) {
       if(head==null || head.next==null){
        return head;
       } 
       ListNode odd=head;
       ListNode even=head.next;
       ListNode oddhead=odd; //to point starting of odd nodes
       ListNode evenhead=even;  

       while(even!=null && even.next!=null){
        odd.next=even.next; //1=>3
        odd=odd.next;       //odd needs to be updated from 1 to 3 
        even.next=odd.next; //2=>4
        even=even.next;    //even needs to be updated from 2 to 4
       }
       odd.next=evenhead; //to continue the link between odd to even
       return oddhead;
    }
}