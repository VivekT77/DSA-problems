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
    public ListNode mergeNodes(ListNode head) {
        if (head.next == null) { 
            return null;
        }

        ListNode temp=head.next;    //as the head will begin with '0' only 
            int sum=0;
            while(temp.val!=0){     //if not '0' sum it and move forward
                sum +=temp.val;
                temp=temp.next;
            }
            head.next.val=sum;      //assign it to head's next
            head.next.next=mergeNodes(temp);     //perform the same steps from next '0'
            return head.next;
    }
}