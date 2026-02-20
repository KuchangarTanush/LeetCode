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
    public ListNode reverse(ListNode x){
        ListNode curr=x,prev=null,next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }
    public boolean isIdentical(ListNode y,ListNode z){
        while(y!=null && z!=null){
            if(y.val!=z.val){
                return false;
                
            }
            y=y.next;
            z=z.next;
            
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=reverse(slow.next);
        slow.next=null;
        boolean result=isIdentical(head,head2);
        return result;
    }
   
}