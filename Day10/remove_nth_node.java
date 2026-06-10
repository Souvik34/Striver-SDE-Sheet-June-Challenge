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
    
   ListNode temp= head;
   ListNode curr=head, prev=null;
   int c=0;
   while(temp!=null)
   {
    c++;
    temp=temp.next;
   }
   int r=c-n+1;
    int s=0;
    if(head== null) return head;
    if(r==1) return head.next;
   while(curr!=null)
   {
    s++;
    if(r==s)
    {
        prev.next=prev.next.next;
        break;
    }
    prev=curr;
    curr=curr.next;

   }
   return head;
       
    }
}