
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/?envType=problem-list-v2&envId=linked-list

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        /*int totalnodes=0;
        ListNode temp=head;
        if(n==1 &&head.next==null)
        return 
        
        while(temp!=null)
        {
            //totalnodes++;
            temp=temp.next;
            totalnodes++;
        }
        temp=head;
        for(int i=0;i<totalnodes-n-1;i++)
        {
            temp=temp.next;
        }
        if(temp.next!=null && temp.next.next!=null)
            temp.next=temp.next.next;
        return head;       
        //this is bruteforce - timecomp o(3n/2)..*/
        ListNode fast=head;
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        ListNode slow = head;
        if(fast==null)
        return head.next; //while we are not having the value to -testcase[1],n=1 //iftotalnodes<n
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        ListNode delnode=slow.next;
        slow.next=slow.next.next;
        return head;
///this is an optimal appraoch using fast and slow pointer...time comp o(n/2)+o(n/2)=o(n) comp

    }
}
