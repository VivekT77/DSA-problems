/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //change the value of given node to its next node's value & its pointer to the next node's pointer
        node.val=node.next.val;
        node.next=node.next.next;
    }
}