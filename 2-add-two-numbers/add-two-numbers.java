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
class Solution{
     //without reversing  the obtained LL
     
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode dummyNode = new ListNode(0);
        ListNode temp = dummyNode;
        while(l1 != null || l2 != null || carry != 0){
            int val1=0;;
            int val2=0;
            if(l1!=null){ 
                val1 = l1.val; 
                l1 = l1.next;
            }  
            if(l2!=null){
                val2 = l2.val;
                l2 = l2.next;
            }
         int total = val1 + val2 + carry;   
         ListNode newnode = new ListNode(total%10); //make new node with the value got from the total
         carry = total/10;      //update the carry
         temp.next=newnode;  //assign the pointers to iterate further initially temp was null
         temp=newnode;
        }

        return dummyNode.next; 
    }
}