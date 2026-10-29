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
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
            
        }
        temp=head;
        int pos=size-n;
        int count=0;
        if (pos == 0) {
            return head.next;
        }
        while(temp!=null && temp.next!=null){
            
            count++;
            if(count==pos){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return head;

    }
}