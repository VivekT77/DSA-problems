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
    public ListNode reverseLL(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode Next;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }

    public ListNode getkthnode(ListNode temp,int k){
        k=k-1; //as we starting from 1st node
        while(temp!=null && k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevlast = null; 
        while(temp!=null){
            ListNode kthnode = getkthnode(temp,k);
            if(kthnode==null){
                if(prevlast!=null){ // for remaining nodes which does not have "k" nodes
                    prevlast.next=temp;
                }
                break;
            }
            ListNode nextnode = kthnode.next;
            kthnode.next=null;
            reverseLL(temp);
            if(temp==head){
                head=kthnode;
            }else{
                prevlast.next=kthnode; //last node of prev's group need to be linked next reverse group 
            }
            prevlast = temp;
            temp = nextnode;
        }
        return head;
    }
}