/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        while (headB != null) {
             ListNode temp = headA;
                while (temp != null) {
                    if (temp == headB) {
                        return headB;
                    }
                    temp = temp.next;
                }
                headB = headB.next;
            }
            return null;
    }
}