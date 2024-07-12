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
     public  ListNode reverse(ListNode head){  //use the same approach like Q(445) just used queue DS
        ListNode temp=head;       //and  reverse the resultant obtained LL bcoz in this carry gets 
        ListNode prev=null; //added in next node while in Q(455) carry used to get added in prev node
        ListNode Next;
        while(temp!=null){
            Next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=Next;

        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> q1 = new LinkedList<>();  //to store the nodes individually in each queue
        Queue<Integer> q2 = new LinkedList<>();

        while(l1!=null){
            q1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            q2.add(l2.val);
            l2=l2.next;
        }
        
        int carry=0;
        ListNode temp=null;
        while(!q1.isEmpty() || !q2.isEmpty() || carry != 0){
            int val1;
            int val2;
            if(!q1.isEmpty()){  //till queue get empty pop the node from each queue & add it with carry
                val1 = q1.remove(); 
            }else{
                val1 = 0;
            }
            if(!q2.isEmpty()){
                val2 = q2.remove();
            }else{
                val2 = 0;
            }
         int total = val1 + val2 + carry;   
         ListNode newnode = new ListNode(total%10); //make new node with the value got from the total
         carry = total/10;      //update the carry
         newnode.next = temp;  //assign the pointers to iterate further initially temp was null
         temp=newnode;
        }

        return reverse(temp); 
    }
}