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
    public ListNode getmid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next; // for even,two mid nodes possible and we want left half's
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode head1,ListNode head2){
        ListNode mergedll = new ListNode(-1); // new node to start the resultant LL 
        ListNode temp = mergedll;  //to iterate and compare  the nodes from left and right half

        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){  //if small add and move the pointer
                temp.next =head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next =head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        //for remaining nodes after one half gets finished
        while(head1!=null){
            temp.next =head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next =head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedll.next;
    }
    //main function
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        //find middle
        ListNode mid = getmid(head);

        //Merge sort for left and right
        ListNode righthead =mid.next; //to separate left half and right half
        mid.next=null;
        ListNode newleft = sortList(head); //to apply merge sort on left and right half
        ListNode newright = sortList(righthead);
        
        return merge(newleft,newright); 
    }
}