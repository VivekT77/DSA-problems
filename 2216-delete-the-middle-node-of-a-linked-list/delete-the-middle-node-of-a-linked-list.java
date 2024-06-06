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
    int size=0;
    ListNode temp=head;
    while(temp!=null){
        temp=temp.next;
        size++;
    }

    if(size==1){
        return null;
    }

    ListNode prev = head;
    for(int i=1;i<(size/2);i++){ //int i= 1 bcoz [n/2]is given in Q where largest integer is to be taken
        prev = prev.next;
    }
    prev.next = prev.next.next; 
    return head;
    }
}