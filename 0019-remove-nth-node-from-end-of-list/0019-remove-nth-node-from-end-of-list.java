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
        if(head==null){
            return head;
        }

        ListNode fast=head;
        ListNode last=head;

        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        ListNode pre=null;
        while(fast!=null){
            pre=last;
            fast=fast.next;
            last=last.next;
        }

        if(pre==null){
           return head.next;
        }else{
            pre.next=last.next;
        }

       return head; 
    }
}