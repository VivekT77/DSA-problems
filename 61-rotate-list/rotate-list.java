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
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null || head.next==null){
            return head;
        }
        ListNode temp = head;
        int length=1;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        temp.next=head; //after loop ends temp will point to 5 and 5->1(head)

        int rotations = k % length; //if k>length of LL,we will just count the next remainder of k's
        int skip = length-rotations; 
        ListNode newlast = head;
        for(int i=1;i<skip;i++){
            newlast=newlast.next;
        }
        head = newlast.next; //before newlast changes it need to be stored
        newlast.next=null;

        return head;
    }
}