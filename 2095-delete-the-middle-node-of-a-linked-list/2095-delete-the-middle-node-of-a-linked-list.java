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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode temp=head;
        if(temp.next==null){
            return null;
        }
        while(temp!=null && temp.next!=null){
            if(temp.next==slow){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
            
            
        }
        return head;
        
    }
}