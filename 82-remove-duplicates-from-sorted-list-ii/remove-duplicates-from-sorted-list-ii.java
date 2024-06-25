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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode dummy = new ListNode(-1);     //to store the prev element
       dummy.next = head;              
       ListNode prev = dummy;
       ListNode curr = head;

       while(curr!=null){
            while(curr.next!=null && curr.val==curr.next.val){       //like 3=>3 and 4=>4
                curr=curr.next;     //as curr will move front then only we can point prev to curr's front
            }
            if(prev.next==curr){  //till duplicates get occur we need to move the prev and curr pointer
                prev=prev.next;
            }else{
                prev.next=curr.next;   //if prev does not point to curr normally,then curr has moved 
            }                         //further due to duplicates and we need to cut the duplicates
        curr=curr.next;     
       }
       return dummy.next;
    }
}