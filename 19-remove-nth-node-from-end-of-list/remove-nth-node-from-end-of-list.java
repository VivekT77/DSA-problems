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
    public ListNode removeNthFromEnd(ListNode head, int n) {

    //we will need size of ll,as we can't traverse back so delete from start i.e size-n+1 node will be 'n'
    int size=0;
    ListNode temp=head;
    while(temp!=null){
        temp=temp.next;
        size++;
    }
    if(n==size){ //delete first case
        head=head.next;
        return head;
    }
//we need previous of the given node which is to be deleted
    ListNode prev = head;
    for(int i=1;i<size-n;i++){ //prev=size-n+1-1 bcoz size-n+1 is given node to delete
        prev = prev.next;
    }
    prev.next = prev.next.next; 
    return head;
    }
}