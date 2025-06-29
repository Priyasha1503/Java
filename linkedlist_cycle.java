//https://leetcode.com/problems/linked-list-cycle/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        //USING AST AND SLOW POINTERS
        ListNode fast=head;
        ListNode slow=head;
        if (head==null || head.next==null)
        return false;
        while(fast.next!=null && fast.next.next!=null)
        {

            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            return true;

        }
        return false;
        
    }
}
