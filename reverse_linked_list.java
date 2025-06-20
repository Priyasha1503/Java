//https://leetcode.com/problems/reverse-linked-list/

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
    public ListNode reverseList(ListNode head) {

        //ListNode is a datatype whoch stores the value of curr and prev..
        //It is user defined datatype

        ListNode prev=null;
        ListNode current=head;
        while (current!=null)
        {
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
        
    }
}
