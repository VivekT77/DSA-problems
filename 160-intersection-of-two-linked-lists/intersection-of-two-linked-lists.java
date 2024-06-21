/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode A = headA, B=headB;
        while(A!=B){ //till both head don't get intersect
            if(A!=null){  
                A=A.next; //if its not the last node go further
            }else{
                A=headB;  //otherwise join to the head of "B";
            }
            if(B!=null){ 
                B=B.next;
            }else{
                B=headA;
            }
        }
        return A;
    }
}