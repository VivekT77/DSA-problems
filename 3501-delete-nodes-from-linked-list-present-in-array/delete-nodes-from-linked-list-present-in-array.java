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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> s= new HashSet<>();  //add all the node in the set which need to be deleted
        for(int num:nums){
            s.add(num);
        }

        ListNode dummyNode = new ListNode(0); //make dummy to point the temp to start the LL
        dummyNode.next =head;
        ListNode temp = dummyNode;  //assign temp to dummy bcoz sometime head need to be deleted
        while(temp.next!=null){
            if(s.contains(temp.next.val)){  // if present in set change the linkage
                temp.next =temp.next.next;
            }else{
                temp=temp.next;     //otherwise just iterate
            }
        }
        return dummyNode.next;
    }
}